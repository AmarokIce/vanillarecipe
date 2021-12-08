package net.dragon.vanillarecipe.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class BlockFood extends Block {

	public BlockFood(Properties Properties) {
		super(Properties);
	}

	@Override
	public InteractionResult use(BlockState block, Level world, BlockPos pos, Player player, InteractionHand data, BlockHitResult hitfx) {
		player.getFoodData().eat(1, 0.1F);
		world.playSound((Player) null, pos, SoundEvents.GENERIC_EAT, SoundSource.BLOCKS, 1.0F, 1.0F + world.random.nextFloat()*0.3F);
		if (!world.isClientSide()) {
			if (world.random.nextInt(16) == 0) {
				world.removeBlock(pos, false);
				world.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
			}
		}
		return InteractionResult.SUCCESS;
	}

}
