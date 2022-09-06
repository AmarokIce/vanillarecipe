package club.someoneice.vailla_recipes;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class BowlFood extends Item {
	private UseAction useAction;
	public BowlFood(Settings settings, UseAction useAction) {
		super(settings);
		this.useAction = useAction;
	}
	
	@Override
	public UseAction getUseAction(ItemStack item) {
		return this.useAction;
	}

	@Override
	public ItemStack finishUsing(ItemStack item, World LV, LivingEntity player) {
		if (player instanceof PlayerEntity) {
			if (((PlayerEntity) player).giveItemStack(new ItemStack(Items.BOWL)) == false) {
				((PlayerEntity) player).dropItem(new ItemStack(Items.BOWL), false);
			}
		}
		return super.finishUsing(item, LV, player);
	}

}
