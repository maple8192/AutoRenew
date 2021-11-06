package io.github.maple8192.autorenew

import io.github.maple8192.autorenew.listeners.ToolBrokeEvent
import org.bukkit.plugin.java.JavaPlugin

class AutoRenew : JavaPlugin() {
    override fun onEnable() {
        registerEventListeners()
    }

    /**
     * イベントハンドラを登録します。
     */
    private fun registerEventListeners() {
        val pluginManager = server.pluginManager

        pluginManager.registerEvents(ToolBrokeEvent(), this)
    }
}