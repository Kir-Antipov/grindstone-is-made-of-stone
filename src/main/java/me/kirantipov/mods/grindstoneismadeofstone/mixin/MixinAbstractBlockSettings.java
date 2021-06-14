package me.kirantipov.mods.grindstoneismadeofstone.mixin;

import me.kirantipov.mods.grindstoneismadeofstone.block.BlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * This mixin:
 *
 * <ul>
 *     <li>Makes `Block.Settings` a valid `BlockSettings` instance.</li>
 * </ul>
 */
@Mixin(Block.Settings.class)
public class MixinAbstractBlockSettings implements BlockSettings {
    @Shadow
    private Material material;

    @Shadow
    private MaterialColor materialColor;

    /**
     * {@inheritDoc}
     */
    public BlockSettings material(Material material, MaterialColor materialColor) {
        this.material = material;
        this.materialColor = materialColor;
        return this;
    }
}