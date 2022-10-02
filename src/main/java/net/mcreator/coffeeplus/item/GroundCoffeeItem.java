
package net.mcreator.coffeeplus.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.coffeeplus.init.CoffeeModTabs;

public class GroundCoffeeItem extends Item {
	public GroundCoffeeItem() {
		super(new Item.Properties().tab(CoffeeModTabs.TAB_COFFEE_PLUS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
