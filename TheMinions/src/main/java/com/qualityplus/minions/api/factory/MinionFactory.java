package com.qualityplus.minions.api.factory;

import com.qualityplus.minions.api.config.MinionConfig;
import com.qualityplus.minions.api.entity.MinionEntity;

public interface MinionFactory {
    public MinionEntity getMinion(final MinionConfig config);
}
