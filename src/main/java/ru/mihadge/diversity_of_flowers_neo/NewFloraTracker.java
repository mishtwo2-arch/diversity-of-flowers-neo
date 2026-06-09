package ru.mihadge.diversity_of_flowers_neo;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

import java.util.Set;

@EventBusSubscriber(modid = "diversity_of_flowers_neo")
public class NewFloraTracker {

    private static final Set<String> FLOWERS = Set.of(
            "diversity_of_flowers_neo:abyss",
            "diversity_of_flowers_neo:abyss_s_sprout"
    );

    private static final ResourceLocation ADV_ID =
            ResourceLocation.parse("diversity_of_flowers_neo:new_flora");

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {

        if (!(event.getEntity() instanceof ServerPlayer player)) return;
        if (player.level().isClientSide) return;

        CompoundTag data = player.getPersistentData();

        CompoundTag tag;
        if (!data.contains("flowers_collected")) {
            tag = new CompoundTag();
            data.put("flowers_collected", tag);
        } else {
            tag = data.getCompound("flowers_collected");
        }

        var adv = player.server.getAdvancements().get(ADV_ID);
        if (adv == null) return;

        var progress = player.getAdvancements().getOrStartProgress(adv);

        for (String id : FLOWERS) {

            ResourceLocation target = ResourceLocation.parse(id);

            boolean hasItem = false;

            for (ItemStack stack : player.getInventory().items) {

                if (stack.isEmpty()) continue;

                ResourceLocation rl = BuiltInRegistries.ITEM.getKey(stack.getItem());

                if (rl != null && rl.equals(target)) {
                    hasItem = true;
                    break;
                }
            }

            if (hasItem) {

                String criterion =
                        id.substring(id.indexOf(":") + 1);

                boolean canAward = false;

                for (String c : progress.getRemainingCriteria()) {
                    if (c.equals(criterion)) {
                        canAward = true;
                        break;
                    }
                }

                if (canAward &&
                        !player.getAdvancements()
                                .getOrStartProgress(adv)
                                .getCriterion(criterion)
                                .isDone()) {

                    player.getAdvancements().award(adv, criterion);

                    System.out.println(
                            "Awarded criterion: " + criterion
                    );
                }
            }
        }
    }
}
