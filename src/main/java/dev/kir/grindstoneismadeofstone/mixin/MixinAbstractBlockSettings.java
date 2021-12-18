package dev.kir.grindstoneismadeofstone.mixin;

import dev.kir.grindstoneismadeofstone.block.BlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
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
    Material material;

    @Shadow
    Function<BlockState, MapColor> mapColorProvider;

    /**
     * {@inheritDoc}
     */
    public BlockSettings material(Material material, Function<BlockState, MapColor> materialColorFactory) {
        this.material = material;
        this.mapColorProvider = materialColorFactory;
        return this;
    }
}