package dev.kir.grindstoneismadeofstone.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.GrindstoneBlock;
import net.minecraft.block.piston.PistonBehavior;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(GrindstoneBlock.class)
public class GrindstoneBlockMixin {
    @ModifyArg(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/WallMountedBlock;<init>(Lnet/minecraft/block/AbstractBlock$Settings;)V"))
    private static AbstractBlock.Settings changePistonBehaviorToNormal(AbstractBlock.Settings settings) {
        return settings.pistonBehavior(PistonBehavior.NORMAL);
    }
}