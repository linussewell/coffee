
package net.mcreator.coffeeplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ClayMugItem extends Item {
	public ClayMugItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
