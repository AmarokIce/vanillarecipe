package club.someoneice.vailla_recipes;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.UseAction;
import net.minecraft.util.registry.Registry;

public class ItemInit {
	
	public static Item COOKED_EGG = ItemTools.ItemFoods(2, 0.9F, false, false, false);
	public static Item COOKED_CARROAT = ItemTools.ItemFoods(4, 1.0F, false, false, false);
	public static Item CACTUSFRUIT = ItemTools.ItemFoods(3, 1.0F, false, false, false);
	public static Item CREAMEL = ItemTools.ItemFoods(3, 1.0F, false, false, false);
	public static Item CHEESE = ItemTools.ItemFoods(3, 1.0F, false, false, false);
	public static Item CHOCOLATE = ItemTools.ItemFoods(3, 1.0F, false, false, false);
	public static Item COOKED_SUGAR_CANE = ItemTools.ItemFoods(3, 1.0F, false, false, false);
	public static Item LOTUS = ItemTools.ItemFoods(3, 1.0F, false, false, false);
	public static Item COOKED_LOTUS = ItemTools.ItemFoods(3, 1.0F, false, false, false);
	public static Item SUGAR_INGOT = ItemTools.ItemFoods(1, 0.1F, false, false, false);
	public static Item TOAST = ItemTools.ItemFoods(3, 1.0F, false, false, false);
	public static Item APPLE_PIE = ItemTools.ItemFoods(3, 1.0F, false, false, false);
	public static Item SMALL_CAKE = ItemTools.ItemFoods(3, 1.0F, false, false, false);
	public static Item SASHIMI = ItemTools.ItemFoods(2, 1.0F, true, false, false);
	public static Item BACON = ItemTools.ItemFoods(3, 0.5F, true, false, false);
	public static Item BEEF_TENDON = ItemTools.ItemFoods(3, 0.5F, true, false, false);
	public static Item SQUID = ItemTools.ItemFoods(1, 0.1F, true, false, false);
	public static Item COOKED_SQUID = ItemTools.ItemFoods(4, 2.0F, true, false, false);
	public static Item GOAT = ItemTools.ItemFoods(1, 0.1F, true, false, false);
	public static Item COOKED_GOAT = ItemTools.ItemFoods(4, 2.0F, true, false, false);
	public static Item BAT = ItemTools.ItemFoods(1, 0.2F, true, false, false);
	public static Item COOKED_BAT = ItemTools.ItemFoods(4, 2.0F, true, false, false);
	
	public static Item ICE_CREAM = ItemTools.BowlFood(4, 1.0F, false, false, UseAction.EAT);
	public static Item VEGETABLE_SALAD = ItemTools.BowlFood(10, 1.0F, false, false, UseAction.EAT);
	public static Item REED_JUICE = ItemTools.BowlFood(4, 1.0F, false, false, UseAction.DRINK);
	public static Item FISH_PORRIDGE = ItemTools.BowlFood(4, 1.0F, false, false, UseAction.DRINK);
	public static Item DESSERT = ItemTools.BowlFood(4, 1.0F, false, false, UseAction.EAT);
	public static Item SEED_SOUP = ItemTools.BowlFood(4, 1.0F, false, false, UseAction.DRINK);
	public static Item LOTUS_SOUP = ItemTools.BowlFood(4, 1.0F, false, false, UseAction.DRINK);
	
	public static Item HEAL_POTION_LOW = ItemTools.HealPotion(4);
	public static Item HEAL_POTION_BASE = ItemTools.HealPotion(8);
	
	
	
	public static void init() {
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "poached_egg"), COOKED_EGG);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "cook_carrots"), COOKED_CARROAT);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "cactusfruit"), CACTUSFRUIT);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "caramel"), CREAMEL);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "cheese"), CHEESE);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "chocolate"), CHOCOLATE);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "cook_sugar_cane"), COOKED_SUGAR_CANE);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "lotus"), LOTUS);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "cook_lotus"), COOKED_LOTUS);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "sugaringot"), SUGAR_INGOT);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "toast"), TOAST);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "apple_pie"), APPLE_PIE);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "smallcake"), SMALL_CAKE);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "sashimi"), SASHIMI);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "bacon"), BACON);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "beef_tendon"), BEEF_TENDON);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "squid"), SQUID);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "cook_squid"), COOKED_SQUID);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "goat"), GOAT);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "cook_goat"), COOKED_GOAT);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "bat"), BAT);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "cook_bat"), COOKED_BAT);
		
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "icecream"), ICE_CREAM);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "vegetablesalad"), VEGETABLE_SALAD);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "reedjuice"), REED_JUICE);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "fishporridge"), FISH_PORRIDGE);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "dessert"), DESSERT);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "seedsoup"), SEED_SOUP);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "lotussoup"), LOTUS_SOUP);
		
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "heal_potion_low"), HEAL_POTION_LOW);
		Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "heal_potion_base"), HEAL_POTION_BASE);
		
	}

}
