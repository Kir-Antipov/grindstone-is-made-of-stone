package dev.kir.grindstoneismadeofstone.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.GrindstoneBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

/**
 * This mixin:
 *
 * <ul>
 *     <li>Changes grindstone's material to `Material.STONE`.</li>
 * </ul>
 */
@Mixin(GrindstoneBlock.class)
public class MixinGrindstoneBlock {
    @ModifyArg(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/WallMountedBlock;<init>(Lnet/minecraft/block/AbstractBlock$Settings;)V"))
    private static AbstractBlock.Settings changeSettingsMaterialToStone(AbstractBlock.Settings settings) {
        Material material = Material.STONE;
        MapColor color = material.getColor();
        settings.material = material;
        settings.mapColorProvider = state -> color;
        return settings;
    }
}