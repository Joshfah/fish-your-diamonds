package com.joshfah.fishing.item.custom;

import com.joshfah.fishing.datacomponent.RodTooltipComponent;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;

import java.util.Optional;

public class WeirdRodItem extends FishingRodItem {
    public WeirdRodItem(Properties properties) {
        super(properties);
    }

    @Override
    public Optional<TooltipComponent> getTooltipImage(ItemStack stack) {
        return Optional.of(new RodTooltipComponent());
    }

    public record RodTooltipComponent() implements TooltipComponent {}

}