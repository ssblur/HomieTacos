package com.ssblur.homie.forge;

import com.ssblur.homie.HomieMod;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HomieMod.MOD_ID)
public class HomieModForge {
    public HomieModForge() {
        EventBuses.registerModEventBus(HomieMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        HomieMod.init();
    }
}
