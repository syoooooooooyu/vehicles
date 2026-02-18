package com.syoyu.vehicles.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public final class ItemLoader {

    private static final DeferredRegister<Item> repository = DeferredRegister.create(ForgeRegistries.ITEMS, "vehicles");

    private static final List<String> items = List.of(
            "car_item"
    );

    ItemLoader(BusGroup bus){
        for (String customItem: items) {
            repository.register(customItem, () -> new Item(new Item.Properties()));
        }
        repository.register(bus);
    }
}
