package net.marshidev.lowerdimensions.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent ALMOND_WATER = new FoodComponent.Builder().hunger(5).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 0.75f).build();
}
