
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.coffeeplus.potion.InsomniaMobEffect;
import net.mcreator.coffeeplus.CoffeeMod;

public class CoffeeModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, CoffeeMod.MODID);
	public static final RegistryObject<MobEffect> INSOMNIA = REGISTRY.register("insomnia", () -> new InsomniaMobEffect());
}
