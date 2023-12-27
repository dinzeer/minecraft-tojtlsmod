package com.dinzeer.tojtlsmod.daoentity;

import com.dinzeer.tojtlsmod.init.datainit.BlockCreativeTabInit;
import com.dinzeer.tojtlsmod.init.datainit.CreativeTabInit;
import com.dinzeer.tojtlsmod.init.init.Blockinit;
import com.dinzeer.tojtlsmod.init.init.Iteminit;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import static com.dinzeer.tojtlsmod.Tojtlsmod.REGISTRATE;

public class Returner {    //封装类/增键类
    //注册的创造栏、
    private static final CreativeTabInit TABNAME_ONE = new CreativeTabInit(
            "tab_one", () -> Iteminit.BRICK_INGOT
    );
    private static final BlockCreativeTabInit TABNAME_TWO = new BlockCreativeTabInit(
            "tab_two", () -> Blockinit.YOUZI_BLOCK.get().asItem()
    );
    //获取封装后创造栏
    public static CreativeModeTab getTabname() {
        return TABNAME_ONE;
    }
    public static CreativeModeTab getTabname2(){
        return TABNAME_TWO;
    }
    //普通组装
    public static ItemEntry<Item> iteminit(String name){
        return REGISTRATE.item(
                        name,p -> new Item(p)
                ).register();

   }
    //增加语言键
    public static void registerAddlang(){
        REGISTRATE.addRawLang("itemGroup.tojtlsmod.tab_one","minecraft tojtlsmod item");
        REGISTRATE.addRawLang("itemGroup.tojtlsmod.tab_two","minecraft tojtlsmod block");
        REGISTRATE.addRawLang("itemGroup.tojtlsmod.tab_three","minecraft tojtlsmod tool");
        REGISTRATE.addRawLang("itemGroup.tojtlsmod.tab_four","minecraft tojtlsmod jewelry");
    }


}
