package net.dragon.vanillarecipe.event;

import net.dragon.vanillarecipe.Main;
import net.dragon.vanillarecipe.init.ModItem;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvent {

	@SubscribeEvent
	public void onLifeDrop(LivingDropsEvent event) {
		if (event.getEntityLiving() == null) {
			return;
		}

		if (event.getEntityLiving() instanceof Bat) {
			this.dropItem(event, ModItem.bat.get(),  ModItem.cook_bat.get());
			return;
		}

		if (event.getEntityLiving() instanceof Squid) {
			this.dropItem(event, ModItem.squid.get(),  ModItem.cook_squid.get());
			return;
		}

		if (event.getEntityLiving() instanceof Goat) {
			this.dropItem(event, ModItem.goat.get(),  ModItem.cook_goat.get());
			return;
		}
	}

	public void dropItem(LivingDropsEvent event, Item meat, Item cook) {
		if (event.getEntityLiving().isOnFire()) {
			event.getDrops().add(new ItemEntity(event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(), new ItemStack(cook)));
		} else {
			event.getDrops().add(new ItemEntity(event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(), new ItemStack(meat)));
		}
	}
}
