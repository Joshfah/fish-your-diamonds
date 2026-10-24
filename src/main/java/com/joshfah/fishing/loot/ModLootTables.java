package com.joshfah.fishing.loot;

import com.joshfah.fishing.FishYourDiamonds;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

public class ModLootTables {
    public static final ResourceKey<LootTable> WEIRD_ROD_TABLE = ResourceKey.create(
            Registries.LOOT_TABLE,
            Identifier.fromNamespaceAndPath(FishYourDiamonds.MODID, "gameplay/fishing/weird_rod_fishing")
    );
}
