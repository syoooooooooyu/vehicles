package com.syoyu.vehicles;

import com.mojang.logging.LogUtils;
import com.syoyu.vehicles.event.EventRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Vehicles.MOD_ID)
public final class Vehicles {

    public static final String MOD_ID = "Vehicles";
    private static final Logger LOGGER = LogUtils.getLogger();

    private static Vehicles instance = null;

    public Vehicles(FMLJavaModLoadingContext context) {
        instance = this;
        EventRegister.register(context.getModBusGroup());
    }

    public static Vehicles getInstance(){
        if(instance == null){
            throw new IllegalStateException("Vehicles instance is not initialized yet!");
        }
        return instance;
    }

    public static Logger getLogger(){
        return LOGGER;
    }
}
