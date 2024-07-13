package net.cameron.plants_v_machines.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).build();
    public static final FoodProperties LETTUCE = new FoodProperties.Builder().nutrition(1)
            .fast().build();
    public static final FoodProperties OLIVE = new FoodProperties.Builder().nutrition(1)
            .build();
    public static final FoodProperties BOLOGNA = new FoodProperties.Builder().nutrition(6)
            .build();
    public static final FoodProperties SWISS_CHEESE = new FoodProperties.Builder().nutrition(3)
            .build();
    public static final FoodProperties SANDVICH = new FoodProperties.Builder().nutrition(14)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 80, 6), 1f).build();
}
