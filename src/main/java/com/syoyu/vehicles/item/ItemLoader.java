package com.syoyu.vehicles.item;

import com.syoyu.vehicles.item.items.CustomItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public final class ItemLoader {

    private static final DeferredRegister<Item> repository = DeferredRegister.create(ForgeRegistries.ITEMS, "vehicles");

    private static final List<CustomItem> items = List.of(

    );

    ItemLoader(BusGroup bus){
        for (CustomItem customItem: items) {
            repository.register(customItem.getItemName(), () -> new Item(new Item.Properties()));
        }
        repository.register(bus);
    }
}
