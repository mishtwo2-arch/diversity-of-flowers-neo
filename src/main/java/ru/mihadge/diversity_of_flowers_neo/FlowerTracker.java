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
public class FlowerTracker {

    private static final Set<String> FLOWERS = Set.of(
            "diversity_of_flowers_neo:aster_daisy",
            "diversity_of_flowers_neo:yellow_tulip",
            "diversity_of_flowers_neo:yellow_poppy",
            "diversity_of_flowers_neo:yellow_orchid",
            "diversity_of_flowers_neo:white_poppy",
            "diversity_of_flowers_neo:white_orchid",
            "diversity_of_flowers_neo:white_myosotis",
            "diversity_of_flowers_neo:white_allium",
            "diversity_of_flowers_neo:purple_tulip",
            "diversity_of_flowers_neo:purple_orchid",
            "diversity_of_flowers_neo:pink_poppy",
            "diversity_of_flowers_neo:pink_orchid",
            "diversity_of_flowers_neo:pink_myosotis",
            "diversity_of_flowers_neo:orange_poppy",
            "diversity_of_flowers_neo:gloriosa_daisy",
            "diversity_of_flowers_neo:blue_tulip",
            "diversity_of_flowers_neo:blue_myosotis",
            "diversity_of_flowers_neo:blue_allium",
            "diversity_of_flowers_neo:black_tulip",
            "diversity_of_flowers_neo:yellow_rose_bush",
            "diversity_of_flowers_neo:white_peony",
            "diversity_of_flowers_neo:golden_sage",
            "diversity_of_flowers_neo:white_rose_bush",
            "diversity_of_flowers_neo:magenta_rose_bush",
            "diversity_of_flowers_neo:violet_sage",
            "diversity_of_flowers_neo:azure_sage",
            "diversity_of_flowers_neo:purple_rose_bush",
            "diversity_of_flowers_neo:scarlet_sage",
            "diversity_of_flowers_neo:red_peony",
            "diversity_of_flowers_neo:pink_rose_bush",
            "diversity_of_flowers_neo:pink_peony",
            "diversity_of_flowers_neo:orange_rose_bush",
            "diversity_of_flowers_neo:purple_anemone",
            "diversity_of_flowers_neo:peach_anemone",
            "diversity_of_flowers_neo:night_anemone",
            "diversity_of_flowers_neo:pink_anemone",
            "diversity_of_flowers_neo:yellow_anemone",

            "diversity_of_flowers_neo:ashen_sage",

            "diversity_of_flowers_neo:red_fagusa",
            "diversity_of_flowers_neo:blue_fagusa",
            "diversity_of_flowers_neo:green_fagusa",
            "diversity_of_flowers_neo:purple_periwinkle",
            "diversity_of_flowers_neo:red_periwinkle",
            "diversity_of_flowers_neo:blue_periwinkle"
    );

    private static final ResourceLocation ADV_ID =
            ResourceLocation.parse("diversity_of_flowers_neo:almost_there");

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