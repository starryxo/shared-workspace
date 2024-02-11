
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.firstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.firstmod.item.NewarmorItem;
import net.mcreator.firstmod.FirstModMod;

public class FirstModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FirstModMod.MODID);
	public static final RegistryObject<Item> NEWARMOR_HELMET = REGISTRY.register("newarmor_helmet", () -> new NewarmorItem.Helmet());
	public static final RegistryObject<Item> NEWARMOR_CHESTPLATE = REGISTRY.register("newarmor_chestplate", () -> new NewarmorItem.Chestplate());
	public static final RegistryObject<Item> NEWARMOR_LEGGINGS = REGISTRY.register("newarmor_leggings", () -> new NewarmorItem.Leggings());
	public static final RegistryObject<Item> NEWARMOR_BOOTS = REGISTRY.register("newarmor_boots", () -> new NewarmorItem.Boots());
}
