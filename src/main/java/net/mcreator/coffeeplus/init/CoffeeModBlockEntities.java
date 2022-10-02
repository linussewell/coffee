
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.coffeeplus.block.entity.GrinderBlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeTreeStage3BlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeTreeStage2BlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeTreeStage1BlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeTreeStage0BlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeMachineEmptyMugBlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeMachineBlockEntity;
import net.mcreator.coffeeplus.CoffeeMod;

public class CoffeeModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, CoffeeMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_MACHINE = register("coffee_machine", CoffeeModBlocks.COFFEE_MACHINE,
			CoffeeMachineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_TREE_STAGE_0 = register("coffee_tree_stage_0", CoffeeModBlocks.COFFEE_TREE_STAGE_0,
			CoffeeTreeStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_TREE_STAGE_1 = register("coffee_tree_stage_1", CoffeeModBlocks.COFFEE_TREE_STAGE_1,
			CoffeeTreeStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_TREE_STAGE_2 = register("coffee_tree_stage_2", CoffeeModBlocks.COFFEE_TREE_STAGE_2,
			CoffeeTreeStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_TREE_STAGE_3 = register("coffee_tree_stage_3", CoffeeModBlocks.COFFEE_TREE_STAGE_3,
			CoffeeTreeStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COFFEE_MACHINE_EMPTY_MUG = register("coffee_machine_empty_mug",
			CoffeeModBlocks.COFFEE_MACHINE_EMPTY_MUG, CoffeeMachineEmptyMugBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GRINDER = register("grinder", CoffeeModBlocks.GRINDER, GrinderBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
