package net.mcreator.coffeeplus.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.coffeeplus.potion.InsomniaPotionEffect;
import net.mcreator.coffeeplus.CoffeeplusMod;

import java.util.Map;

public class MilkyCoffeeConsumedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CoffeeplusMod.LOGGER.warn("Failed to load dependency entity for procedure MilkyCoffeeConsumed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 240, (int) 0, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(InsomniaPotionEffect.potion, (int) 600, (int) 0, (false), (false)));
	}
}
