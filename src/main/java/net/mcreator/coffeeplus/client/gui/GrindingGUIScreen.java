package net.mcreator.coffeeplus.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.coffeeplus.world.inventory.GrindingGUIMenu;
import net.mcreator.coffeeplus.network.GrindingGUIButtonMessage;
import net.mcreator.coffeeplus.CoffeeMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GrindingGUIScreen extends AbstractContainerScreen<GrindingGUIMenu> {
	private final static HashMap<String, Object> guistate = GrindingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_grind;

	public GrindingGUIScreen(GrindingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("coffee:textures/screens/grinding_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("coffee:textures/screens/arrow.png"), this.leftPos + 77, this.topPos + 26, 0, 0, 22, 15, 22, 15);

		guiGraphics.blit(new ResourceLocation("coffee:textures/screens/coffee_beans_blank.png"), this.leftPos + 34, this.topPos + 26, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("coffee:textures/screens/ground_coffee_blank.png"), this.leftPos + 124, this.topPos + 26, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.coffee.grinding_gui.label_coffee_grinder"), 51, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_grind = Button.builder(Component.translatable("gui.coffee.grinding_gui.button_grind"), e -> {
			if (true) {
				CoffeeMod.PACKET_HANDLER.sendToServer(new GrindingGUIButtonMessage(0, x, y, z));
				GrindingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 64, this.topPos + 52, 45, 20).build();
		guistate.put("button:button_grind", button_grind);
		this.addRenderableWidget(button_grind);
	}
}
