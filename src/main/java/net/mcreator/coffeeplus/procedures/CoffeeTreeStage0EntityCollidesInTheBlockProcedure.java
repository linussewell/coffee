package net.mcreator.coffeeplus.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.coffeeplus.CoffeeplusMod;

import java.util.Map;

public class CoffeeTreeStage0EntityCollidesInTheBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CoffeeplusMod.LOGGER.warn("Failed to load dependency entity for procedure CoffeeTreeStage0EntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotionMultiplier(Blocks.AIR.getDefaultState(), new Vector3d(0.25D, (double) 0.05F, 0.25D));
	}
}
