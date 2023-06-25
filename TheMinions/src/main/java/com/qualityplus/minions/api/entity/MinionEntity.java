package com.qualityplus.minions.api.entity;

import com.qualityplus.minions.api.handler.StorageHandler;
import com.qualityplus.minions.api.state.MinionState;
import org.bukkit.Location;

public interface MinionEntity {
    public boolean spawn(final Location location);

    public StorageHandler getStorage();

    public MinionState getState();

    public void deSpawn();

    public void tick();
}
