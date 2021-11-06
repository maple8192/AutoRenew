package io.github.maple8192.autorenew.listeners

import io.github.maple8192.autorenew.listeners.extensions.isTool
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerItemBreakEvent

class ToolBrokeEvent : Listener {
    @EventHandler
    fun onPlayerItemBreak(event: PlayerItemBreakEvent) {
        val player = event.player
        val item = event.brokenItem

        // 壊れたアイテムが防具だったら無視する
        if (item.type.isTool.not()) return

        // 壊れたアイテムをインベントリから消去
        player.inventory.setItem(player.inventory.heldItemSlot, null)

        // 壊れたアイテムと取り替えるアイテムのサーチ
        val alternativeItemSlot = player.inventory.first(item.type)

        // 取り替えられるアイテムがインベントリ内に見つかったら
        if (alternativeItemSlot != -1) {
            // 壊れたアイテムがメインハンドかオフハンドかを判定
            if (player.inventory.getItem(player.inventory.heldItemSlot) == item) {
                // メインハンドだったら

                // 手持ちのアイテムと取り替え
                player.inventory.setItem(player.inventory.heldItemSlot, player.inventory.getItem(alternativeItemSlot))
                player.inventory.setItem(alternativeItemSlot, null)
            } else {
                // オフハンドだったら

                // オフハンドのアイテムと取り替え
                player.inventory.setItem(40, player.inventory.getItem(alternativeItemSlot))
                player.inventory.setItem(alternativeItemSlot, null)
            }
        }
    }
}