package net.lockl00p.firstmod.items;

import net.lockl00p.firstmod.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static Item regItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(FirstMod.mod_id, name), item);
    }
    public static void regModItems(){
        FirstMod.LOGGER.info(("Registering Mod Items for " + FirstMod.mod_id));
    }
}
