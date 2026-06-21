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

    private static Block createFlower() {
        return new FlowerBlock(
                MobEffects.LUCK,
                0.0F,
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.PLANT)
                        .noCollission()
                        .instabreak()
                        .sound(SoundType.GRASS)
                        .offsetType(BlockBehaviour.OffsetType.XZ)
        );
    }

    private static Block createEndFlower() {
        return new ModEndFlower(
                MobEffects.LUCK,
                0.0F,
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.PLANT)
                        .noCollission()
                        .instabreak()
                        .sound(SoundType.GRASS)
                        .offsetType(BlockBehaviour.OffsetType.XZ)
                        .lightLevel(state -> 15)


        );
    }

    private static Block createPotted(DeferredBlock<Block> flower) {
        return new FlowerPotBlock(
                () -> (FlowerPotBlock) Blocks.FLOWER_POT,
                flower,
                BlockBehaviour.Properties.of()
                        .instabreak()
                        .noOcclusion()
                        .sound(SoundType.GRASS)
        );
    }

    private static Block createTallFlower() {
        return new TallFlowerBlock(
                BlockBehaviour.Properties.of()
                        .mapColor(MapColor.PLANT)
                        .noCollission()
                        .instabreak()
                        .sound(SoundType.GRASS)
                        .offsetType(BlockBehaviour.OffsetType.XZ)
        );
    }


    public static final DeferredBlock<Block> ASTER_DAISY =
            BLOCKS.register("aster_daisy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_ASTER_DAISY =
            BLOCKS.register("potted_aster_daisy", () -> createPotted(ASTER_DAISY));

    public static final DeferredBlock<Block> YELLOW_TULIP =
            BLOCKS.register("yellow_tulip",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_YELLOW_TULIP =
            BLOCKS.register("potted_yellow_tulip", () -> createPotted(YELLOW_TULIP));

    public static final DeferredBlock<Block> YELLOW_POPPY =
            BLOCKS.register("yellow_poppy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_YELLOW_POPPY =
            BLOCKS.register("potted_yellow_poppy", () -> createPotted(YELLOW_POPPY));

    public static final DeferredBlock<Block> YELLOW_ORCHID =
            BLOCKS.register("yellow_orchid",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_YELLOW_ORCHID =
            BLOCKS.register("potted_yellow_orchid", () -> createPotted(YELLOW_ORCHID));



    public static final DeferredBlock<Block> PURPLE_ANEMONE =
            BLOCKS.register("purple_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PURPLE_ANEMONE =
            BLOCKS.register("potted_purple_anemone", () -> createPotted(PURPLE_ANEMONE));

    public static final DeferredBlock<Block> PEACH_ANEMONE =
            BLOCKS.register("peach_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PEACH_ANEMONE =
            BLOCKS.register("potted_peach_anemone", () -> createPotted(PEACH_ANEMONE));

    public static final DeferredBlock<Block> NIGHT_ANEMONE =
            BLOCKS.register("night_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_NIGHT_ANEMONE =
            BLOCKS.register("potted_night_anemone", () -> createPotted(NIGHT_ANEMONE));

    public static final DeferredBlock<Block> PINK_ANEMONE =
            BLOCKS.register("pink_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PINK_ANEMONE =
            BLOCKS.register("potted_pink_anemone", () -> createPotted(PINK_ANEMONE));

    public static final DeferredBlock<Block> TURQUOISE_ANEMONE =
            BLOCKS.register("turquoise_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_TURQUOISE_ANEMONE =
            BLOCKS.register("potted_turquoise_anemone", () -> createPotted(TURQUOISE_ANEMONE));

    public static final DeferredBlock<Block> YELLOW_ANEMONE =
            BLOCKS.register("yellow_anemone",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_YELLOW_ANEMONE =
            BLOCKS.register("potted_yellow_anemone", () -> createPotted(YELLOW_ANEMONE));

    public static final DeferredBlock<Block> ALMIUS =
            BLOCKS.register("almius",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_ALMIUS =
            BLOCKS.register("potted_almius", () -> createPotted(ALMIUS));

    public static final DeferredBlock<Block> BLUE_PERIWINKLE =
            BLOCKS.register("blue_periwinkle",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_PERIWINKLE =
            BLOCKS.register("potted_blue_periwinkle", () -> createPotted(BLUE_PERIWINKLE));

    public static final DeferredBlock<Block> HEART_FLOWER =
            BLOCKS.register("heart_flower",
                    () -> new RegenerationFlowerBlock(
                            BlockBehaviour.Properties.of()
                                    .mapColor(MapColor.PLANT)
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    ));

    public static final DeferredBlock<Block> POTTED_HEART_FLOWER =
            BLOCKS.register("potted_heart_flower", () -> createPotted(HEART_FLOWER));

    public static final DeferredBlock<Block> PURPLE_PERIWINKLE =
            BLOCKS.register("purple_periwinkle",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PURPLE_PERIWINKLE =
            BLOCKS.register("potted_purple_periwinkle", () -> createPotted(PURPLE_PERIWINKLE));

    public static final DeferredBlock<Block> RED_PERIWINKLE =
            BLOCKS.register("red_periwinkle",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_RED_PERIWINKLE =
            BLOCKS.register("potted_red_periwinkle", () -> createPotted(RED_PERIWINKLE));

    public static final DeferredBlock<Block> RED_FAGUSA =
            BLOCKS.register("red_fagusa",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_RED_FAGUSA =
            BLOCKS.register("potted_red_fagusa", () -> createPotted(RED_FAGUSA));

    public static final DeferredBlock<Block> BLUE_FAGUSA =
            BLOCKS.register("blue_fagusa",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_FAGUSA =
            BLOCKS.register("potted_blue_fagusa", () -> createPotted(BLUE_FAGUSA));

    public static final DeferredBlock<Block> GREEN_FAGUSA =
            BLOCKS.register("green_fagusa",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_GREEN_FAGUSA =
            BLOCKS.register("potted_green_fagusa", () -> createPotted(GREEN_FAGUSA));

    public static final DeferredBlock<Block> WATER_KERALIY =
            BLOCKS.register("water_keraliy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_WATER_KERALIY =
            BLOCKS.register("potted_water_keraliy", () -> createPotted(WATER_KERALIY));




    public static final DeferredBlock<Block> TEST =
            BLOCKS.register("test",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_TEST =
            BLOCKS.register("potted_test", () -> createPotted(TEST));



    public static final DeferredBlock<Block> WHITE_POPPY =
            BLOCKS.register("white_poppy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_WHITE_POPPY =
            BLOCKS.register("potted_white_poppy", () -> createPotted(WHITE_POPPY));

    public static final DeferredBlock<Block> WHITE_ORCHID =
            BLOCKS.register("white_orchid",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_WHITE_ORCHID =
            BLOCKS.register("potted_white_orchid", () -> createPotted(WHITE_ORCHID));

    public static final DeferredBlock<Block> WHITE_MYOSOTIS =
            BLOCKS.register("white_myosotis",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_WHITE_MYOSOTIS =
            BLOCKS.register("potted_white_myosotis", () -> createPotted(WHITE_MYOSOTIS));

    public static final DeferredBlock<Block> WHITE_ALLIUM =
            BLOCKS.register("white_allium",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_WHITE_ALLIUM =
            BLOCKS.register("potted_white_allium", () -> createPotted(WHITE_ALLIUM));

    public static final DeferredBlock<Block> PURPLE_TULIP =
            BLOCKS.register("purple_tulip",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PURPLE_TULIP =
            BLOCKS.register("potted_purple_tulip", () -> createPotted(PURPLE_TULIP));

    public static final DeferredBlock<Block> PURPLE_ORCHID =
            BLOCKS.register("purple_orchid",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PURPLE_ORCHID =
            BLOCKS.register("potted_purple_orchid", () -> createPotted(PURPLE_ORCHID));

    public static final DeferredBlock<Block> PINK_POPPY =
            BLOCKS.register("pink_poppy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PINK_POPPY =
            BLOCKS.register("potted_pink_poppy", () -> createPotted(PINK_POPPY));

    public static final DeferredBlock<Block> PINK_ORCHID =
            BLOCKS.register("pink_orchid",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PINK_ORCHID =
            BLOCKS.register("potted_pink_orchid", () -> createPotted(PINK_ORCHID));

    public static final DeferredBlock<Block> PINK_MYOSOTIS =
            BLOCKS.register("pink_myosotis",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_PINK_MYOSOTIS =
            BLOCKS.register("potted_pink_myosotis", () -> createPotted(PINK_MYOSOTIS));

    public static final DeferredBlock<Block> ORANGE_POPPY =
            BLOCKS.register("orange_poppy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_ORANGE_POPPY =
            BLOCKS.register("potted_orange_poppy", () -> createPotted(ORANGE_POPPY));

    public static final DeferredBlock<Block> GLORIOSA_DAISY =
            BLOCKS.register("gloriosa_daisy",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_GLORIOSA_DAISY =
            BLOCKS.register("potted_gloriosa_daisy", () -> createPotted(GLORIOSA_DAISY));

    public static final DeferredBlock<Block> BLUE_TULIP =
            BLOCKS.register("blue_tulip",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_TULIP =
            BLOCKS.register("potted_blue_tulip", () -> createPotted(BLUE_TULIP));

    public static final DeferredBlock<Block> BLUE_MYOSOTIS =
            BLOCKS.register("blue_myosotis",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_MYOSOTIS =
            BLOCKS.register("potted_blue_myosotis", () -> createPotted(BLUE_MYOSOTIS));

    public static final DeferredBlock<Block> BLUE_ALLIUM =
            BLOCKS.register("blue_allium",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLUE_ALLIUM =
            BLOCKS.register("potted_blue_allium", () -> createPotted(BLUE_ALLIUM));


    public static final DeferredBlock<Block> BLACK_TULIP =
            BLOCKS.register("black_tulip",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_BLACK_TULIP =
            BLOCKS.register("potted_black_tulip", () -> createPotted(BLACK_TULIP));

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
            BLOCKS.register("froideur",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_FROIDEUR =
            BLOCKS.register("potted_froideur", () -> createPotted(BLUE_KIZ));

    public static final DeferredBlock<Block> MOUNTAIN_CORNFLOWER =
            BLOCKS.register("mountain_cornflower",ModBlocks::createFlower);

    public static final DeferredBlock<Block> POTTED_MOUNTAIN_CORNFLOWER =
            BLOCKS.register("potted_mountain_cornflower", () -> createPotted(MOUNTAIN_CORNFLOWER));



    public static final  DeferredBlock<Block> ABYSS =
            BLOCKS.register("abyss",ModBlocks::createEndFlower);

    public static final DeferredBlock<Block> POTTED_ABYSS =
            BLOCKS.register("potted_abyss", () -> createPotted(ABYSS));

public static final DeferredBlock<Block> ABYSS_S_SPROUT =
        BLOCKS.register("abyss_s_sprout", ModBlocks::createEndFlower);

    public static final  DeferredBlock<Block> ECLIPSE =
            BLOCKS.register("eclipse",ModBlocks::createEndFlower);

    public static final DeferredBlock<Block> POTTED_ECLIPSE =
            BLOCKS.register("potted_eclipse", () -> createPotted(ECLIPSE));


    public static final DeferredBlock<Block> SNOW_DANDELION =
            BLOCKS.register("snow_dandelion",
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


    public static final DeferredBlock<Block> POTTED_SNOW_DANDELION =
            BLOCKS.register("potted_snow_dandelion", () -> createPotted(SNOW_DANDELION));


    public static final DeferredBlock<Block> ASHEN_SAGE =
            BLOCKS.register("ashen_sage",
                    () -> new ModSnowTallFlower(
                            BlockBehaviour.Properties.of()
                                    .noCollission()
                                    .instabreak()
                                    .sound(SoundType.GRASS)
                    ));



    public static final DeferredBlock<Block> YELLOW_ROSE_BUSH =
            BLOCKS.register("yellow_rose_bush", ModBlocks::createTallFlower);


    public static final DeferredBlock<Block> WHITE_PEONY =
            BLOCKS.register("white_peony", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> GOLDEN_SAGE =
            BLOCKS.register("golden_sage", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> WHITE_ROSE_BUSH =
            BLOCKS.register("white_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> MAGENTA_ROSE_BUSH =
            BLOCKS.register("magenta_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> VIOLET_SAGE =
            BLOCKS.register("violet_sage", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> AZURE_SAGE =
            BLOCKS.register("azure_sage", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> PURPLE_ROSE_BUSH =
            BLOCKS.register("purple_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> SCARLET_SAGE =
            BLOCKS.register("scarlet_sage", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> RED_PEONY =
            BLOCKS.register("red_peony", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> PINK_ROSE_BUSH =
            BLOCKS.register("pink_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> PINK_PEONY =
            BLOCKS.register("pink_peony", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> ORANGE_ROSE_BUSH =
            BLOCKS.register("orange_rose_bush", ModBlocks::createTallFlower);

    public static final DeferredBlock<Block> MOONFLOWER =
            BLOCKS.register("moonflower",
                    () -> new MoonFlowerBlock(
                            BlockBehaviour.Properties.of()
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

            });
        });
    }

}


