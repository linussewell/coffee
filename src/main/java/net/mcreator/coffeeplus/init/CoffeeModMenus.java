
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.coffeeplus.world.inventory.GrindingGUIMenu;
import net.mcreator.coffeeplus.world.inventory.CoffeeMachineGUIMenu;
import net.mcreator.coffeeplus.CoffeeMod;

public class CoffeeModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CoffeeMod.MODID);
	public static final RegistryObject<MenuType<CoffeeMachineGUIMenu>> COFFEE_MACHINE_GUI = REGISTRY.register("coffee_machine_gui", () -> IForgeMenuType.create(CoffeeMachineGUIMenu::new));
	public static final RegistryObject<MenuType<GrindingGUIMenu>> GRINDING_GUI = REGISTRY.register("grinding_gui", () -> IForgeMenuType.create(GrindingGUIMenu::new));
}
