package com.caliberzenith.alqemia.init;

import com.caliberzenith.alqemia.Alqemia;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockForge {

    // Deferred Register
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Alqemia.MODID);

    // Block Register
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
}
