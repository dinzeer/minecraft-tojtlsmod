package com.dinzeer.tojtlsmod.init.init;

import com.dinzeer.tojtlsmod.Tojtlsmod;
import com.dinzeer.tojtlsmod.daoentity.Returner;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.dinzeer.tojtlsmod.Tojtlsmod.REGISTRATE;

public class Iteminit {
    private static CreativeModeTab TABNAME= Returner.getTabname();
    static {
        REGISTRATE.creativeModeTab(() -> TABNAME);
    }
    public static final ItemEntry<Item> CRIMSON_INGOT=Returner.iteminit("crimson_ingot");
    public static final ItemEntry<Item> BRICK_INGOT=Returner.iteminit("brick_ingot");
    public static final ItemEntry<Item> YOUZI_INGOT=Returner.iteminit("youzi_ingot");
    public static final ItemEntry<Item> YOUZI_GRANULES=Returner.iteminit("youzi_granules");
    public static final ItemEntry<Item> OVER_EMERALD=Returner.iteminit("over_emerald");



    public  static void register(){

            }

}
