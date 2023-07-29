package com.sunset.lavafishing.util.RegistryCollection;

import com.sunset.lavafishing.item.ItemObsidianFishingRod;
import com.sunset.lavafishing.item.fishes.*;
import com.sunset.lavafishing.util.Reference;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemCollection
{

    public static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> ITEM_OBSIDIAN_FISHING_ROD = ITEM_DEFERRED_REGISTER.register("obsidian_fishing_rod", ItemObsidianFishingRod::new);

    public static final RegistryObject<Item> ITEM_QUARTZ_FISH = ITEM_DEFERRED_REGISTER.register("quartz_fish", ItemQuartzFish::new);

    public static final RegistryObject<Item> ITEM_FLAME_SQUAT_LOBSTER = ITEM_DEFERRED_REGISTER.register("flame_squat_lobster", ItemFlameSquatLobster::new);

    public static final RegistryObject<Item> ITEM_OBSIDIAN_SWORD_FISH = ITEM_DEFERRED_REGISTER.register("obsidian_sword_fish", ItemObsidianSwordFish::new);

    public static final RegistryObject<Item> ITEM_STEAM_FLYING_FISH = ITEM_DEFERRED_REGISTER.register("steam_flying_fish", ItemSteamFlyingFish::new);

    public static final RegistryObject<Item> ITEM_AROWANA_FISH = ITEM_DEFERRED_REGISTER.register("arowana_fish", ItemArowanaFish::new);

    public static final RegistryObject<Item> ITEM_AGNI_FISH = ITEM_DEFERRED_REGISTER.register("agni_fish", ItemAgniFish::new);

}