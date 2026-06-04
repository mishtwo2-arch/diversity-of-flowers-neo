package ru.mihadge.diversity_of_flowers_neo.item;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class ModTabs {

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

            event.accept(ModItems.ASTER_DAISY_ITEM);
            event.accept(ModItems.YELLOW_TULIP_ITEM);
            event.accept(ModItems.YELLOW_POPPY_ITEM);
            event.accept(ModItems.YELLOW_ORCHID_ITEM);
            event.accept(ModItems.WHITE_POPPY_ITEM);
            event.accept(ModItems.WHITE_ORCHID_ITEM);
            event.accept(ModItems.WHITE_MYOSOTIS_ITEM);
            event.accept(ModItems.WHITE_ALLIUM_ITEM);
            event.accept(ModItems.PURPLE_TULIP_ITEM);
            event.accept(ModItems.PURPLE_ORCHID_ITEM);
            event.accept(ModItems.PINK_POPPY_ITEM);
            event.accept(ModItems.PINK_ORCHID_ITEM);
            event.accept(ModItems.PINK_MYOSOTIS_ITEM);
            event.accept(ModItems.ORANGE_POPPY_ITEM);
            event.accept(ModItems.GLORIOSA_DAISY_ITEM);
            event.accept(ModItems.BLUE_TULIP_ITEM);
            event.accept(ModItems.BLUE_MYOSOTIS_ITEM);
            event.accept(ModItems.BLUE_ALLIUM_ITEM);
            event.accept(ModItems.SNOW_DANDELION_ITEM);
            event.accept(ModItems.BLACK_TULIP_ITEM);

            event.accept(ModItems.PURPLE_ANEMONE_ITEM);
            event.accept(ModItems.PEACH_ANEMONE_ITEM);
            event.accept(ModItems.NIGHT_ANEMONE_ITEM);
            event.accept(ModItems.PINK_ANEMONE_ITEM);
            event.accept(ModItems.TURQUOISE_ANEMONE_ITEM);
            event.accept(ModItems.YELLOW_ANEMONE_ITEM);


            event.accept(ModItems.YELLOW_ROSE_BUSH_ITEM);
            event.accept(ModItems.ASHEN_SAGE_ITEM);
            event.accept(ModItems.WHITE_PEONY_ITEM);
            event.accept(ModItems.GOLDEN_SAGE_ITEM);
            event.accept(ModItems.WHITE_ROSE_BUSH_ITEM);
            event.accept(ModItems.MAGENTA_ROSE_BUSH_ITEM);
            event.accept(ModItems.VIOLET_SAGE_ITEM);
            event.accept(ModItems.AZURE_SAGE_ITEM);
            event.accept(ModItems.PURPLE_ROSE_BUSH_ITEM);
            event.accept(ModItems.SCARLET_SAGE_ITEM);
            event.accept(ModItems.RED_PEONY_ITEM);
            event.accept(ModItems.PINK_ROSE_BUSH_ITEM);
            event.accept(ModItems.PINK_PEONY_ITEM);
            event.accept(ModItems.ORANGE_ROSE_BUSH_ITEM);
            event.accept(ModItems.MOONFLOWER_ITEM);
        }
    }
}