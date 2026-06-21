package ru.mihadge.diversity_of_flowers_neo.item;

import ru.mihadge.diversity_of_flowers_neo.DiversityOfFlowersNeo;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DiversityOfFlowersNeo.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FABULOUS_FLOWERS_TAB =
            CREATIVE_MODE_TABS.register("diversity_of_flowers_neo", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.diversity_of_flowers_neo"))
                    .icon(() -> ModItems.PURPLE_ANEMONE_ITEM.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.ASTER_DAISY_ITEM);
                        output.accept(ModItems.YELLOW_TULIP_ITEM);
                        output.accept(ModItems.YELLOW_POPPY_ITEM);
                        output.accept(ModItems.YELLOW_ORCHID_ITEM);
                        output.accept(ModItems.WHITE_POPPY_ITEM);
                        output.accept(ModItems.WHITE_ORCHID_ITEM);
                        output.accept(ModItems.WHITE_MYOSOTIS_ITEM);
                        output.accept(ModItems.WHITE_ALLIUM_ITEM);
                        output.accept(ModItems.PURPLE_TULIP_ITEM);
                        output.accept(ModItems.PURPLE_ORCHID_ITEM);
                        output.accept(ModItems.PINK_POPPY_ITEM);
                        output.accept(ModItems.PINK_ORCHID_ITEM);
                        output.accept(ModItems.PINK_MYOSOTIS_ITEM);
                        output.accept(ModItems.ORANGE_POPPY_ITEM);
                        output.accept(ModItems.GLORIOSA_DAISY_ITEM);
                        output.accept(ModItems.BLUE_TULIP_ITEM);
                        output.accept(ModItems.BLUE_MYOSOTIS_ITEM);
                        output.accept(ModItems.BLUE_ALLIUM_ITEM);
                        output.accept(ModItems.SNOW_DANDELION_ITEM);
                        output.accept(ModItems.BLACK_TULIP_ITEM);

                        output.accept(ModItems.PURPLE_ANEMONE_ITEM);
                        output.accept(ModItems.PEACH_ANEMONE_ITEM);
                        output.accept(ModItems.NIGHT_ANEMONE_ITEM);
                        output.accept(ModItems.PINK_ANEMONE_ITEM);
                        output.accept(ModItems.TURQUOISE_ANEMONE_ITEM);
                        output.accept(ModItems.YELLOW_ANEMONE_ITEM);
                        output.accept(ModItems.ALMIUS_ITEM);
                        output.accept(ModItems.BLUE_PERIWINKLE_ITEM);
                        output.accept(ModItems.HEART_FLOWER_ITEM);
                        output.accept(ModItems.PURPLE_PERIWINKLE_ITEM);
                        output.accept(ModItems.RED_PERIWINKLE_ITEM);
                        output.accept(ModItems.RED_FAGUSA_ITEM);
                        output.accept(ModItems.BLUE_FAGUSA_ITEM);
                        output.accept(ModItems.GREEN_FAGUSA_ITEM);
                        output.accept(ModItems.WATER_KERALIY_ITEM);
                        output.accept(ModItems.BLUE_KIZ_ITEM);
                        output.accept(ModItems.DAURIN_ITEM);
                        output.accept(ModItems.CHRISTALIT_ITEM);
                        output.accept(ModItems.FROIDEUR_ITEM);
                        output.accept(ModItems.MOUNTAIN_CORNFLOWER_ITEM);

                        output.accept(ModItems.TEST_ITEM);

                        output.accept(ModItems.YELLOW_ROSE_BUSH_ITEM);
                        output.accept(ModItems.ASHEN_SAGE_ITEM);
                        output.accept(ModItems.WHITE_PEONY_ITEM);
                        output.accept(ModItems.GOLDEN_SAGE_ITEM);
                        output.accept(ModItems.WHITE_ROSE_BUSH_ITEM);
                        output.accept(ModItems.MAGENTA_ROSE_BUSH_ITEM);
                        output.accept(ModItems.VIOLET_SAGE_ITEM);
                        output.accept(ModItems.AZURE_SAGE_ITEM);
                        output.accept(ModItems.PURPLE_ROSE_BUSH_ITEM);
                        output.accept(ModItems.SCARLET_SAGE_ITEM);
                        output.accept(ModItems.RED_PEONY_ITEM);
                        output.accept(ModItems.PINK_ROSE_BUSH_ITEM);
                        output.accept(ModItems.PINK_PEONY_ITEM);
                        output.accept(ModItems.ORANGE_ROSE_BUSH_ITEM);
                        output.accept(ModItems.MOONFLOWER_ITEM);

                        //output.accept(ModItems.ABYSS_ITEM);
                        //output.accept(ModItems.ABYSS_S_SPROUT_ITEM);
                        //output.accept(ModItems.ECLIPSE_ITEM);

                    })
                    .build());

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

