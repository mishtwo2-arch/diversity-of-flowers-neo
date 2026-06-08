package ru.mihadge.diversity_of_flowers_neo.worldgen;

import ru.mihadge.diversity_of_flowers_neo.block.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.util.ArrayList;
import java.util.List;


    public class AbyssFeature extends Feature<NoneFeatureConfiguration> {

        public AbyssFeature(Codec<NoneFeatureConfiguration> codec) {
            super(codec);
        }

        @Override
        public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {

            WorldGenLevel level = context.level();
            RandomSource random = context.random();
            BlockPos origin = context.origin();

            List<BlockPos> placed = new ArrayList<>();


            for (int i = 0; i < 32; i++) {

                BlockPos pos = origin.offset(
                        random.nextInt(12) - 6,
                        0,
                        random.nextInt(12) - 6
                );

                if (level.isEmptyBlock(pos) &&
                        ModBlocks.ABYSS_S_SPROUT.get().defaultBlockState().canSurvive(level, pos)) {

                    level.setBlock(pos, ModBlocks.ABYSS_S_SPROUT.get().defaultBlockState(), 2);
                    placed.add(pos);
                }
            }

            if (random.nextInt(1) == 0) {

                BlockPos base = origin.offset(
                        random.nextInt(12) - 6,
                        0,
                        random.nextInt(12) - 6
                );

                if (level.isEmptyBlock(base) &&
                        ModBlocks.ABYSS.get().defaultBlockState().canSurvive(level, base)) {

                    level.setBlock(base, ModBlocks.ABYSS.get().defaultBlockState(), 2);
                }
            }

            return !placed.isEmpty();
        }
    }