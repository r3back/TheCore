package com.qualityplus.minions.old.base.minions.entity.scheduler;

import com.qualityplus.minions.old.api.minion.MinionEntity;

import java.util.Map;
import java.util.UUID;

public interface MinionTickService {
    void tick(Map.Entry<UUID, MinionEntity> entry);
}