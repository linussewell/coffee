
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.coffeeplus.block.entity.CoffeeTreeStage3BlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeTreeStage2BlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeTreeStage1BlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeTreeStage0BlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeMachineEmptyMugBlockEntity;
import net.mcreator.coffeeplus.block.entity.CoffeeMachineBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CoffeeplusModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> COFFEE_MACHINE = register("coffeeplus:coffee_machine", CoffeeplusModBlocks.COFFEE_MACHINE,
			CoffeeMachineBlockEntity::new);
	public static final BlockEntityType<?> COFFEE_TREE_STAGE_0 = register("coffeeplus:coffee_tree_stage_0", CoffeeplusModBlocks.COFFEE_TREE_STAGE_0,
			CoffeeTreeStage0BlockEntity::new);
	public static final BlockEntityType<?> COFFEE_TREE_STAGE_1 = register("coffeeplus:coffee_tree_stage_1", CoffeeplusModBlocks.COFFEE_TREE_STAGE_1,
			CoffeeTreeStage1BlockEntity::new);
	public static final BlockEntityType<?> COFFEE_TREE_STAGE_2 = register("coffeeplus:coffee_tree_stage_2", CoffeeplusModBlocks.COFFEE_TREE_STAGE_2,
			CoffeeTreeStage2BlockEntity::new);
	public static final BlockEntityType<?> COFFEE_TREE_STAGE_3 = register("coffeeplus:coffee_tree_stage_3", CoffeeplusModBlocks.COFFEE_TREE_STAGE_3,
			CoffeeTreeStage3BlockEntity::new);
	public static final BlockEntityType<?> COFFEE_MACHINE_EMPTY_MUG = register("coffeeplus:coffee_machine_empty_mug",
			CoffeeplusModBlocks.COFFEE_MACHINE_EMPTY_MUG, CoffeeMachineEmptyMugBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
