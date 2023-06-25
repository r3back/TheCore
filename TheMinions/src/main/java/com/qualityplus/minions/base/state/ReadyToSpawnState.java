package com.qualityplus.minions.base.state;

import com.qualityplus.minions.api.state.MinionState;

public final class ReadyToSpawnState implements MinionState {
    @Override
    public String getId() {
        return null;
    }

    @Override
    public boolean canPerformAction() {
        return false;
    }
}
