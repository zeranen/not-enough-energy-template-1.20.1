package net.verzex.notenoughenergy.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponent {

    public static final FoodComponent CHAO_FRUIT  = new FoodComponent.Builder().hunger(255).saturationModifier(255.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 25555), 1).build();
}
