package ru.mihadge.diversity_of_flowers_neo.worldgen;

import ru.mihadge.diversity_of_flowers_neo.DiversityOfFlowersNeo;
import ru.mihadge.diversity_of_flowers_neo.worldgen.AbyssFeature;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(Registries.FEATURE, DiversityOfFlowersNeo.MODID);

    public static final DeferredHolder<Feature<?>, Feature<?>> ABYSS_FEATURE =
            FEATURES.register(
                    "abyss_feature",
                    () -> new AbyssFeature(NoneFeatureConfiguration.CODEC)
            );

    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
    }
}
