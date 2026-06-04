package ru.mihadge.diversity_of_flowers_neo.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockState;

public class RegenerationFlowerBlock extends FlowerBlock {

    public RegenerationFlowerBlock(Properties properties) {
        super(MobEffects.REGENERATION, 3.0F, properties);
    }

    @Override
    protected void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (!level.isClientSide && entity instanceof LivingEntity living) {

            MobEffectInstance effect = living.getEffect(MobEffects.REGENERATION);

            if (effect == null || effect.getDuration() < 40) {
                living.addEffect(new MobEffectInstance(
                        MobEffects.REGENERATION,
                        100,
                        0
                ));
            }
        }
    }
    }
