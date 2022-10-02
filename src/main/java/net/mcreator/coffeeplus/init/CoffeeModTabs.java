
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CoffeeModTabs {
	public static CreativeModeTab TAB_COFFEE_PLUS;

	public static void load() {
		TAB_COFFEE_PLUS = new CreativeModeTab("tabcoffee_plus") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CoffeeModItems.MUG.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
