package com.chikoritalover.caffeinated.registry;

import com.chikoritalover.caffeinated.Caffeinated;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item COFFEE_BERRIES = new Item(new Item.Settings().food(ModFoodComponents.COFFEE_BERRIES).group(ItemGroup.FOOD));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Caffeinated.MODID, "coffee_berries"), COFFEE_BERRIES);
    }
}
