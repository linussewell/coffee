
package net.mcreator.coffeeplus.block;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.Containers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.coffeeplus.world.inventory.GrindingGUIMenu;
import net.mcreator.coffeeplus.procedures.GrindingProcedureProcedure;
import net.mcreator.coffeeplus.init.CoffeeModBlocks;
import net.mcreator.coffeeplus.block.entity.GrinderBlockEntity;

import java.util.List;
import java.util.Collections;

import io.netty.buffer.Unpooled;

public class GrinderBlock extends Block
		implements

			EntityBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;

	public GrinderBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL).sound(SoundType.METAL).strength(1f, 10f).requiresCorrectToolForDrops()
				.noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {

		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(5, 10, 9, 11, 14, 15), box(7, 9, 11, 9, 10, 13), box(4, 1, 1, 12, 15, 9), box(4, 0, 1, 12, 1, 15),
					box(11, 11, 11, 12, 13, 13), box(7, 9, 9, 9, 10, 10), box(6, 6, 9, 10, 9, 10), box(9, 6, 10, 10, 7, 14), box(6, 6, 10, 7, 7, 14),
					box(5, 16, 2, 11, 21, 8), box(6, 15, 3, 10, 16, 7));
			case NORTH -> Shapes.or(box(5, 10, 1, 11, 14, 7), box(7, 9, 3, 9, 10, 5), box(4, 1, 7, 12, 15, 15), box(4, 0, 1, 12, 1, 15),
					box(4, 11, 3, 5, 13, 5), box(7, 9, 6, 9, 10, 7), box(6, 6, 6, 10, 9, 7), box(6, 6, 2, 7, 7, 6), box(9, 6, 2, 10, 7, 6),
					box(5, 16, 8, 11, 21, 14), box(6, 15, 9, 10, 16, 13));
			case EAST -> Shapes.or(box(9, 10, 5, 15, 14, 11), box(11, 9, 7, 13, 10, 9), box(1, 1, 4, 9, 15, 12), box(1, 0, 4, 15, 1, 12),
					box(11, 11, 4, 13, 13, 5), box(9, 9, 7, 10, 10, 9), box(9, 6, 6, 10, 9, 10), box(10, 6, 6, 14, 7, 7), box(10, 6, 9, 14, 7, 10),
					box(2, 16, 5, 8, 21, 11), box(3, 15, 6, 7, 16, 10));
			case WEST -> Shapes.or(box(1, 10, 5, 7, 14, 11), box(3, 9, 7, 5, 10, 9), box(7, 1, 4, 15, 15, 12), box(1, 0, 4, 15, 1, 12),
					box(3, 11, 11, 5, 13, 12), box(6, 9, 7, 7, 10, 9), box(6, 6, 6, 7, 9, 10), box(2, 6, 9, 6, 7, 10), box(2, 6, 6, 6, 7, 7),
					box(8, 16, 5, 14, 21, 11), box(9, 15, 6, 13, 16, 10));
			case UP -> Shapes.or(box(5, 9, 10, 11, 15, 14), box(7, 11, 9, 9, 13, 10), box(4, 1, 1, 12, 9, 15), box(4, 1, 0, 12, 15, 1),
					box(4, 11, 11, 5, 13, 13), box(7, 9, 9, 9, 10, 10), box(6, 9, 6, 10, 10, 9), box(6, 10, 6, 7, 14, 7), box(9, 10, 6, 10, 14, 7),
					box(5, 2, 16, 11, 8, 21), box(6, 3, 15, 10, 7, 16));
			case DOWN -> Shapes.or(box(5, 1, 2, 11, 7, 6), box(7, 3, 6, 9, 5, 7), box(4, 7, 1, 12, 15, 15), box(4, 1, 15, 12, 15, 16),
					box(4, 3, 3, 5, 5, 5), box(7, 6, 6, 9, 7, 7), box(6, 6, 7, 10, 7, 10), box(6, 2, 9, 7, 6, 10), box(9, 2, 9, 10, 6, 10),
					box(5, 8, -5, 11, 14, 0), box(6, 9, 0, 10, 13, 1));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public PushReaction getPistonPushReaction(BlockState state) {
		return PushReaction.DESTROY;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 1;
		return false;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			GrindingProcedureProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		if (entity instanceof ServerPlayer player) {
			NetworkHooks.openGui(player, new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return new TextComponent("Coffee Grinder");
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
					return new GrindingGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(pos));
				}
			}, pos);
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new GrinderBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof GrinderBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof GrinderBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(CoffeeModBlocks.GRINDER.get(), renderType -> renderType == RenderType.cutout());
	}

}
