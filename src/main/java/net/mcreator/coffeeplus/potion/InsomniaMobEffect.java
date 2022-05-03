
package net.mcreator.coffeeplus.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.coffeeplus.procedures.InsomniaEffectProcedure;

public class InsomniaMobEffect extends MobEffect {
	public InsomniaMobEffect() {
		super(MobEffectCategory.HARMFUL, -14809599);
		setRegistryName("insomnia");
	}

	@Override
	public String getDescriptionId() {
		return "effect.coffeeplus.insomnia";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		InsomniaEffectProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
