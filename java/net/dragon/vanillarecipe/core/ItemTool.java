package net.dragon.vanillarecipe.core;

import net.dragon.vanillarecipe.Main;
import net.dragon.vanillarecipe.item.ItemBowlFood;
import net.dragon.vanillarecipe.item.ItemHealPotion;
import net.minecraft.world.food.FoodProperties.Builder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.UseAnim;

public class ItemTool {
	
	public static final Item healPotion(int heal) {
		Properties Properties = new Properties();
		Properties.tab(Main.TAB);
		Properties.stacksTo(8);
		ItemHealPotion Item = new ItemHealPotion(Properties,heal);
		return Item;
	}

	public static final Item food(int food, float healthy, boolean isMeat, boolean fastFood, boolean canEatNoReason) {
		Properties Properties = new Properties();
		Properties.tab(Main.TAB);
		Builder Builder = new Builder();
		Builder.nutrition(food);
		Builder.saturationMod(healthy);
		if (isMeat) {
			Builder.meat();
		}
		if (fastFood) {
			Builder.fast();
		}
		if (canEatNoReason) {
			Builder.alwaysEat();
		}
		Properties.food(Builder.build());
		Item Item = new Item(Properties);
		return Item;
	}
	
	public static final Item foodBowl(int food, float healthy, boolean isMeat, boolean fastFood, boolean canEatNoReason,UseAnim type) {
		Properties Properties = new Properties();
		Properties.tab(Main.TAB);
		Builder Builder = new Builder();
		Builder.nutrition(food);
		Builder.saturationMod(healthy);
		if (isMeat) {
			Builder.meat();
		}
		if (fastFood) {
			Builder.fast();
		}
		if (canEatNoReason) {
			Builder.alwaysEat();
		}
		Properties.food(Builder.build());
		ItemBowlFood Item = new ItemBowlFood(Properties, type);
		return Item;
	}
}
