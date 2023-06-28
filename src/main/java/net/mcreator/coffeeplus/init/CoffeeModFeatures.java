
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.coffeeplus.world.features.CoffeeTreeSpawnFeature;
import net.mcreator.coffeeplus.CoffeeMod;

@Mod.EventBusSubscriber
public class CoffeeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CoffeeMod.MODID);
	public static final RegistryObject<Feature<?>> COFFEE_TREE_SPAWN = REGISTRY.register("coffee_tree_spawn", CoffeeTreeSpawnFeature::new);
}
