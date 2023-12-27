package com.dinzeer.tojtlsmod.init.datainit;

import com.dinzeer.tojtlsmod.Tojtlsmod;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

import static com.dinzeer.tojtlsmod.Tojtlsmod.REGISTRATE;

public class CreativeTabInit extends CreativeModeTab{

    private Supplier<ItemEntry> icon;

    public  CreativeTabInit(String id, Supplier<ItemEntry> icon) {
        super(Tojtlsmod.MODID + "." + id);
        this.icon = icon;
    }

    @Override
    public ItemStack makeIcon() {
        return icon.get().asStack();
    }



}
