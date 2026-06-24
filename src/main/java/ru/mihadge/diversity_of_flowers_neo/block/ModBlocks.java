package ru.mihadge.diversity_of_flowers_neo.block;

import ru.mihadge.diversity_of_flowers_neo.DiversityOfFlowersNeo;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.Blocks;


public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DiversityOfFlowersNeo.MODID);

    private static Block createFlower(BlockBehaviour.Properties props) {
        return new FlowerBlock(
                MobEffects.LUCK,
                0.0F,
                props
                        .mapColor(MapColor.PLANT)
                        .noCollission()
                        .instabreak()
                        .sound(SoundType.GRASS)
                        .offsetType(BlockBehaviour.OffsetType.XZ)
        );
    }

    private static Block createEndFlower(BlockBehaviour.Properties properties) {
        return new ModEndFlower(
                MobEffects.LUCK,
                0.0F,
                properties
                        .mapColor(MapColor.PLANT)
                        .noCollission()
                        .instabreak()
                        .sound(SoundType.GRASS)
                        .offsetType(BlockBehaviour.OffsetType.XZ)
                        .lightLevel(state -> 15)
        );
    }

    private static Block createPotted(DeferredBlock<Block> flower, BlockBehaviour.Properties properties) {
        return new FlowerPotBlock(
                () -> (FlowerPotBlock) Blocks.FLOWER_POT,
                flower,
                properties
                        .instabreak()
                        .noOcclusion()
                        .sound(SoundType.GRASS)
        );
    }

    private static Block createTallFlower(BlockBehaviour.Properties properties) {
        return new TallFlowerBlock(
                properties
                        .mapColor(MapColor.PLANT)
                        .noCollission()
                        .instabreak()
                        .sound(SoundType.GRASS)
                        .offsetType(BlockBehaviour.OffsetType.XZ)
        );
    }


    public static final DeferredBlock<Block> ASTER_DAISY =
            BLOCKS.registerBlock("aster_daisy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_ASTER_DAISY =
            BLOCKS.registerBlock("potted_aster_daisy", properties -> createPotted(ASTER_DAISY, properties));

    public static final DeferredBlock<Block> YELLOW_TULIP =
            BLOCKS.registerBlock("yellow_tulip",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_YELLOW_TULIP =
            BLOCKS.registerBlock("potted_yellow_tulip", properties -> createPotted(YELLOW_TULIP, properties));

    public static final DeferredBlock<Block> YELLOW_POPPY =
            BLOCKS.registerBlock("yellow_poppy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_YELLOW_POPPY =
            BLOCKS.registerBlock("potted_yellow_poppy", properties -> createPotted(YELLOW_POPPY, properties));

    public static final DeferredBlock<Block> YELLOW_ORCHID =
            BLOCKS.registerBlock("yellow_orchid",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_YELLOW_ORCHID =
            BLOCKS.registerBlock("potted_yellow_orchid", properties -> createPotted(YELLOW_ORCHID, properties));



    public static final DeferredBlock<Block> PURPLE_ANEMONE =
            BLOCKS.registerBlock("purple_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PURPLE_ANEMONE =
            BLOCKS.registerBlock("potted_purple_anemone", properties -> createPotted(PURPLE_ANEMONE, properties));

    public static final DeferredBlock<Block> PEACH_ANEMONE =
            BLOCKS.registerBlock("peach_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PEACH_ANEMONE =
            BLOCKS.registerBlock("potted_peach_anemone", properties -> createPotted(PEACH_ANEMONE, properties));

    public static final DeferredBlock<Block> NIGHT_ANEMONE =
            BLOCKS.registerBlock("night_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_NIGHT_ANEMONE =
            BLOCKS.registerBlock("potted_night_anemone", properties -> createPotted(NIGHT_ANEMONE, properties));

    public static final DeferredBlock<Block> PINK_ANEMONE =
            BLOCKS.registerBlock("pink_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PINK_ANEMONE =
            BLOCKS.registerBlock("potted_pink_anemone", properties -> createPotted(PINK_ANEMONE, properties));

    public static final DeferredBlock<Block> TURQUOISE_ANEMONE =
            BLOCKS.registerBlock("turquoise_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_TURQUOISE_ANEMONE =
            BLOCKS.registerBlock("potted_turquoise_anemone", properties -> createPotted(TURQUOISE_ANEMONE, properties));

    public static final DeferredBlock<Block> YELLOW_ANEMONE =
            BLOCKS.registerBlock("yellow_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_YELLOW_ANEMONE =
            BLOCKS.registerBlock("potted_yellow_anemone", properties -> createPotted(YELLOW_ANEMONE, properties));

    public static final DeferredBlock<Block> ALMIUS =
            BLOCKS.registerBlock("almius",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_ALMIUS =
            BLOCKS.registerBlock("potted_almius", properties -> createPotted(ALMIUS, properties));

    public static final DeferredBlock<Block> BLUE_PERIWINKLE =
            BLOCKS.registerBlock("blue_periwinkle",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_PERIWINKLE =
            BLOCKS.registerBlock("potted_blue_periwinkle", properties -> createPotted(BLUE_PERIWINKLE, properties));

    public static final DeferredBlock<Block> HEART_FLOWER =
            BLOCKS.registerBlock("heart_flower",
                    properties -> new Block(
                            properties
                                    .mapColor(MapColor.PLANT)
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                    ));

    public static final DeferredBlock<Block> POTTED_HEART_FLOWER =
            BLOCKS.registerBlock("potted_heart_flower", properties -> createPotted(HEART_FLOWER, properties));

    public static final DeferredBlock<Block> PURPLE_PERIWINKLE =
            BLOCKS.registerBlock("purple_periwinkle",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PURPLE_PERIWINKLE =
            BLOCKS.registerBlock("potted_purple_periwinkle", properties -> createPotted(PURPLE_PERIWINKLE, properties));

    public static final DeferredBlock<Block> RED_PERIWINKLE =
            BLOCKS.registerBlock("red_periwinkle",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_RED_PERIWINKLE =
            BLOCKS.registerBlock("potted_red_periwinkle", properties -> createPotted(RED_PERIWINKLE, properties));

    public static final DeferredBlock<Block> RED_FAGUSA =
            BLOCKS.registerBlock("red_fagusa",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_RED_FAGUSA =
            BLOCKS.registerBlock("potted_red_fagusa", properties -> createPotted(RED_FAGUSA, properties));

    public static final DeferredBlock<Block> BLUE_FAGUSA =
            BLOCKS.registerBlock("blue_fagusa",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_FAGUSA =
            BLOCKS.registerBlock("potted_blue_fagusa", properties -> createPotted(BLUE_FAGUSA, properties));

    public static final DeferredBlock<Block> GREEN_FAGUSA =
            BLOCKS.registerBlock("green_fagusa",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_GREEN_FAGUSA =
            BLOCKS.registerBlock("potted_green_fagusa", properties -> createPotted(GREEN_FAGUSA, properties));

    public static final DeferredBlock<Block> WATER_KERALIY =
            BLOCKS.registerBlock("water_keraliy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_WATER_KERALIY =
            BLOCKS.registerBlock("potted_water_keraliy", properties -> createPotted(WATER_KERALIY, properties));




    public static final DeferredBlock<Block> TEST =
            BLOCKS.registerBlock("test",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_TEST =
            BLOCKS.registerBlock("potted_test", properties -> createPotted(TEST, properties));



    public static final DeferredBlock<Block> WHITE_POPPY =
            BLOCKS.registerBlock("white_poppy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_WHITE_POPPY =
            BLOCKS.registerBlock("potted_white_poppy", properties -> createPotted(WHITE_POPPY, properties));

    public static final DeferredBlock<Block> WHITE_ORCHID =
            BLOCKS.registerBlock("white_orchid",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_WHITE_ORCHID =
            BLOCKS.registerBlock("potted_white_orchid", properties -> createPotted(WHITE_ORCHID, properties));

    public static final DeferredBlock<Block> WHITE_MYOSOTIS =
            BLOCKS.registerBlock("white_myosotis",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_WHITE_MYOSOTIS =
            BLOCKS.registerBlock("potted_white_myosotis", properties -> createPotted(WHITE_MYOSOTIS, properties));

    public static final DeferredBlock<Block> WHITE_ALLIUM =
            BLOCKS.registerBlock("white_allium",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_WHITE_ALLIUM =
            BLOCKS.registerBlock("potted_white_allium", properties -> createPotted(WHITE_ALLIUM, properties));

    public static final DeferredBlock<Block> PURPLE_TULIP =
            BLOCKS.registerBlock("purple_tulip",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PURPLE_TULIP =
            BLOCKS.registerBlock("potted_purple_tulip", properties -> createPotted(PURPLE_TULIP, properties));

    public static final DeferredBlock<Block> PURPLE_ORCHID =
            BLOCKS.registerBlock("purple_orchid",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PURPLE_ORCHID =
            BLOCKS.registerBlock("potted_purple_orchid", properties -> createPotted(PURPLE_ORCHID, properties));

    public static final DeferredBlock<Block> PINK_POPPY =
            BLOCKS.registerBlock("pink_poppy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PINK_POPPY =
            BLOCKS.registerBlock("potted_pink_poppy", properties -> createPotted(PINK_POPPY, properties));

    public static final DeferredBlock<Block> PINK_ORCHID =
            BLOCKS.registerBlock("pink_orchid",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PINK_ORCHID =
            BLOCKS.registerBlock("potted_pink_orchid", properties -> createPotted(PINK_ORCHID, properties));

    public static final DeferredBlock<Block> PINK_MYOSOTIS =
            BLOCKS.registerBlock("pink_myosotis",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PINK_MYOSOTIS =
            BLOCKS.registerBlock("potted_pink_myosotis", properties -> createPotted(PINK_MYOSOTIS, properties));

    public static final DeferredBlock<Block> ORANGE_POPPY =
            BLOCKS.registerBlock("orange_poppy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_ORANGE_POPPY =
            BLOCKS.registerBlock("potted_orange_poppy", properties -> createPotted(ORANGE_POPPY, properties));

    public static final DeferredBlock<Block> GLORIOSA_DAISY =
            BLOCKS.registerBlock("gloriosa_daisy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_GLORIOSA_DAISY =
            BLOCKS.registerBlock("potted_gloriosa_daisy", properties -> createPotted(GLORIOSA_DAISY, properties));

    public static final DeferredBlock<Block> BLUE_TULIP =
            BLOCKS.registerBlock("blue_tulip",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_TULIP =
            BLOCKS.registerBlock("potted_blue_tulip", properties -> createPotted(BLUE_TULIP, properties));

    public static final DeferredBlock<Block> BLUE_MYOSOTIS =
            BLOCKS.registerBlock("blue_myosotis",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_MYOSOTIS =
            BLOCKS.registerBlock("potted_blue_myosotis", properties -> createPotted(BLUE_MYOSOTIS, properties));

    public static final DeferredBlock<Block> BLUE_ALLIUM =
            BLOCKS.registerBlock("blue_allium",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_ALLIUM =
            BLOCKS.registerBlock("potted_blue_allium", properties -> createPotted(BLUE_ALLIUM, properties));


    public static final DeferredBlock<Block> BLACK_TULIP =
            BLOCKS.registerBlock("black_tulip",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLACK_TULIP =
            BLOCKS.registerBlock("potted_black_tulip", properties -> createPotted(BLACK_TULIP, properties));

    public static final DeferredBlock<Block> BLUE_KIZ =
            BLOCKS.register("blue_kiz",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_KIZ =
            BLOCKS.register("potted_blue_kiz", () -> createPotted(BLUE_KIZ));

    public static final DeferredBlock<Block> DAURIN =
            BLOCKS.register("daurin",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_DAURIN =
            BLOCKS.register("potted_daurin", () -> createPotted(DAURIN));

    public static final DeferredBlock<Block> CHRISTALIT =
            BLOCKS.register("christalit",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_CHRISTALIT =
            BLOCKS.register("potted_christalit", () -> createPotted(BLUE_KIZ));

    public static final DeferredBlock<Block> FROIDEUR =
            BLOCKS.register("froideur",
                    () -> new ModSnowFlower(
                            MobEffects.LUCK,
                            0.0F,
                            BlockBehaviour.Properties.of()
                                    .mapColor(MapColor.PLANT)
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    ));

    public static final DeferredBlock<Block> POTTED_FROIDEUR =
            BLOCKS.register("potted_froideur", () -> createPotted(BLUE_KIZ));

    public static final DeferredBlock<Block> MOUNTAIN_CORNFLOWER =
            BLOCKS.register("mountain_cornflower",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_MOUNTAIN_CORNFLOWER =
            BLOCKS.register("potted_mountain_cornflower", () -> createPotted(MOUNTAIN_CORNFLOWER));



    public static final  DeferredBlock<Block> ABYSS =
            BLOCKS.registerBlock("abyss",ModBlocks::createEndFlower);

    public static final DeferredBlock<Block> POTTED_ABYSS =
            BLOCKS.registerBlock("potted_abyss", properties -> createPotted(ABYSS, properties));

public static final DeferredBlock<Block> ABYSS_S_SPROUT =
        BLOCKS.registerBlock("abyss_s_sprout", ModBlocks::createEndFlower);

    public static final  DeferredBlock<Block> ECLIPSE =
            BLOCKS.registerBlock("eclipse",ModBlocks::createEndFlower);

    public static final DeferredBlock<Block> POTTED_ECLIPSE =
            BLOCKS.registerBlock("potted_eclipse", properties -> createPotted(ECLIPSE, properties));

    public static final DeferredBlock<Block> SNOW_DANDELION =
            BLOCKS.registerBlock("snow_dandelion",
                    properties -> new ModSnowFlower(
                            MobEffects.LUCK,
                            0.0F,
                            properties
                                    .mapColor(MapColor.PLANT)
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    ));


    public static final DeferredBlock<Block> POTTED_SNOW_DANDELION =
            BLOCKS.registerBlock("potted_snow_dandelion", properties -> createPotted(SNOW_DANDELION, properties));

    public static final DeferredBlock<Block> ASHEN_SAGE =
            BLOCKS.registerBlock("ashen_sage",
                    properties -> new ModSnowTallFlower(
                            properties
                                    .mapColor(MapColor.PLANT)
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    ));



    public static final DeferredBlock<Block> YELLOW_ROSE_BUSH =
            BLOCKS.registerBlock("yellow_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> SCARLET_ROSE =
            BLOCKS.register("scarlet_rose", ModBlocks::createTallFlower);


    public static final DeferredBlock<Block> WHITE_PEONY =
            BLOCKS.registerBlock("white_peony", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> GOLDEN_SAGE =
            BLOCKS.registerBlock("golden_sage", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> WHITE_ROSE_BUSH =
            BLOCKS.registerBlock("white_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> MAGENTA_ROSE_BUSH =
            BLOCKS.registerBlock("magenta_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> VIOLET_SAGE =
            BLOCKS.registerBlock("violet_sage", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> AZURE_SAGE =
            BLOCKS.registerBlock("azure_sage", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> PURPLE_ROSE_BUSH =
            BLOCKS.registerBlock("purple_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> SCARLET_SAGE =
            BLOCKS.registerBlock("scarlet_sage", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> RED_PEONY =
            BLOCKS.registerBlock("red_peony", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> PINK_ROSE_BUSH =
            BLOCKS.registerBlock("pink_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> PINK_PEONY =
            BLOCKS.registerBlock("pink_peony", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> ORANGE_ROSE_BUSH =
            BLOCKS.registerBlock("orange_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> MOONFLOWER =
            BLOCKS.registerBlock("moonflower",
                    properties -> new MoonFlowerBlock(
                            properties
                                    .mapColor(MapColor.PLANT)
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    ));





    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

        eventBus.addListener((FMLCommonSetupEvent event) -> {
            event.enqueueWork(() -> {

                FlowerPotBlock pot = (FlowerPotBlock) Blocks.FLOWER_POT;

                pot.addPlant(ASTER_DAISY.getId(), POTTED_ASTER_DAISY);
                pot.addPlant(YELLOW_TULIP.getId(), POTTED_YELLOW_TULIP);
                pot.addPlant(YELLOW_POPPY.getId(), POTTED_YELLOW_POPPY);
                pot.addPlant(YELLOW_ORCHID.getId(), POTTED_YELLOW_ORCHID);
                pot.addPlant(WHITE_POPPY.getId(), POTTED_WHITE_POPPY);
                pot.addPlant(WHITE_ORCHID.getId(), POTTED_WHITE_ORCHID);
                pot.addPlant(WHITE_MYOSOTIS.getId(), POTTED_WHITE_MYOSOTIS);
                pot.addPlant(WHITE_ALLIUM.getId(), POTTED_WHITE_ALLIUM);
                pot.addPlant(PURPLE_TULIP.getId(), POTTED_PURPLE_TULIP);
                pot.addPlant(PURPLE_ORCHID.getId(), POTTED_PURPLE_ORCHID);
                pot.addPlant(PINK_POPPY.getId(), POTTED_PINK_POPPY);
                pot.addPlant(PINK_ORCHID.getId(), POTTED_PINK_ORCHID);
                pot.addPlant(PINK_MYOSOTIS.getId(), POTTED_PINK_MYOSOTIS);
                pot.addPlant(ORANGE_POPPY.getId(), POTTED_ORANGE_POPPY);
                pot.addPlant(GLORIOSA_DAISY.getId(), POTTED_GLORIOSA_DAISY);
                pot.addPlant(BLUE_TULIP.getId(), POTTED_BLUE_TULIP);
                pot.addPlant(BLUE_MYOSOTIS.getId(), POTTED_BLUE_MYOSOTIS);
                pot.addPlant(BLUE_ALLIUM.getId(), POTTED_BLUE_ALLIUM);
                pot.addPlant(SNOW_DANDELION.getId(), POTTED_SNOW_DANDELION);
                pot.addPlant(BLACK_TULIP.getId(), POTTED_BLACK_TULIP);
                pot.addPlant(PURPLE_ANEMONE.getId(), POTTED_PURPLE_ANEMONE);
                pot.addPlant(PEACH_ANEMONE.getId(), POTTED_PEACH_ANEMONE);
                pot.addPlant(NIGHT_ANEMONE.getId(), POTTED_NIGHT_ANEMONE);
                pot.addPlant(PINK_ANEMONE.getId(), POTTED_PINK_ANEMONE);
                pot.addPlant(TURQUOISE_ANEMONE.getId(), POTTED_TURQUOISE_ANEMONE);
                pot.addPlant(YELLOW_ANEMONE.getId(), POTTED_YELLOW_ANEMONE);
                pot.addPlant(ALMIUS.getId(), POTTED_ALMIUS);
                pot.addPlant(BLUE_PERIWINKLE.getId(), POTTED_BLUE_PERIWINKLE);
                pot.addPlant(HEART_FLOWER.getId(), POTTED_HEART_FLOWER);
                pot.addPlant(PURPLE_PERIWINKLE.getId(), POTTED_PURPLE_PERIWINKLE);
                pot.addPlant(RED_PERIWINKLE.getId(), POTTED_RED_PERIWINKLE);
                pot.addPlant(RED_FAGUSA.getId(), POTTED_RED_FAGUSA);
                pot.addPlant(BLUE_FAGUSA.getId(), POTTED_BLUE_FAGUSA);
                pot.addPlant(GREEN_FAGUSA.getId(), POTTED_GREEN_FAGUSA);
                pot.addPlant(WATER_KERALIY.getId(), POTTED_WATER_KERALIY);
                pot.addPlant(ABYSS.getId(), POTTED_ABYSS);
                pot.addPlant(BLUE_KIZ.getId(), POTTED_BLUE_KIZ);
                pot.addPlant(DAURIN.getId(), POTTED_DAURIN);
                pot.addPlant(CHRISTALIT.getId(), POTTED_CHRISTALIT);
                pot.addPlant(FROIDEUR.getId(), POTTED_FROIDEUR);
                pot.addPlant(MOUNTAIN_CORNFLOWER.getId(), POTTED_MOUNTAIN_CORNFLOWER);
                pot.addPlant(ECLIPSE.getId(), POTTED_ECLIPSE);

            });
        });
    }

}


