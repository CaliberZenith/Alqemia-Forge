package dev.caliberzenith.alqemia.init;

import dev.caliberzenith.alqemia.Alqemia;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TabsInit {
    // Deferred Register
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Alqemia.MODID);

    // Tabs
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ALQEMIA_TAB = CREATIVE_MODE_TABS.register("Alqemia", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.alqemia")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemInit.EXAMPLE_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemInit.EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
            }).build());
}
