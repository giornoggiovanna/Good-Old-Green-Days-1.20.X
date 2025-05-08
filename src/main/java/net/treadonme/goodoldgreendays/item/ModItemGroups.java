package net.treadonme.goodoldgreendays.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.treadonme.goodoldgreendays.GoodOldGreenDays;

public class ModItemGroups {

    public static final ItemGroup DRUG_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GoodOldGreenDays.MOD_ID, "drug_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.drug_group"))
                    .icon(() -> new ItemStack(ModItems.CANNABIS_PLANT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CANNABIS_PLANT);
                    }).build());

    public static void registerItemGroups() {
        GoodOldGreenDays.LOGGER.info("Registering item groups for" + GoodOldGreenDays.MOD_ID);
    }
}
