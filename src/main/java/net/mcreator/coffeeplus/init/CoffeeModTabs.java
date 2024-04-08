
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.coffeeplus.CoffeeMod;

public class CoffeeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoffeeMod.MODID);
	public static final RegistryObject<CreativeModeTab> COFFEE_PLUS = REGISTRY.register("coffee_plus",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.coffee.coffee_plus")).icon(() -> new ItemStack(CoffeeModItems.MUG.get())).displayItems((parameters, tabData) -> {
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
			}).withSearchBar().build());
}
