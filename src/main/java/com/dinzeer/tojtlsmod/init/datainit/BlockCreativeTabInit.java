package com.dinzeer.tojtlsmod.init.datainit;

import com.dinzeer.tojtlsmod.Tojtlsmod;
import com.dinzeer.tojtlsmod.init.init.Blockinit;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class BlockCreativeTabInit extends CreativeModeTab {
    private Supplier<Item> icon;
    public  BlockCreativeTabInit(String id, Supplier<Item> icon) {
        super(Tojtlsmod.MODID + "." + id);
        this.icon = icon;
    }

    @Override
    public ItemStack makeIcon() {

        return new ItemStack(icon.get().asItem());
    }


}
