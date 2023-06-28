package net.mcreator.coffeeplus.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.mcreator.coffeeplus.world.inventory.CoffeeMachineGUIMenu;
import net.mcreator.coffeeplus.network.CoffeeMachineGUIButtonMessage;
import net.mcreator.coffeeplus.CoffeeMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CoffeeMachineGUIScreen extends AbstractContainerScreen<CoffeeMachineGUIMenu> {
	private final static HashMap<String, Object> guistate = CoffeeMachineGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_brew;

	public CoffeeMachineGUIScreen(CoffeeMachineGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("coffee:textures/screens/coffee_machine_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("coffee:textures/screens/arrow.png"));
		this.blit(ms, this.leftPos + 76, this.topPos + 26, 0, 0, 22, 15, 22, 15);

		RenderSystem.setShaderTexture(0, new ResourceLocation("coffee:textures/screens/ground_coffee_blank.png"));
		this.blit(ms, this.leftPos + 34, this.topPos + 26, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("coffee:textures/screens/empty_mug_blank.png"));
		this.blit(ms, this.leftPos + 34, this.topPos + 53, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("coffee:textures/screens/full_mug_blank.png"));
		this.blit(ms, this.leftPos + 124, this.topPos + 26, 0, 0, 16, 16, 16, 16);

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
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.coffee.coffee_machine_gui.label_coffee_machine"), 50, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_brew = Button.builder(Component.translatable("gui.coffee.coffee_machine_gui.button_brew"), e -> {
			if (true) {
				CoffeeMod.PACKET_HANDLER.sendToServer(new CoffeeMachineGUIButtonMessage(0, x, y, z));
				CoffeeMachineGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 65, this.topPos + 52, 45, 20).build();
		guistate.put("button:button_brew", button_brew);
		this.addRenderableWidget(button_brew);
	}
}
