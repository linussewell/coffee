
package net.mcreator.coffeeplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class RawCoffeeBeanItem extends Item {
	public RawCoffeeBeanItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("raw_coffee_bean");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
