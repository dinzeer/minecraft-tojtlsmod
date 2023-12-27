package com.dinzeer.tojtlsmod.init.init;

import com.dinzeer.tojtlsmod.daoentity.Returner;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static com.dinzeer.tojtlsmod.Tojtlsmod.REGISTRATE;

public class Blockinit  {
    private static CreativeModeTab TABNAME= Returner.getTabname2();
    static {
        REGISTRATE.creativeModeTab(() -> TABNAME);
    }

    public static final RegistryEntry<Block> CRIMSON_INGOT_ORE = REGISTRATE.block("crimson_ingot_ore",
            p->new Block(BlockBehaviour.Properties.copy(Blocks.STONE))).tag(
            BlockTags.MINEABLE_WITH_PICKAXE,BlockTags.NEEDS_DIAMOND_TOOL
    ).item().build().register();
    public static final RegistryEntry<Block> YOUZI_INGOT_ORE = REGISTRATE.block("youzi_ingot_ore",
            p->new Block(BlockBehaviour.Properties.copy(Blocks.STONE))).tag(
            BlockTags.MINEABLE_WITH_PICKAXE,BlockTags.NEEDS_IRON_TOOL
    ).item().build().register();
    public static final RegistryEntry<Block> YOUZI_BLOCK = REGISTRATE.block("youzi_block",
            p->new Block(BlockBehaviour.Properties.copy(Blocks.STONE))).tag(
            BlockTags.MINEABLE_WITH_PICKAXE,BlockTags.NEEDS_IRON_TOOL
    ).item().build().register();
    public static void register(){

    }
}
