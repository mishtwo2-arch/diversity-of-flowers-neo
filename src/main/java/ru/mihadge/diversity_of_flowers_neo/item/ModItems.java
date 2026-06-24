package ru.mihadge.diversity_of_flowers_neo.item;

import ru.mihadge.diversity_of_flowers_neo.DiversityOfFlowersNeo;
import ru.mihadge.diversity_of_flowers_neo.Util.IsFoil;
import ru.mihadge.diversity_of_flowers_neo.block.ModBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {





    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(DiversityOfFlowersNeo.MODID);

    public static final DeferredItem<Item> ASTER_DAISY_ITEM =
            ITEMS.register("aster_daisy",
                    () -> new BlockItem(ModBlocks.ASTER_DAISY.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> YELLOW_TULIP_ITEM =
            ITEMS.register("yellow_tulip",
                    () -> new BlockItem(ModBlocks.YELLOW_TULIP.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> YELLOW_POPPY_ITEM =
            ITEMS.register("yellow_poppy",
                    () -> new BlockItem(ModBlocks.YELLOW_POPPY.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> YELLOW_ORCHID_ITEM =
            ITEMS.register("yellow_orchid",
                    () -> new BlockItem(ModBlocks.YELLOW_ORCHID.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> WHITE_POPPY_ITEM =
            ITEMS.register("white_poppy",
                    () -> new BlockItem(ModBlocks.WHITE_POPPY.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> WHITE_ORCHID_ITEM =
            ITEMS.register("white_orchid",
                    () -> new BlockItem(ModBlocks.WHITE_ORCHID.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> WHITE_MYOSOTIS_ITEM =
            ITEMS.register("white_myosotis",
                    () -> new BlockItem(ModBlocks.WHITE_MYOSOTIS.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> WHITE_ALLIUM_ITEM =
            ITEMS.register("white_allium",
                    () -> new BlockItem(ModBlocks.WHITE_ALLIUM.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> PURPLE_TULIP_ITEM =
            ITEMS.register("purple_tulip",
                    () -> new BlockItem(ModBlocks.PURPLE_TULIP.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> PURPLE_ORCHID_ITEM =
            ITEMS.register("purple_orchid",
                    () -> new BlockItem(ModBlocks.PURPLE_ORCHID.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> PINK_POPPY_ITEM =
            ITEMS.register("pink_poppy",
                    () -> new BlockItem(ModBlocks.PINK_POPPY.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> PINK_ORCHID_ITEM =
            ITEMS.register("pink_orchid",
                    () -> new BlockItem(ModBlocks.PINK_ORCHID.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> PINK_MYOSOTIS_ITEM =
            ITEMS.register("pink_myosotis",
                    () -> new BlockItem(ModBlocks.PINK_MYOSOTIS.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> ORANGE_POPPY_ITEM =
            ITEMS.register("orange_poppy",
                    () -> new BlockItem(ModBlocks.ORANGE_POPPY.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> GLORIOSA_DAISY_ITEM =
            ITEMS.register("gloriosa_daisy",
                    () -> new BlockItem(ModBlocks.GLORIOSA_DAISY.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> BLUE_TULIP_ITEM =
            ITEMS.register("blue_tulip",
                    () -> new BlockItem(ModBlocks.BLUE_TULIP.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> BLUE_MYOSOTIS_ITEM =
            ITEMS.register("blue_myosotis",
                    () -> new BlockItem(ModBlocks.BLUE_MYOSOTIS.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> BLUE_ALLIUM_ITEM =
            ITEMS.register("blue_allium",
                    () -> new BlockItem(ModBlocks.BLUE_ALLIUM.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> SNOW_DANDELION_ITEM =
            ITEMS.register("snow_dandelion",
                    () -> new BlockItem(ModBlocks.SNOW_DANDELION.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> BLACK_TULIP_ITEM =
            ITEMS.register("black_tulip",
                    () -> new BlockItem(ModBlocks.BLACK_TULIP.get(), new Item.Properties())
            );

    public static final DeferredItem<Item> YELLOW_ROSE_BUSH_ITEM =
            ITEMS.register("yellow_rose_bush",
                    () -> new BlockItem(ModBlocks.YELLOW_ROSE_BUSH.get(), new Item.Properties()));

    public static final DeferredItem<Item> ASHEN_SAGE_ITEM =
            ITEMS.register("ashen_sage",
                    () -> new BlockItem(ModBlocks.ASHEN_SAGE.get(), new Item.Properties()));

    public static final DeferredItem<Item> WHITE_PEONY_ITEM =
            ITEMS.register("white_peony",
                    () -> new BlockItem(ModBlocks.WHITE_PEONY.get(), new Item.Properties()));

    public static final DeferredItem<Item> GOLDEN_SAGE_ITEM =
            ITEMS.register("golden_sage",
                    () -> new BlockItem(ModBlocks.GOLDEN_SAGE.get(), new Item.Properties()));

    public static final DeferredItem<Item> WHITE_ROSE_BUSH_ITEM =
            ITEMS.register("white_rose_bush",
                    () -> new BlockItem(ModBlocks.WHITE_ROSE_BUSH.get(), new Item.Properties()));

    public static final DeferredItem<Item> MAGENTA_ROSE_BUSH_ITEM =
            ITEMS.register("magenta_rose_bush",
                    () -> new BlockItem(ModBlocks.MAGENTA_ROSE_BUSH.get(), new Item.Properties()));

    public static final DeferredItem<Item> VIOLET_SAGE_ITEM =
            ITEMS.register("violet_sage",
                    () -> new BlockItem(ModBlocks.VIOLET_SAGE.get(), new Item.Properties()));

    public static final DeferredItem<Item> AZURE_SAGE_ITEM =
            ITEMS.register("azure_sage",
                    () -> new BlockItem(ModBlocks.AZURE_SAGE.get(), new Item.Properties()));

    public static final DeferredItem<Item> PURPLE_ROSE_BUSH_ITEM =
            ITEMS.register("purple_rose_bush",
                    () -> new BlockItem(ModBlocks.PURPLE_ROSE_BUSH.get(), new Item.Properties()));

    public static final DeferredItem<Item> SCARLET_SAGE_ITEM =
            ITEMS.register("scarlet_sage",
                    () -> new BlockItem(ModBlocks.SCARLET_SAGE.get(), new Item.Properties()));

    public static final DeferredItem<Item> RED_PEONY_ITEM =
            ITEMS.register("red_peony",
                    () -> new BlockItem(ModBlocks.RED_PEONY.get(), new Item.Properties()));

    public static final DeferredItem<Item> PINK_ROSE_BUSH_ITEM =
            ITEMS.register("pink_rose_bush",
                    () -> new BlockItem(ModBlocks.PINK_ROSE_BUSH.get(), new Item.Properties()));

    public static final DeferredItem<Item> PINK_PEONY_ITEM =
            ITEMS.register("pink_peony",
                    () -> new BlockItem(ModBlocks.PINK_PEONY.get(), new Item.Properties()));

    public static final DeferredItem<Item> ORANGE_ROSE_BUSH_ITEM =
            ITEMS.register("orange_rose_bush",
                    () -> new BlockItem(ModBlocks.ORANGE_ROSE_BUSH.get(), new Item.Properties()));

    public static final DeferredItem<Item> MOONFLOWER_ITEM =
            ITEMS.register("moonflower",
                    () -> new BlockItem(ModBlocks.MOONFLOWER.get(), new Item.Properties()));


    public static final DeferredItem<Item> PURPLE_ANEMONE_ITEM =
            ITEMS.register("purple_anemone",
                    () -> new BlockItem(ModBlocks.PURPLE_ANEMONE.get(), new Item.Properties()));

    public static final DeferredItem<Item> PEACH_ANEMONE_ITEM =
            ITEMS.register("peach_anemone",
                    () -> new BlockItem(ModBlocks.PEACH_ANEMONE.get(), new Item.Properties()));

    public static final DeferredItem<Item> NIGHT_ANEMONE_ITEM =
            ITEMS.register("night_anemone",
                    () -> new BlockItem(ModBlocks.NIGHT_ANEMONE.get(), new Item.Properties()));

    public static final DeferredItem<Item> PINK_ANEMONE_ITEM =
            ITEMS.register("pink_anemone",
                    () -> new BlockItem(ModBlocks.PINK_ANEMONE.get(), new Item.Properties()));

    public static final DeferredItem<Item> TURQUOISE_ANEMONE_ITEM =
            ITEMS.register("turquoise_anemone",
                    () -> new BlockItem(ModBlocks.TURQUOISE_ANEMONE.get(), new Item.Properties()));

    public static final DeferredItem<Item> YELLOW_ANEMONE_ITEM =
            ITEMS.register("yellow_anemone",
                    () -> new BlockItem(ModBlocks.YELLOW_ANEMONE.get(), new Item.Properties()));

    public static final DeferredItem<Item> ALMIUS_ITEM =
            ITEMS.register("almius",
                    () -> new BlockItem(ModBlocks.ALMIUS.get(), new Item.Properties()));

    public static final DeferredItem<Item> BLUE_PERIWINKLE_ITEM =
            ITEMS.register("blue_periwinkle",
                    () -> new BlockItem(ModBlocks.BLUE_PERIWINKLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> HEART_FLOWER_ITEM =
            ITEMS.register("heart_flower",
                    () -> new BlockItem(
                            ModBlocks.HEART_FLOWER.get(),
                            new Item.Properties().food(
                                    new FoodProperties.Builder()
                                            .nutrition(0)
                                            .saturationModifier(0.2F)
                                            .effect(() -> new MobEffectInstance(
                                                    MobEffects.REGENERATION,
                                                    44 * 20,
                                                    1
                                            ), 1.0F)
                                            .alwaysEdible()
                                            .build()
                            )
                    ));

    public static final DeferredItem<Item> PURPLE_PERIWINKLE_ITEM =
            ITEMS.register("purple_periwinkle",
                    () -> new BlockItem(ModBlocks.PURPLE_PERIWINKLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> RED_PERIWINKLE_ITEM =
            ITEMS.register("red_periwinkle",
                    () -> new BlockItem(ModBlocks.RED_PERIWINKLE.get(), new Item.Properties()));

    public static final DeferredItem<Item> RED_FAGUSA_ITEM =
            ITEMS.register("red_fagusa",
                    () -> new BlockItem(ModBlocks.RED_FAGUSA.get(), new Item.Properties()));

    public static final DeferredItem<Item> BLUE_FAGUSA_ITEM =
            ITEMS.register("blue_fagusa",
                    () -> new BlockItem(ModBlocks.BLUE_FAGUSA.get(), new Item.Properties()));

    public static final DeferredItem<Item> GREEN_FAGUSA_ITEM =
            ITEMS.register("green_fagusa",
                    () -> new BlockItem(ModBlocks.GREEN_FAGUSA.get(), new Item.Properties()));

    public static final DeferredItem<Item> WATER_KERALIY_ITEM =
            ITEMS.register("water_keraliy",
                    () -> new BlockItem(ModBlocks.WATER_KERALIY.get(), new Item.Properties()));

    public static final DeferredItem<Item> MOON_STAR_ITEM =
            ITEMS.register("moon_star",
                    () -> new IsFoil(new Item.Properties()));

    public static final DeferredItem<Item> ABYSS_ITEM =
            ITEMS.register( "abyss",
                    () -> new BlockItem(ModBlocks.ABYSS.get(), new Item.Properties()));

    public static final DeferredItem<Item> ABYSS_S_SPROUT_ITEM =
            ITEMS.register( "abyss_s_sprout",
                    () -> new BlockItem(ModBlocks.ABYSS_S_SPROUT.get(), new Item.Properties()));

    public static final DeferredItem<Item> ECLIPSE_ITEM =
            ITEMS.register( "eclipse",
                    () -> new BlockItem(ModBlocks.ECLIPSE .get(), new Item.Properties()));

    public static final DeferredItem<Item> BLUE_KIZ_ITEM =
            ITEMS.register( "blue_kiz",
                    () -> new BlockItem(ModBlocks.BLUE_KIZ .get(), new Item.Properties()));

    public static final DeferredItem<Item> DAURIN_ITEM =
            ITEMS.register( "daurin",
                    () -> new BlockItem(ModBlocks.DAURIN .get(), new Item.Properties()));


    public static final DeferredItem<Item> CHRISTALIT_ITEM =
            ITEMS.register( "christalit",
                    () -> new BlockItem(ModBlocks.CHRISTALIT .get(), new Item.Properties()));


    public static final DeferredItem<Item> FROIDEUR_ITEM =
            ITEMS.register( "froideur",
                    () -> new BlockItem(ModBlocks.FROIDEUR .get(), new Item.Properties()));


    public static final DeferredItem<Item> MOUNTAIN_CORNFLOWER_ITEM =
            ITEMS.register( "mountain_cornflower",
                    () -> new BlockItem(ModBlocks.MOUNTAIN_CORNFLOWER .get(), new Item.Properties()));

    public static final DeferredItem<Item> SCARLET_ROSE_ITEM =
            ITEMS.register( "scarlet_rose",
                    () -> new BlockItem(ModBlocks.SCARLET_ROSE .get(), new Item.Properties()));



    public static final DeferredItem<Item> TEST_ITEM =
            ITEMS.register("test",
                    () -> new BlockItem(ModBlocks.TEST.get(), new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    }
