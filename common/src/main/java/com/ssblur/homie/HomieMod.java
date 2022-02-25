package com.ssblur.homie;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class HomieMod {
    public static final String MOD_ID = "homie";
    public static final CreativeModeTab HOMIE_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "homie_tab"), () ->
            new ItemStack(HomieMod.HOMIE_TACO.get()));
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<Item> ROTTEN_HOMIE_TACO = ITEMS.register("rotten_homie_taco", () ->
        new Item(new Item.Properties()
            .tab(HomieMod.HOMIE_TAB)
            .food(new FoodProperties.Builder()
                .nutrition(8)
                .saturationMod(0)
                .effect(new MobEffectInstance(MobEffects.HUNGER, 120), 1)
                .meat()
                .build())));
    public static final RegistrySupplier<Item> HOMIE_TACO = ITEMS.register("homie_taco", () ->
            new Item(new Item.Properties()
                .tab(HomieMod.HOMIE_TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(8)
                        .saturationMod(16)
                        .meat()
                        .build())));
    public static final RegistrySupplier<Item> DUDE_MEAT = ITEMS.register("dude_meat", () ->
            new Item(new Item.Properties()
                    .tab(HomieMod.HOMIE_TAB)
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationMod(4)
                            .meat()
                            .build())));
    
    public static void init() {
        ITEMS.register();
    }
}
