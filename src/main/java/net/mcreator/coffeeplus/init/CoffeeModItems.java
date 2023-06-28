
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
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
import net.mcreator.coffeeplus.item.ClayMugItem;
import net.mcreator.coffeeplus.CoffeeMod;

public class CoffeeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CoffeeMod.MODID);
	public static final RegistryObject<Item> COFFEE_MACHINE = block(CoffeeModBlocks.COFFEE_MACHINE);
	public static final RegistryObject<Item> GRINDER = block(CoffeeModBlocks.GRINDER);
	public static final RegistryObject<Item> HAND_GRINDER = REGISTRY.register("hand_grinder", () -> new HandGrinderItem());
	public static final RegistryObject<Item> CLAY_MUG = REGISTRY.register("clay_mug", () -> new ClayMugItem());
	public static final RegistryObject<Item> MUG = REGISTRY.register("mug", () -> new MugItem());
	public static final RegistryObject<Item> FULL_COFFEE_MUG = REGISTRY.register("full_coffee_mug", () -> new FullCoffeeMugItem());
	public static final RegistryObject<Item> SUGARY_COFFEE = REGISTRY.register("sugary_coffee", () -> new SugaryCoffeeItem());
	public static final RegistryObject<Item> MILKY_COFFEE = REGISTRY.register("milky_coffee", () -> new MilkyCoffeeItem());
	public static final RegistryObject<Item> SUGARY_MILKY_COFFEE = REGISTRY.register("sugary_milky_coffee", () -> new SugaryMilkyCoffeeItem());
	public static final RegistryObject<Item> RAW_COFFEE_BEAN = REGISTRY.register("raw_coffee_bean", () -> new RawCoffeeBeanItem());
	public static final RegistryObject<Item> ROASTED_COFFEE_BEAN = REGISTRY.register("roasted_coffee_bean", () -> new RoastedCoffeeBeanItem());
	public static final RegistryObject<Item> GROUND_COFFEE = REGISTRY.register("ground_coffee", () -> new GroundCoffeeItem());
	public static final RegistryObject<Item> COFFEE_TREE_STAGE_0 = block(CoffeeModBlocks.COFFEE_TREE_STAGE_0);
	public static final RegistryObject<Item> COFFEE_TREE_STAGE_1 = block(CoffeeModBlocks.COFFEE_TREE_STAGE_1);
	public static final RegistryObject<Item> COFFEE_TREE_STAGE_2 = block(CoffeeModBlocks.COFFEE_TREE_STAGE_2);
	public static final RegistryObject<Item> COFFEE_TREE_STAGE_3 = block(CoffeeModBlocks.COFFEE_TREE_STAGE_3);
	public static final RegistryObject<Item> COFFEE_MACHINE_EMPTY_MUG = block(CoffeeModBlocks.COFFEE_MACHINE_EMPTY_MUG);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
