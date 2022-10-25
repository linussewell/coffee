
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.coffeeplus.block.GrinderBlock;
import net.mcreator.coffeeplus.block.CoffeeTreeStage3Block;
import net.mcreator.coffeeplus.block.CoffeeTreeStage2Block;
import net.mcreator.coffeeplus.block.CoffeeTreeStage1Block;
import net.mcreator.coffeeplus.block.CoffeeTreeStage0Block;
import net.mcreator.coffeeplus.block.CoffeeMachineEmptyMugBlock;
import net.mcreator.coffeeplus.block.CoffeeMachineBlock;
import net.mcreator.coffeeplus.CoffeeMod;

public class CoffeeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CoffeeMod.MODID);
	public static final RegistryObject<Block> COFFEE_MACHINE = REGISTRY.register("coffee_machine", () -> new CoffeeMachineBlock());
	public static final RegistryObject<Block> GRINDER = REGISTRY.register("grinder", () -> new GrinderBlock());
	public static final RegistryObject<Block> COFFEE_TREE_STAGE_0 = REGISTRY.register("coffee_tree_stage_0", () -> new CoffeeTreeStage0Block());
	public static final RegistryObject<Block> COFFEE_TREE_STAGE_1 = REGISTRY.register("coffee_tree_stage_1", () -> new CoffeeTreeStage1Block());
	public static final RegistryObject<Block> COFFEE_TREE_STAGE_2 = REGISTRY.register("coffee_tree_stage_2", () -> new CoffeeTreeStage2Block());
	public static final RegistryObject<Block> COFFEE_TREE_STAGE_3 = REGISTRY.register("coffee_tree_stage_3", () -> new CoffeeTreeStage3Block());
	public static final RegistryObject<Block> COFFEE_MACHINE_EMPTY_MUG = REGISTRY.register("coffee_machine_empty_mug",
			() -> new CoffeeMachineEmptyMugBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			CoffeeMachineBlock.registerRenderLayer();
			GrinderBlock.registerRenderLayer();
			CoffeeTreeStage0Block.registerRenderLayer();
			CoffeeTreeStage1Block.registerRenderLayer();
			CoffeeTreeStage2Block.registerRenderLayer();
			CoffeeTreeStage3Block.registerRenderLayer();
			CoffeeMachineEmptyMugBlock.registerRenderLayer();
		}
	}
}
