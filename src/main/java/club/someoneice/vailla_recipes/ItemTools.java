

package club.someoneice.vailla_recipes;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.UseAction;

public class ItemTools {
	public static Item ItemItems() {
		return new Item(new FabricItemSettings().group(VanillaMain.RECIPES_GROUP));
	}
	
	public static Item ItemFoods(int hunger, float saturation, boolean wolfFood, boolean fastFood, boolean alwaysEat) {
		FabricItemSettings settings = new FabricItemSettings();
		FoodComponent.Builder build = new FoodComponent.Builder();
		
		settings.group(VanillaMain.RECIPES_GROUP);
		settings.maxCount(64);
		
		build.hunger(hunger);
		build.saturationModifier(saturation);
		if (alwaysEat) build.alwaysEdible();
		if (wolfFood) build.meat();
		if (fastFood) build.snack();
		
		settings.food(build.build());
		return new Item(settings);
	}
	
	public static Item BowlFood(int hunger, float saturation, boolean alwaysEat, boolean fastFood, UseAction useAction) {
		FabricItemSettings settings = new FabricItemSettings();
		FoodComponent.Builder build = new FoodComponent.Builder();
		
		settings.group(VanillaMain.RECIPES_GROUP);
		settings.maxCount(1);
		
		build.hunger(hunger);
		build.saturationModifier(saturation);
		if (alwaysEat) build.alwaysEdible();
		if (fastFood) build.snack();
		
		settings.food(build.build());
		return new BowlFood(settings, useAction);
	}
	
	public static Item HealPotion(int heal) {
		FabricItemSettings settings = new FabricItemSettings();
		
		settings.group(VanillaMain.RECIPES_GROUP);
		settings.maxCount(16);
		
		return new HealPotion(settings, heal);
	}
}
