
package net.mcreator.coffeeplus.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.coffeeplus.procedures.InsomniaEffectProcedure;

public class InsomniaMobEffect extends MobEffect {
	public InsomniaMobEffect() {
		super(MobEffectCategory.HARMFUL, -15127211);
	}

	@Override
	public String getDescriptionId() {
		return "effect.coffee.insomnia";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		InsomniaEffectProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
