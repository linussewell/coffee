package net.mcreator.coffeeplus.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.coffeeplus.init.CoffeeModBlocks;

import java.util.Map;

public class CoffeeTreeStage2UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (true) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CoffeeModBlocks.COFFEE_TREE_STAGE_0.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = CoffeeModBlocks.COFFEE_TREE_STAGE_1.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CoffeeModBlocks.COFFEE_TREE_STAGE_1.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = CoffeeModBlocks.COFFEE_TREE_STAGE_2.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == CoffeeModBlocks.COFFEE_TREE_STAGE_2.get()) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = CoffeeModBlocks.COFFEE_TREE_STAGE_3.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
