package club.someoneice.vailla_recipes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class BlockFood extends Block {

	public BlockFood() {
		super(FabricBlockSettings.of(Material.SNOW_BLOCK).hardness(1.0f));	
	}
	
    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockHitResult blockHitResult) {
		player.getHungerManager().add(1, 0.1F);
        world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5f, world.random.nextFloat() * 0.1f + 0.9f);
		if (!world.isClient()) {
			if (world.random.nextInt(16) == 0) {
				world.removeBlock(blockPos, false);
				world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, blockPos);
			}
		}
    	
    	return ActionResult.SUCCESS;
    	
    }

}
