package ru.mihadge.diversity_of_flowers_neo.item;

import ru.mihadge.diversity_of_flowers_neo.DiversityOfFlowersNeo;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEndCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> END_CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DiversityOfFlowersNeo.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FABULOUS_FLOWERS_ITEMS_TAB =
            END_CREATIVE_MODE_TABS.register("end_diversity_of_flowers_neo", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.diversity_of_flowers_neo_end"))
                    .icon(() -> ModItems.ABYSS_ITEM.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {

                        output.accept(ModItems.ABYSS_ITEM);
                        output.accept(ModItems.ABYSS_S_SPROUT_ITEM);
                        output.accept(ModItems.ECLIPSE_ITEM);

                    })
                    .build());

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        END_CREATIVE_MODE_TABS.register(eventBus);
    }
}
