
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.coffeeplus.block.CoffeeTreeStage3Block;
import net.mcreator.coffeeplus.block.CoffeeTreeStage2Block;
import net.mcreator.coffeeplus.block.CoffeeTreeStage1Block;
import net.mcreator.coffeeplus.block.CoffeeTreeStage0Block;
import net.mcreator.coffeeplus.block.CoffeeMachineEmptyMugBlock;
import net.mcreator.coffeeplus.block.CoffeeMachineBlock;
import net.mcreator.coffeeplus.block.CoffeeGrinderBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CoffeeplusModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block COFFEE_MACHINE = register(new CoffeeMachineBlock());
	public static final Block COFFEE_TREE_STAGE_0 = register(new CoffeeTreeStage0Block());
	public static final Block COFFEE_TREE_STAGE_1 = register(new CoffeeTreeStage1Block());
	public static final Block COFFEE_TREE_STAGE_2 = register(new CoffeeTreeStage2Block());
	public static final Block COFFEE_TREE_STAGE_3 = register(new CoffeeTreeStage3Block());
	public static final Block COFFEE_MACHINE_EMPTY_MUG = register(new CoffeeMachineEmptyMugBlock());
	public static final Block COFFEE_GRINDER = register(new CoffeeGrinderBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CoffeeMachineBlock.registerRenderLayer();
			CoffeeTreeStage0Block.registerRenderLayer();
			CoffeeTreeStage1Block.registerRenderLayer();
			CoffeeTreeStage2Block.registerRenderLayer();
			CoffeeTreeStage3Block.registerRenderLayer();
			CoffeeMachineEmptyMugBlock.registerRenderLayer();
			CoffeeGrinderBlock.registerRenderLayer();
		}
	}
}
