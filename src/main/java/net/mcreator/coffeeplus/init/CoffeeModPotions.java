
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.coffeeplus.CoffeeMod;

public class CoffeeModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, CoffeeMod.MODID);
	public static final RegistryObject<Potion> INSOMNIA = REGISTRY.register("insomnia", () -> new Potion(new MobEffectInstance(CoffeeModMobEffects.INSOMNIA.get(), 3600, 0, false, true)));
}
