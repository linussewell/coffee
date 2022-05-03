
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.coffeeplus.item.SugaryMilkyCoffeeItem;
import net.mcreator.coffeeplus.item.SugaryCoffeeItem;
import net.mcreator.coffeeplus.item.RoastedCoffeeBeanItem;
import net.mcreator.coffeeplus.item.RawCoffeeBeanItem;
import net.mcreator.coffeeplus.item.MugItem;
import net.mcreator.coffeeplus.item.MilkyCoffeeItem;
import net.mcreator.coffeeplus.item.HandGrinderItem;
import net.mcreator.coffeeplus.item.GroundCoffeeItem;
import net.mcreator.coffeeplus.item.FullCoffeeMugItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CoffeeplusModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item COFFEE_MACHINE = register(CoffeeplusModBlocks.COFFEE_MACHINE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item MUG = register(new MugItem());
	public static final Item FULL_COFFEE_MUG = register(new FullCoffeeMugItem());
	public static final Item GROUND_COFFEE = register(new GroundCoffeeItem());
	public static final Item RAW_COFFEE_BEAN = register(new RawCoffeeBeanItem());
	public static final Item ROASTED_COFFEE_BEAN = register(new RoastedCoffeeBeanItem());
	public static final Item COFFEE_TREE_STAGE_0 = register(CoffeeplusModBlocks.COFFEE_TREE_STAGE_0, null);
	public static final Item COFFEE_TREE_STAGE_1 = register(CoffeeplusModBlocks.COFFEE_TREE_STAGE_1, null);
	public static final Item COFFEE_TREE_STAGE_2 = register(CoffeeplusModBlocks.COFFEE_TREE_STAGE_2, null);
	public static final Item COFFEE_TREE_STAGE_3 = register(CoffeeplusModBlocks.COFFEE_TREE_STAGE_3, null);
	public static final Item SUGARY_COFFEE = register(new SugaryCoffeeItem());
	public static final Item MILKY_COFFEE = register(new MilkyCoffeeItem());
	public static final Item SUGARY_MILKY_COFFEE = register(new SugaryMilkyCoffeeItem());
	public static final Item COFFEE_MACHINE_EMPTY_MUG = register(CoffeeplusModBlocks.COFFEE_MACHINE_EMPTY_MUG, null);
	public static final Item COFFEE_GRINDER = register(CoffeeplusModBlocks.COFFEE_GRINDER, CreativeModeTab.TAB_DECORATIONS);
	public static final Item HAND_GRINDER = register(new HandGrinderItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
