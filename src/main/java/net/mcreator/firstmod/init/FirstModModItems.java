
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.firstmod.item.ClaymoreItem;
import net.mcreator.firstmod.FirstModMod;

public class FirstModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FirstModMod.MODID);
	public static final RegistryObject<Item> CLAYMORE = REGISTRY.register("claymore", () -> new ClaymoreItem());
}
