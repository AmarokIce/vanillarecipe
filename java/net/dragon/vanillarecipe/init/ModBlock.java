package net.dragon.vanillarecipe.init;

import java.util.function.Supplier;

import javax.annotation.Nonnull;
import net.dragon.vanillarecipe.Main;
import net.dragon.vanillarecipe.core.BlockTool;
import net.dragon.vanillarecipe.item.ItemBlockFood;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

@EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlock {
	// vanillarecipe
	public static final DeferredRegister<Block> BlockList = DeferredRegister.create(Block.class, Main.MODID);

	public static final RegistryObject<Block> block_chocolate = register(BlockTool.addBlockFood(Material.STONE), "block_chocolate");
	public static final RegistryObject<Block> block_caramel = register(BlockTool.addBlockFood(Material.STONE), "block_caramel");
	public static final RegistryObject<Block> block_sugar = register(BlockTool.addBlockFood(Material.STONE), "block_sugar");
	public static final RegistryObject<Block> block_cheese = register(BlockTool.addBlockFood(Material.STONE), "block_cheese");

	public static RegistryObject<Block> register(@Nonnull Block block, @Nonnull String names) {
		ModItem.register(() -> new ItemBlockFood(block, new Item.Properties().tab(Main.TAB)), names);
		return registerBaseBlock(() -> block, names);
	}

	public static RegistryObject<Block> registerBaseBlock(@Nonnull Supplier<Block> initializer, @Nonnull String name) {
		return BlockList.register(name, initializer);
	}
}
