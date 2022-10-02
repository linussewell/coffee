
package net.mcreator.coffeeplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.coffeeplus.init.CoffeeModTabs;

public class ClayMugItem extends Item {
	public ClayMugItem() {
		super(new Item.Properties().tab(CoffeeModTabs.TAB_COFFEE_PLUS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
