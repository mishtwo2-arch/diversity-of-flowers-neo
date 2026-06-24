package ru.mihadge.diversity_of_flowers_neo.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
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
import java.util.List;

public class ModItems {


    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(DiversityOfFlowersNeo.MODID);

    public static final DeferredItem<BlockItem> ASTER_DAISY_ITEM =
            ITEMS.registerSimpleBlockItem("aster_daisy",
            ModBlocks.ASTER_DAISY
            );

    public static final DeferredItem<BlockItem> YELLOW_TULIP_ITEM =
            ITEMS.registerSimpleBlockItem("yellow_tulip",
            ModBlocks.YELLOW_TULIP
            );

    public static final DeferredItem<BlockItem> YELLOW_POPPY_ITEM =
            ITEMS.registerSimpleBlockItem("yellow_poppy",
            ModBlocks.YELLOW_POPPY
            );

    public static final DeferredItem<BlockItem> YELLOW_ORCHID_ITEM =
            ITEMS.registerSimpleBlockItem("yellow_orchid",
            ModBlocks.YELLOW_ORCHID
            );

    public static final DeferredItem<BlockItem> WHITE_POPPY_ITEM =
            ITEMS.registerSimpleBlockItem("white_poppy",
            ModBlocks.WHITE_POPPY
            );

    public static final DeferredItem<BlockItem> WHITE_ORCHID_ITEM =
            ITEMS.registerSimpleBlockItem("white_orchid",
            ModBlocks.WHITE_ORCHID
            );

    public static final DeferredItem<BlockItem> WHITE_MYOSOTIS_ITEM =
            ITEMS.registerSimpleBlockItem("white_myosotis",
            ModBlocks.WHITE_MYOSOTIS
            );

    public static final DeferredItem<BlockItem> WHITE_ALLIUM_ITEM =
            ITEMS.registerSimpleBlockItem("white_allium",
            ModBlocks.WHITE_ALLIUM
            );

    public static final DeferredItem<BlockItem> PURPLE_TULIP_ITEM =
            ITEMS.registerSimpleBlockItem("purple_tulip",
            ModBlocks.PURPLE_TULIP
            );

    public static final DeferredItem<BlockItem> PURPLE_ORCHID_ITEM =
            ITEMS.registerSimpleBlockItem("purple_orchid",
            ModBlocks.PURPLE_ORCHID
            );

    public static final DeferredItem<BlockItem> PINK_POPPY_ITEM =
            ITEMS.registerSimpleBlockItem("pink_poppy",
            ModBlocks.PINK_POPPY
            );

    public static final DeferredItem<BlockItem> PINK_ORCHID_ITEM =
            ITEMS.registerSimpleBlockItem("pink_orchid",
            ModBlocks.PINK_ORCHID
            );

    public static final DeferredItem<BlockItem> PINK_MYOSOTIS_ITEM =
            ITEMS.registerSimpleBlockItem("pink_myosotis",
            ModBlocks.PINK_MYOSOTIS
            );

    public static final DeferredItem<BlockItem> ORANGE_POPPY_ITEM =
            ITEMS.registerSimpleBlockItem("orange_poppy",
            ModBlocks.ORANGE_POPPY
            );

    public static final DeferredItem<BlockItem> GLORIOSA_DAISY_ITEM =
            ITEMS.registerSimpleBlockItem("gloriosa_daisy",
            ModBlocks.GLORIOSA_DAISY
            );

    public static final DeferredItem<BlockItem> BLUE_TULIP_ITEM =
            ITEMS.registerSimpleBlockItem("blue_tulip",
            ModBlocks.BLUE_TULIP
            );

    public static final DeferredItem<BlockItem> BLUE_MYOSOTIS_ITEM =
            ITEMS.registerSimpleBlockItem("blue_myosotis",
            ModBlocks.BLUE_MYOSOTIS
            );

    public static final DeferredItem<BlockItem> BLUE_ALLIUM_ITEM =
            ITEMS.registerSimpleBlockItem("blue_allium",
            ModBlocks.BLUE_ALLIUM
            );

    public static final DeferredItem<BlockItem> SNOW_DANDELION_ITEM =
            ITEMS.registerSimpleBlockItem("snow_dandelion",
            ModBlocks.SNOW_DANDELION
            );

    public static final DeferredItem<BlockItem> BLACK_TULIP_ITEM =
            ITEMS.registerSimpleBlockItem("black_tulip",
            ModBlocks.BLACK_TULIP
            );

    public static final DeferredItem<BlockItem> YELLOW_ROSE_BUSH_ITEM =
            ITEMS.registerSimpleBlockItem("yellow_rose_bush",
            ModBlocks.YELLOW_ROSE_BUSH
            );

    public static final DeferredItem<BlockItem> ASHEN_SAGE_ITEM =
            ITEMS.registerSimpleBlockItem("ashen_sage",
            ModBlocks.ASHEN_SAGE
            );

    public static final DeferredItem<BlockItem> WHITE_PEONY_ITEM =
            ITEMS.registerSimpleBlockItem("white_peony",
            ModBlocks.WHITE_PEONY
            );

    public static final DeferredItem<BlockItem> GOLDEN_SAGE_ITEM =
            ITEMS.registerSimpleBlockItem("golden_sage",
            ModBlocks.GOLDEN_SAGE
            );

    public static final DeferredItem<BlockItem> WHITE_ROSE_BUSH_ITEM =
            ITEMS.registerSimpleBlockItem("white_rose_bush",
            ModBlocks.WHITE_ROSE_BUSH
            );

    public static final DeferredItem<BlockItem> MAGENTA_ROSE_BUSH_ITEM =
            ITEMS.registerSimpleBlockItem("magenta_rose_bush",
            ModBlocks.MAGENTA_ROSE_BUSH
            );

    public static final DeferredItem<BlockItem> VIOLET_SAGE_ITEM =
            ITEMS.registerSimpleBlockItem("violet_sage",
            ModBlocks.VIOLET_SAGE
            );

    public static final DeferredItem<BlockItem> AZURE_SAGE_ITEM =
            ITEMS.registerSimpleBlockItem("azure_sage",
            ModBlocks.AZURE_SAGE
            );

    public static final DeferredItem<BlockItem> PURPLE_ROSE_BUSH_ITEM =
            ITEMS.registerSimpleBlockItem("purple_rose_bush",
            ModBlocks.PURPLE_ROSE_BUSH
            );

    public static final DeferredItem<BlockItem> SCARLET_SAGE_ITEM =
            ITEMS.registerSimpleBlockItem("scarlet_sage",
            ModBlocks.SCARLET_SAGE
            );

    public static final DeferredItem<BlockItem> RED_PEONY_ITEM =
            ITEMS.registerSimpleBlockItem("red_peony",
            ModBlocks.RED_PEONY
            );

    public static final DeferredItem<BlockItem> PINK_ROSE_BUSH_ITEM =
            ITEMS.registerSimpleBlockItem("pink_rose_bush",
            ModBlocks.PINK_ROSE_BUSH
            );

    public static final DeferredItem<BlockItem> PINK_PEONY_ITEM =
            ITEMS.registerSimpleBlockItem("pink_peony",
            ModBlocks.PINK_PEONY
            );

    public static final DeferredItem<BlockItem> ORANGE_ROSE_BUSH_ITEM =
            ITEMS.registerSimpleBlockItem("orange_rose_bush",
            ModBlocks.ORANGE_ROSE_BUSH
            );

    public static final DeferredItem<BlockItem> MOONFLOWER_ITEM =
            ITEMS.registerSimpleBlockItem("moonflower",
            ModBlocks.MOONFLOWER
            );


    public static final DeferredItem<BlockItem> PURPLE_ANEMONE_ITEM =
            ITEMS.registerSimpleBlockItem("purple_anemone",
            ModBlocks.PURPLE_ANEMONE
            );

    public static final DeferredItem<BlockItem> PEACH_ANEMONE_ITEM =
            ITEMS.registerSimpleBlockItem("peach_anemone",
           ModBlocks.PEACH_ANEMONE
            );

    public static final DeferredItem<BlockItem> NIGHT_ANEMONE_ITEM =
            ITEMS.registerSimpleBlockItem("night_anemone",
            ModBlocks.NIGHT_ANEMONE
            );

    public static final DeferredItem<BlockItem> PINK_ANEMONE_ITEM =
            ITEMS.registerSimpleBlockItem("pink_anemone",
            ModBlocks.PINK_ANEMONE
            );

    public static final DeferredItem<BlockItem> TURQUOISE_ANEMONE_ITEM =
            ITEMS.registerSimpleBlockItem("turquoise_anemone",
            ModBlocks.TURQUOISE_ANEMONE
            );

    public static final DeferredItem<BlockItem> YELLOW_ANEMONE_ITEM =
            ITEMS.registerSimpleBlockItem("yellow_anemone",
            ModBlocks.YELLOW_ANEMONE
            );

    public static final DeferredItem<BlockItem> ALMIUS_ITEM =
            ITEMS.registerSimpleBlockItem("almius",
            ModBlocks.ALMIUS
            );

    public static final DeferredItem<BlockItem> BLUE_PERIWINKLE_ITEM =
            ITEMS.registerSimpleBlockItem("blue_periwinkle",
            ModBlocks.BLUE_PERIWINKLE
            );

    public static final DeferredItem<BlockItem> HEART_FLOWER_ITEM =
            ITEMS.registerSimpleBlockItem("heart_flower",
                    ModBlocks.HEART_FLOWER,
                    new Item.Properties()
                            .component(DataComponents.FOOD, new FoodProperties.Builder()
                                    .nutrition(0)
                                    .saturationModifier(0.2F)
                                    .alwaysEdible()
                                    .build())
                            .component(DataComponents.CONSUMABLE, Consumables.defaultFood()
                                    .onConsume(new ApplyStatusEffectsConsumeEffect(
                                            List.of(new MobEffectInstance(
                                                    MobEffects.REGENERATION,
                                                    44 * 20,
                                                    1
                                            ))
                                    ))
                                    .build())
            );

    public static final DeferredItem<BlockItem> PURPLE_PERIWINKLE_ITEM =
            ITEMS.registerSimpleBlockItem("purple_periwinkle",
            ModBlocks.PURPLE_PERIWINKLE
            );

    public static final DeferredItem<BlockItem> RED_PERIWINKLE_ITEM =
            ITEMS.registerSimpleBlockItem("red_periwinkle",
            ModBlocks.RED_PERIWINKLE
            );

    public static final DeferredItem<BlockItem> RED_FAGUSA_ITEM =
            ITEMS.registerSimpleBlockItem("red_fagusa",
            ModBlocks.RED_FAGUSA
            );

    public static final DeferredItem<BlockItem> BLUE_FAGUSA_ITEM =
            ITEMS.registerSimpleBlockItem("blue_fagusa",
            ModBlocks.BLUE_FAGUSA
            );

    public static final DeferredItem<BlockItem> GREEN_FAGUSA_ITEM =
            ITEMS.registerSimpleBlockItem("green_fagusa",
            ModBlocks.GREEN_FAGUSA
            );

    public static final DeferredItem<BlockItem> WATER_KERALIY_ITEM =
            ITEMS.registerSimpleBlockItem("water_keraliy",
            ModBlocks.WATER_KERALIY
            );

    public static final DeferredItem<IsFoil> MOON_STAR_ITEM = ITEMS.registerItem(
            "moon_star",
            properties -> new IsFoil(properties),
            new Item.Properties()
    );

    public static final DeferredItem<BlockItem> ABYSS_ITEM =
            ITEMS.registerSimpleBlockItem( "abyss",
            ModBlocks.ABYSS
            );

    public static final DeferredItem<BlockItem> ABYSS_S_SPROUT_ITEM =
            ITEMS.registerSimpleBlockItem( "abyss_s_sprout",
            ModBlocks.ABYSS_S_SPROUT
            );

    public static final DeferredItem<BlockItem> ECLIPSE_ITEM =
            ITEMS.registerSimpleBlockItem( "eclipse",
            ModBlocks.ECLIPSE
            );

    public static final DeferredItem<Item> SCARLET_ROSE_ITEM =
            ITEMS.register( "scarlet_rose",
                    () -> new BlockItem(ModBlocks.SCARLET_ROSE .get(), new Item.Properties()));

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




    public static final DeferredItem<BlockItem> TEST_ITEM =
            ITEMS.registerSimpleBlockItem("test",
            ModBlocks.TEST);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    }
