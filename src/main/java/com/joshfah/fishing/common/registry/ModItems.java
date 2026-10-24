package com.joshfah.fishing.common.registry;

import com.joshfah.fishing.FishYourDiamonds;
import com.joshfah.fishing.item.custom.WeirdRodItem;
import com.joshfah.fishing.item.custom.bait.BasicBait;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FishYourDiamonds.MODID);

    public static final DeferredItem<WeirdRodItem> WEIRD_ROD_ITEM = ITEMS.registerItem("weird_rod", WeirdRodItem::new,
            props -> props
                    .durability(64)
                    .enchantable(1)
                    .rarity(Rarity.RARE)
                    .component(DataComponents.TOOLTIP_STYLE,
                            Identifier.fromNamespaceAndPath(FishYourDiamonds.MODID, "rod_overview")
                    )
    );

    public static final DeferredItem<BasicBait> BASIC_BAIT_ITEM = ITEMS.registerItem("basic_bait", BasicBait::new,
            props -> props
                    .rarity(Rarity.COMMON)
    );
}