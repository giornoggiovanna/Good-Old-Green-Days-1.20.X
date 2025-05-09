package net.treadonme.goodoldgreendays.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.treadonme.goodoldgreendays.GoodOldGreenDays;

public class ModBlocks {
    public static final Block TREAD_ON_ME_BLOCK = registerBlock("tread_on_me",
            new Block(FabricBlockSettings.copyOf(Blocks.BEDROCK)));


    public static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(GoodOldGreenDays.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(GoodOldGreenDays.MOD_ID, name), block);
    }


    public static void registerModBlocks(){
        GoodOldGreenDays.LOGGER.info("Registering ModBlocks for " + GoodOldGreenDays.MOD_ID);
    }
}
