package com.joshfah.fishing.common.registry;

import com.joshfah.fishing.FishYourDiamonds;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MagmaBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FishYourDiamonds.MODID);

    public static final Supplier<CreativeModeTab> FISH_TAB =  CREATIVE_MODE_TABS.register("fish_your_diamonds", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + FishYourDiamonds.MODID + ".fish_your_diamonds"))
            .icon(() -> new ItemStack(Blocks.ACACIA_LEAVES))
            .displayItems((param, output) -> {
                output.accept(Blocks.ACACIA_LEAVES);
                output.accept(ModItems.WEIRD_ROD_ITEM);
            })
            .build()
    );
}
