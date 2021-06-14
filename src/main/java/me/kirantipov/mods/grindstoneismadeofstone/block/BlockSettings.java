package me.kirantipov.mods.grindstoneismadeofstone.block;

import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;

/**
 * Represents the basic properties of a block.
 */
public interface BlockSettings {
    /**
     * {@link #material(Material, MaterialColor)}
     */
    default BlockSettings material(Material material) {
        return this.material(material, material.getColor());
    }

    /**
     * Sets the block material.
     *
     * @param material The material.
     * @param materialColor Color of the material.
     *
     * @return `this` instance for further chaining.
     */
    BlockSettings material(Material material, MaterialColor materialColor);
}