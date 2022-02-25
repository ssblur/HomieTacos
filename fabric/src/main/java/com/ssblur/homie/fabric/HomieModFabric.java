package com.ssblur.homie.fabric;

import com.ssblur.homie.HomieMod;
import net.fabricmc.api.ModInitializer;

public class HomieModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        HomieMod.init();
    }
}
