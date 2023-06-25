package com.qualityplus.minions.old.base.event;

import com.qualityplus.assistant.api.event.PlayerAssistantEvent;
import com.qualityplus.minions.old.api.minion.MinionEntity;
import lombok.Getter;
import org.bukkit.entity.Player;

@Getter
public final class MinionInteractEvent extends PlayerAssistantEvent {
    private final MinionEntity minionEntity;

    public MinionInteractEvent(Player player, MinionEntity minionEntity) {
        super(player);
        this.minionEntity = minionEntity;
    }
}
