package net.lockl00p.firstmod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lockl00p.firstmod.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item MYTHRIL_INGOT = regItem("mythril_ingot", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static Item regItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.mod_id, name), item);
    }
    public static void regModItems(){
        FirstMod.LOGGER.info(("Registering Mod Items for " + FirstMod.mod_id));
    }
}
