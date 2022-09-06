package club.someoneice.vailla_recipes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class VanillaMain implements ModInitializer {
	public static String MODID = "vanillarecipe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	
	public static final ItemGroup RECIPES_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "vanillarecipe"),
			() -> new ItemStack(ItemInit.SMALL_CAKE));

	@Override
	public void onInitialize() {
		ItemInit.init();
		BlockInit.init();

	}
}
