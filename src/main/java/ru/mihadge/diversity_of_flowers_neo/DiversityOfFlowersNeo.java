package ru.mihadge.diversity_of_flowers_neo;

import ru.mihadge.diversity_of_flowers_neo.block.ModBlocks;
import ru.mihadge.diversity_of_flowers_neo.item.ModItemCreativeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Blocks;
import ru.mihadge.diversity_of_flowers_neo.item.ModItems;
import ru.mihadge.diversity_of_flowers_neo.item.ModCreativeTabs;


@Mod(DiversityOfFlowersNeo.MODID)
public class DiversityOfFlowersNeo {


    public static final String MODID = "diversity_of_flowers_neo";

    public static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);




    public DiversityOfFlowersNeo(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);


        BLOCKS.register(modEventBus);

        ITEMS.register(modEventBus);


        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
        ModItemCreativeTabs.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);


        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

        LOGGER.info("HELLO FROM COMMON SETUP");

        if (Config.LOG_DIRT_BLOCK.getAsBoolean()) {
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));
        }

        LOGGER.info("{}{}", Config.MAGIC_NUMBER_INTRODUCTION.get(), Config.MAGIC_NUMBER.getAsInt());

        Config.ITEM_STRINGS.get().forEach((item) -> LOGGER.info("ITEM >> {}", item));
    }




    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

        LOGGER.info("HELLO from server starting");
    }
}
