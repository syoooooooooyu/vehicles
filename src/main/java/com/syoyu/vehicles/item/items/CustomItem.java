package com.syoyu.vehicles.item.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public abstract class CustomItem extends Item{

    public CustomItem(Properties properties) {
        super(properties);
    }

    public abstract String getItemName();
}
