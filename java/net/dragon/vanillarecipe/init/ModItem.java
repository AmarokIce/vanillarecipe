package net.dragon.vanillarecipe.init;

import java.util.function.Supplier;

import javax.annotation.Nonnull;

import net.dragon.vanillarecipe.Main;
import net.dragon.vanillarecipe.core.ItemTool;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.UseAnim;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

//vanillarecipe

@EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItem {
	public static final DeferredRegister<Item> ItemList = DeferredRegister.create(Item.class, Main.MODID);

	// ½­ªG¡BÂø­¹
	public static final RegistryObject<Item> poached_egg = register(() -> ItemTool.food(2, 0.9F, false, false, false), "poached_egg");
	public static final RegistryObject<Item> cook_carrots = register(() -> ItemTool.food(4, 1.0F, false, false, false), "cook_carrots");
	public static final RegistryObject<Item> cactusfruit = register(() -> ItemTool.food(3, 1.0F, false, false, false), "cactusfruit");
	public static final RegistryObject<Item> caramel = register(() -> ItemTool.food(3, 1.0F, false, false, false), "caramel");
	public static final RegistryObject<Item> cheese = register(() -> ItemTool.food(3, 1.0F, false, false, false), "cheese");
	public static final RegistryObject<Item> chocolate = register(() -> ItemTool.food(3, 1.0F, false, false, false), "chocolate");
	public static final RegistryObject<Item> cook_sugar_cane = register(() -> ItemTool.food(3, 1.0F, false, false, false), "cook_sugar_cane");
	public static final RegistryObject<Item> lotus = register(() -> ItemTool.food(3, 1.0F, false, false, false), "lotus");
	public static final RegistryObject<Item> cook_lotus = register(() -> ItemTool.food(3, 1.0F, false, false, false), "cook_lotus");
	public static final RegistryObject<Item> sugaringot = register(() -> ItemTool.food(1, 0.1F, false, false, false), "sugaringot");
	public static final RegistryObject<Item> toast = register(() -> ItemTool.food(3, 1.0F, false, false, false), "toast");
	public static final RegistryObject<Item> apple_pie = register(() -> ItemTool.food(3, 1.0F, false, false, false), "apple_pie");
	public static final RegistryObject<Item> smallcake = register(() -> ItemTool.food(3, 1.0F, false, false, false), "smallcake");
	public static final RegistryObject<Item> sashimi = register(() -> ItemTool.food(2, 1.0F, true, false, false), "sashimi");
	public static final RegistryObject<Item> bacon = register(() -> ItemTool.food(3, 0.5F, true, false, false), "bacon");
	public static final RegistryObject<Item> beef_tendon = register(() -> ItemTool.food(3, 0.5F, true, false, false), "beef_tendon");
	public static final RegistryObject<Item> squid = register(() -> ItemTool.food(1, 0.1F, true, false, false), "squid");
	public static final RegistryObject<Item> cook_squid = register(() -> ItemTool.food(4, 2.0F, true, false, false), "cook_squid");
	public static final RegistryObject<Item> goat = register(() -> ItemTool.food(1, 0.1F, true, false, false), "goat");
	public static final RegistryObject<Item> cook_goat = register(() -> ItemTool.food(4, 2.0F, true, false, false), "cook_goat");
	public static final RegistryObject<Item> bat = register(() -> ItemTool.food(1, 0.2F, true, false, false), "bat");
	public static final RegistryObject<Item> cook_bat = register(() -> ItemTool.food(4, 2.0F, true, false, false), "cook_bat");
	public static final RegistryObject<Item> icecream = register(() -> ItemTool.foodBowl(4, 1.0F, false, false, false, UseAnim.EAT), "icecream");
	public static final RegistryObject<Item> vegetablesalad = register(() -> ItemTool.foodBowl(10, 1.0F, false, false, false, UseAnim.EAT), "vegetablesalad");
	public static final RegistryObject<Item> reedjuice = register(() -> ItemTool.foodBowl(4, 1.0F, false, false, false, UseAnim.DRINK), "reedjuice");
	public static final RegistryObject<Item> fishporridge = register(() -> ItemTool.foodBowl(4, 1.0F, false, false, false, UseAnim.DRINK), "fishporridge");
	public static final RegistryObject<Item> dessert = register(() -> ItemTool.foodBowl(4, 1.0F, false, false, false, UseAnim.EAT), "dessert");
	public static final RegistryObject<Item> seedsoup = register(() -> ItemTool.foodBowl(4, 1.0F, false, false, false, UseAnim.DRINK), "seedsoup");
	public static final RegistryObject<Item> lotussoup = register(() -> ItemTool.foodBowl(4, 1.0F, false, false, false, UseAnim.DRINK), "lotussoup");
	public static final RegistryObject<Item> heal_potion_low = register(() -> ItemTool.healPotion(4), "heal_potion_low");
	public static final RegistryObject<Item> heal_potion_base = register(() -> ItemTool.healPotion(8), "heal_potion_base");

	
	public static RegistryObject<Item> register(@Nonnull Supplier<Item> initializer, @Nonnull String name) {
		return ItemList.register(name, initializer);
	}
}
