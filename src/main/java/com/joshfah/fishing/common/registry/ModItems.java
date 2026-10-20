package com.joshfah.fishing.common.registry;

import com.joshfah.fishing.FishYourDiamonds;
import com.joshfah.fishing.item.custom.WeirdRodItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FishYourDiamonds.MODID);

    public static final DeferredItem<WeirdRodItem> WEIRD_ROD_ITEM = ITEMS.registerItem("weird_rod", WeirdRodItem::new, props -> props.durability(64).enchantable(1));
}