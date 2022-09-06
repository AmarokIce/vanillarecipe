package club.someoneice.vailla_recipes;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {
	public static Block CHOCOLATE_BLOCK = new BlockFood();
	public static Block SUGAR_BLOCK = new BlockFood();
	public static Block CARAMEL_BLOCK = new BlockFood();
	public static Block CHEESE_BLOCK = new BlockFood();

	
	public static void init() {
		Registry.register(Registry.BLOCK, new Identifier(VanillaMain.MODID, "block_chocolate"), CHOCOLATE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(VanillaMain.MODID, "block_caramel"), CARAMEL_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(VanillaMain.MODID, "block_sugar"), SUGAR_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(VanillaMain.MODID, "block_cheese"), CHEESE_BLOCK);
		
        Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "block_chocolate"), new BlockItem(CHOCOLATE_BLOCK, new Item.Settings().group(VanillaMain.RECIPES_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "block_caramel"), new BlockItem(CARAMEL_BLOCK, new Item.Settings().group(VanillaMain.RECIPES_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "block_sugar"), new BlockItem(SUGAR_BLOCK, new Item.Settings().group(VanillaMain.RECIPES_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(VanillaMain.MODID, "block_cheese"), new BlockItem(CHEESE_BLOCK, new Item.Settings().group(VanillaMain.RECIPES_GROUP)));
	}


}
