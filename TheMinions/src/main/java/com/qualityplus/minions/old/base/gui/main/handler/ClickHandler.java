package com.qualityplus.minions.old.base.gui.main.handler;

import com.qualityplus.minions.old.api.box.Box;
import com.qualityplus.minions.old.api.minion.MinionEntity;
import org.bukkit.event.inventory.InventoryClickEvent;

public interface ClickHandler {
    void handle(InventoryClickEvent event, MinionEntity minionEntity, Box box);

}
