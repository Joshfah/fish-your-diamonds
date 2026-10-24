package com.joshfah.fishing.common.registry;

import com.joshfah.fishing.FishYourDiamonds;
import com.joshfah.fishing.item.custom.bait.Bait;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class ModDataComponents {

    public static final DeferredRegister.DataComponents COMPONENTS = DeferredRegister.createDataComponents(
            Registries.DATA_COMPONENT_TYPE,
            FishYourDiamonds.MODID
    );

    public static final Supplier<DataComponentType<ItemStack>> BAIT = COMPONENTS.registerComponentType(
            "bait",
            builder -> builder
                    .persistent(ItemStack.CODEC)
                    .networkSynchronized(ItemStack.STREAM_CODEC)
    );

}
