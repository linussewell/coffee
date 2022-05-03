
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.coffeeplus.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.coffeeplus.client.gui.GrinderGUIScreen;
import net.mcreator.coffeeplus.client.gui.CoffeeMachineGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CoffeeplusModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(CoffeeplusModMenus.COFFEE_MACHINE_GUI, CoffeeMachineGUIScreen::new);
			MenuScreens.register(CoffeeplusModMenus.GRINDER_GUI, GrinderGUIScreen::new);
		});
	}
}
