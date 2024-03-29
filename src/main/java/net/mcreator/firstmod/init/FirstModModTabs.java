
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firstmod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.firstmod.FirstModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FirstModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstModMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(FirstModModItems.NEWARMOR_HELMET.get());
			tabData.accept(FirstModModItems.NEWARMOR_CHESTPLATE.get());
			tabData.accept(FirstModModItems.NEWARMOR_LEGGINGS.get());
			tabData.accept(FirstModModItems.NEWARMOR_BOOTS.get());
		}
	}
}
