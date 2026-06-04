package ru.mihadge.diversity_of_flowers_neo;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

import java.util.Set;

@EventBusSubscriber(modid = "diversity_of_flowers_neo")
public class RiverFlowerTracker {

    private static final Set<String> RIVER_FLOWERS = Set.of(
            "diversity_of_flowers_neo:azure_sage",
            "diversity_of_flowers_neo:turquoise_anemone",
            "diversity_of_flowers_neo:water_keraliy"
    );

    private static final ResourceLocation ADV_ID =
            ResourceLocation.parse("diversity_of_flowers_neo:river_flowers");

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {

        if (!(event.getEntity() instanceof ServerPlayer player)) return;
        if (player.level().isClientSide) return;

        var adv = player.server.getAdvancements().get(ADV_ID);

        if (adv == null) return;

        var progress = player.getAdvancements().getOrStartProgress(adv);

        for (String id : RIVER_FLOWERS) {

            ResourceLocation target = ResourceLocation.parse(id);

            boolean hasItem = false;

            for (ItemStack stack : player.getInventory().items) {

                if (stack.isEmpty()) continue;

                ResourceLocation rl =
                        BuiltInRegistries.ITEM.getKey(stack.getItem());

                if (rl != null && rl.equals(target)) {
                    hasItem = true;
                    break;
                }
            }


            if (!hasItem) {
                for (ItemStack stack : player.getInventory().offhand) {

                    if (stack.isEmpty()) continue;

                    ResourceLocation rl =
                            BuiltInRegistries.ITEM.getKey(stack.getItem());

                    if (rl != null && rl.equals(target)) {
                        hasItem = true;
                        break;
                    }
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

