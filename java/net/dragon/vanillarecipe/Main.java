package net.dragon.vanillarecipe;

import net.dragon.vanillarecipe.event.ModEvent;
import net.dragon.vanillarecipe.init.ModBlock;
import net.dragon.vanillarecipe.init.ModItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nonnull;

@Mod("vanillarecipe")
public class Main {
	//VanillaRecipe
	public static final String MODID = "vanillarecipe";
	public static final String Version = "1.0.0";
	public static final Logger LOGGER = LogManager.getLogger("[VanillaRecipe]");
	
	public static final CreativeModeTab TAB = new CreativeModeTab("vanillarecipe") {
		@Nonnull
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ModItem.poached_egg.get());
		}
	};
	
	public Main() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		MinecraftForge.EVENT_BUS.register(this);
		ModItem.ItemList.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModBlock.BlockList.register(FMLJavaModLoadingContext.get().getModEventBus());
		MinecraftForge.EVENT_BUS.register(new ModEvent());
	}

	private void setup(final FMLCommonSetupEvent event) {
	}


	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
	}

}
