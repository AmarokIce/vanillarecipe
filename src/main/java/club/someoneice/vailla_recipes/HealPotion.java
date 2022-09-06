package club.someoneice.vailla_recipes;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class HealPotion extends Item {
	private int heal;
	
	public HealPotion(Settings setting, int heal) {
		super(setting);
		this.heal = heal;
	}
	
	@Override
	public UseAction getUseAction(ItemStack item) {
		return UseAction.DRINK;
	}

	public int getUseDuration(ItemStack p_43001_) {
		return 32;
	}

	@Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
		return TypedActionResult.consume(itemStack);
    }

	@Override
	public ItemStack finishUsing(ItemStack item, World world, LivingEntity player) {
		if (player instanceof PlayerEntity) {
			if (((PlayerEntity) player).giveItemStack(new ItemStack(Items.GLASS_BOTTLE)) == false) {
				((PlayerEntity) player).dropItem(new ItemStack(Items.GLASS_BOTTLE), false);
			}
            world.playSound((PlayerEntity) player, player.getX(), player.getY(), player.getZ(), SoundEvents.ENTITY_GENERIC_DRINK, SoundCategory.NEUTRAL, 1.0f, 1.0f);
		}

		player.heal(this.heal);
		item.decrement(1);
		return item;
	}

}
