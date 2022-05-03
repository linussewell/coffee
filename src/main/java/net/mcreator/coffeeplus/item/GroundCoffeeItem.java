
package net.mcreator.coffeeplus.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class GroundCoffeeItem extends Item {
	public GroundCoffeeItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("ground_coffee");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
