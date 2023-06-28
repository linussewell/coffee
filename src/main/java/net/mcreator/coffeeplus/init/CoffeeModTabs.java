
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CoffeeModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("coffee", "coffee_plus"),
				builder -> builder.title(Component.translatable("item_group.coffee.coffee_plus")).icon(() -> new ItemStack(CoffeeModItems.MUG.get())).displayItems((parameters, tabData) -> {
					tabData.accept(CoffeeModBlocks.COFFEE_MACHINE.get().asItem());
					tabData.accept(CoffeeModBlocks.GRINDER.get().asItem());
					tabData.accept(CoffeeModItems.HAND_GRINDER.get());
					tabData.accept(CoffeeModItems.CLAY_MUG.get());
					tabData.accept(CoffeeModItems.MUG.get());
					tabData.accept(CoffeeModItems.FULL_COFFEE_MUG.get());
					tabData.accept(CoffeeModItems.SUGARY_COFFEE.get());
					tabData.accept(CoffeeModItems.MILKY_COFFEE.get());
					tabData.accept(CoffeeModItems.SUGARY_MILKY_COFFEE.get());
					tabData.accept(CoffeeModItems.RAW_COFFEE_BEAN.get());
					tabData.accept(CoffeeModItems.ROASTED_COFFEE_BEAN.get());
					tabData.accept(CoffeeModItems.GROUND_COFFEE.get());
				}).withSearchBar());
	}
}
