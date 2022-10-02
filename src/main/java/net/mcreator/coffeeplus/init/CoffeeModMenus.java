
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.coffeeplus.world.inventory.GrindingGUIMenu;
import net.mcreator.coffeeplus.world.inventory.CoffeeMachineGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CoffeeModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CoffeeMachineGUIMenu> COFFEE_MACHINE_GUI = register("coffee_machine_gui",
			(id, inv, extraData) -> new CoffeeMachineGUIMenu(id, inv, extraData));
	public static final MenuType<GrindingGUIMenu> GRINDING_GUI = register("grinding_gui",
			(id, inv, extraData) -> new GrindingGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
