package com.charizard1596.galvoritetech.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab GALVORITE_TAB = new CreativeModeTab("galvoriteTechTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GALVORITE_INGOT.get());
        }
    };



}
