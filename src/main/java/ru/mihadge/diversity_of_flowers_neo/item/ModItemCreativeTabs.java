package ru.mihadge.diversity_of_flowers_neo.item;

import ru.mihadge.diversity_of_flowers_neo.DiversityOfFlowersNeo;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItemCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_ITEM_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DiversityOfFlowersNeo.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FABULOUS_FLOWERS_ITEMS_TAB =
            CREATIVE_ITEM_MODE_TABS.register("diversity_of_flowers_neo_items", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.diversity_of_flowers_neo_items"))
                    .icon(() -> ModItems.MOON_STAR_ITEM.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {

                        output.accept(ModItems.MOON_STAR_ITEM);

                    })
                    .build());

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        CREATIVE_ITEM_MODE_TABS.register(eventBus);
    }
}
