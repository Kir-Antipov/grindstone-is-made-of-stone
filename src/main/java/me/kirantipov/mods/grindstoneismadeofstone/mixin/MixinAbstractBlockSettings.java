package me.kirantipov.mods.grindstoneismadeofstone.mixin;

import me.kirantipov.mods.grindstoneismadeofstone.block.BlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.function.Function;

/**
 * This mixin:
 *
 * <ul>
 *     <li>Makes `Block.Settings` a valid `BlockSettings` instance.</li>
 * </ul>
 */
@Mixin(AbstractBlock.Settings.class)
public class MixinAbstractBlockSettings implements BlockSettings {
    @Shadow
    private Material material;

    @Shadow
    private Function<BlockState, MaterialColor> materialColorFactory;

    /**
     * {@inheritDoc}
     */
    public BlockSettings material(Material material, Function<BlockState, MaterialColor> materialColorFactory) {
        this.material = material;
        this.materialColorFactory = materialColorFactory;
        return this;
    }
}