package me.kirantipov.mods.grindstoneismadeofstone.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;

import java.util.function.Function;

/**
 * Represents the basic properties of a block.
 */
public interface BlockSettings {
    /**
     * {@link #material(Material, Function)} )}
     */
    default BlockSettings material(Material material) {
        return this.material(material, material.getColor());
    }

    /**
     * {@link #material(Material, Function)} )}
     */
    default BlockSettings material(Material material, MaterialColor materialColor) {
        return this.material(material, state -> materialColor);
    }

    /**
     * Sets the block material.
     *
     * @param material The material.
     * @param materialColor Color of the material.
     *
     * @return `this` instance for further chaining.
     */
    BlockSettings material(Material material, Function<BlockState, MaterialColor> materialColor);
}