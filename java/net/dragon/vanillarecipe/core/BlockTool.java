package net.dragon.vanillarecipe.core;

import net.dragon.vanillarecipe.block.BlockFood;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class BlockTool {

	public static final Block addBlockFood(Material Material) {
		Properties data = Properties.of(Material);
		BlockFood BlockFood = new BlockFood(data);
		return BlockFood;
	}
}
