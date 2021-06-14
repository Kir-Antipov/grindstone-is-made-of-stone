package me.kirantipov.mods.grindstoneismadeofstone.mixin;

import me.kirantipov.mods.grindstoneismadeofstone.block.BlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.GrindstoneBlock;
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
    @ModifyArg(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/WallMountedBlock;<init>(Lnet/minecraft/block/Block$Settings;)V"))
    private static Block.Settings changeSettingsMaterialToStone(Block.Settings settings) {
        return (Block.Settings)((BlockSettings)settings).material(Material.STONE);
    }
}