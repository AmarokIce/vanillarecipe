package net.dragon.vanillarecipe.item;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class ItemHealPotion extends Item {
	int heal;

	public ItemHealPotion(Item.Properties Properties, int heal) {
		super(Properties);
		this.heal = heal;
	}

	@Override
	public UseAnim getUseAnimation(ItemStack item) {
		return UseAnim.DRINK;
	}

	public int getUseDuration(ItemStack p_43001_) {
		return 32;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
		return ItemUtils.startUsingInstantly(world, player, hand);
	}

	@Override
	public ItemStack finishUsingItem(ItemStack item, Level world, LivingEntity player) {
		if (player instanceof Player) {
			if (((Player) player).getInventory().add(new ItemStack(Items.GLASS_BOTTLE)) == false) {
				((Player) player).drop(new ItemStack(Items.GLASS_BOTTLE), false);
			}
			world.playSound((Player) null, player.blockPosition(), SoundEvents.GENERIC_EAT, SoundSource.NEUTRAL, 1.0F, 1.0F + world.random.nextFloat() * 0.3F);
		}

		player.heal(this.heal);
		item.shrink(1);
		return item;
	}

	@Override
	public void appendHoverText(ItemStack items, @Nullable Level world, List<Component> list, TooltipFlag data) {
		list.add(new TranslatableComponent("info.heal.potion").withStyle(ChatFormatting.GRAY));
	}
}