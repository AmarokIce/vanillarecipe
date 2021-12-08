package net.dragon.vanillarecipe.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class ItemBlockFood extends BlockItem{

	public ItemBlockFood(Block Block, Properties Properties) {
		super(Block, Properties);
	}
	
	@Override
	public void appendHoverText(ItemStack items, @Nullable Level world, List<Component> list, TooltipFlag data) {
		list.add(new TranslatableComponent("info.block.food").withStyle(ChatFormatting.GRAY));
	}

}
