package net.treadonme.goodoldgreendays.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.treadonme.goodoldgreendays.GoodOldGreenDays;

public class ModItems {
    public static final Item CANNABIS_PLANT = registerItem("cannabis_plant", new Item(new FabricItemSettings()));
    public static final Item BROWNIE = registerItem("brownie", new Item(new FabricItemSettings()));
    public static final Item BROWNIE_MIX = registerItem("brownie_mix", new Item(new FabricItemSettings()));
    public static final Item WEED_BROWNIE = registerItem("weed_brownie", new Item(new FabricItemSettings()));
    public static final Item WEED_BROWNIE_MIX = registerItem("weed_brownie_mix", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(GoodOldGreenDays.MOD_ID, name), item);
    }

    public static void registerModItems(){
        GoodOldGreenDays.LOGGER.info("Registering mod items for" + GoodOldGreenDays.MOD_ID);
    }
}
