package com.joshfah.fishing.mixin;

import com.joshfah.fishing.item.custom.WeirdRodItem;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FishingHook.class)
public class HookMixin {
    @Inject(method = "retrieve", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/ReloadableServerRegistries$Holder;getLootTable(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/LootTable;", shift = At.Shift.AFTER))
    public void changeLoot(ItemStack rod, CallbackInfoReturnable<Integer> cir) {
        if (rod.getItem() instanceof WeirdRodItem) {


            if (Minecraft.getInstance().player != null) {

            }
        }
    }
}
