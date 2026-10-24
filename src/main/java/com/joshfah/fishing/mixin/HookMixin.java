package com.joshfah.fishing.mixin;

import com.joshfah.fishing.item.custom.WeirdRodItem;
import com.joshfah.fishing.loot.ModLootTables;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootTable;
import net.neoforged.fml.common.Mod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(FishingHook.class)
public class HookMixin {
    @Inject(method="retrieve", at = @At(value = "INVOKE", target = "Lnet/neoforged/neoforge/event/entity/player/ItemFishedEvent;<init>(Ljava/util/List;ILnet/minecraft/world/entity/projectile/FishingHook;)V"))
    public void changeLoot(ItemStack rod, CallbackInfoReturnable<Integer> cir, @Local (name="lootTable") LocalRef<LootTable> lootTableLocalRef, @Local (name = "items") LocalRef<List<ItemStack>> itemsLocalRef, @Local (name="params") LootParams paramsLocal) {
        if (rod.getItem() instanceof WeirdRodItem) {
            FishingHook thisHook = (FishingHook) (Object) this;
            LootTable newLoot = thisHook.level().getServer().reloadableRegistries().getLootTable(ModLootTables.WEIRD_ROD_TABLE);
            itemsLocalRef.get().clear();
            itemsLocalRef.set(newLoot.getRandomItems(paramsLocal));
        }
    }
}
