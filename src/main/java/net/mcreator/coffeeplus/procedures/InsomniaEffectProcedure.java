package net.mcreator.coffeeplus.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.coffeeplus.init.CoffeeModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InsomniaEffectProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CoffeeModMobEffects.INSOMNIA.get()) : false) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WHITE_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ORANGE_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.MAGENTA_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.LIGHT_BLUE_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.YELLOW_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.LIME_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.PINK_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRAY_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.LIGHT_GRAY_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CYAN_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.PURPLE_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BLUE_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BROWN_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GREEN_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.RED_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BLACK_BED) {
				{
					BlockPos _pos = new BlockPos(x, y, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("You can't sleep after drinking coffee!"), (true));
			}
		}
	}
}
