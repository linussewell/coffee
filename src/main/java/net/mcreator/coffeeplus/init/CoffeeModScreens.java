
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.coffeeplus.client.gui.GrindingGUIScreen;
import net.mcreator.coffeeplus.client.gui.CoffeeMachineGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CoffeeModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CoffeeModMenus.COFFEE_MACHINE_GUI.get(), CoffeeMachineGUIScreen::new);
			MenuScreens.register(CoffeeModMenus.GRINDING_GUI.get(), GrindingGUIScreen::new);
		});
	}
}
