package com.charizard1596.galvoritetech.item;

import com.charizard1596.galvoritetech.GalvoriteTech;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.charizard1596.galvoritetech.GalvoriteTech;



public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GalvoriteTech.MOD_ID);

    public static final RegistryObject<Item> GALVORITE_INGOT = ITEMS.register("galvorite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GALVORITE_TAB)));
    public static final RegistryObject<Item> GALVORITE_NUGGET = ITEMS.register("galvorite_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GALVORITE_TAB)));
    public static final RegistryObject<Item> RAW_GALVORITE = ITEMS.register("raw_galvorite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GALVORITE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
