package io.github.maple8192.autorenew.listeners.extensions

import org.bukkit.Material

val Material.isTool: Boolean
    get() {
        if (this == Material.TURTLE_HELMET) return false
        if (this == Material.LEATHER_HELMET) return false
        if (this == Material.LEATHER_CHESTPLATE) return false
        if (this == Material.LEATHER_LEGGINGS) return false
        if (this == Material.LEATHER_BOOTS) return false
        if (this == Material.CHAINMAIL_HELMET) return false
        if (this == Material.CHAINMAIL_CHESTPLATE) return false
        if (this == Material.CHAINMAIL_LEGGINGS) return false
        if (this == Material.CHAINMAIL_BOOTS) return false
        if (this == Material.IRON_HELMET) return false
        if (this == Material.IRON_CHESTPLATE) return false
        if (this == Material.IRON_LEGGINGS) return false
        if (this == Material.IRON_BOOTS) return false
        if (this == Material.GOLDEN_HELMET) return false
        if (this == Material.GOLDEN_CHESTPLATE) return false
        if (this == Material.GOLDEN_LEGGINGS) return false
        if (this == Material.GOLDEN_BOOTS) return false
        if (this == Material.DIAMOND_HELMET) return false
        if (this == Material.DIAMOND_CHESTPLATE) return false
        if (this == Material.DIAMOND_LEGGINGS) return false
        if (this == Material.DIAMOND_BOOTS) return false
        if (this == Material.NETHERITE_HELMET) return false
        if (this == Material.NETHERITE_CHESTPLATE) return false
        if (this == Material.NETHERITE_LEGGINGS) return false
        if (this == Material.NETHERITE_BOOTS) return false

        return true
    }
