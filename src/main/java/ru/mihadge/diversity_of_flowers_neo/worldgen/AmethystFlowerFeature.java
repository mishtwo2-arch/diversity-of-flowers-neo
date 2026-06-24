package ru.mihadge.diversity_of_flowers_neo.worldgen;

import ru.mihadge.diversity_of_flowers_neo.block.ModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class AmethystFlowerFeature extends Feature<NoneFeatureConfiguration> {

    public AmethystFlowerFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {

        WorldGenLevel level = context.level();
        RandomSource random = context.random();
        BlockPos origin = context.origin();

        BlockPos pos = origin.offset(
                random.nextInt(1) - 1,
                0,
                random.nextInt(1) - 1
        );

        if (!level.isEmptyBlock(pos)) {
            return false;
        }

        if (!ModBlocks.CHRISTALIT.get().defaultBlockState().canSurvive(level, pos)) {
            return false;
        }

        BlockPos.MutableBlockPos check =
                new BlockPos.MutableBlockPos(pos.getX(), pos.getY(), pos.getZ());

        for (int y = pos.getY(); y >= -50; y--) {
            check.setY(y);

            var state = level.getBlockState(check);

            if (state.is(Blocks.AMETHYST_BLOCK)
                    || state.is(Blocks.BUDDING_AMETHYST)
                    || state.is(Blocks.CALCITE)
                    || state.is(Blocks.SMOOTH_BASALT)) {

                level.setBlock(
                        pos,
                        ModBlocks.CHRISTALIT.get().defaultBlockState(),
                        2
                );

                return true;
            }
        }

        return false;
    }
}