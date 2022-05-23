package net.lockl00p.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lockl00p.firstmod.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class ModItems {
// The item at hand, using fabric itemsettings to determine the group and create the rest of the item.
    public static final Item MOONCHEEZE_INGOT = regitem("mooncheeze_ingot",new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static Item regitem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.modid,name), item);
    }
    public static void regItems(){
        FirstMod.LOGGER.info("Registering Mod Items for" + FirstMod.modid);

    }
}
