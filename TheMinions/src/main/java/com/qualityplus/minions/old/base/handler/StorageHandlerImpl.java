package com.qualityplus.minions.old.base.handler;

import com.qualityplus.minions.old.api.handler.StorageHandler;
import com.qualityplus.minions.old.api.minion.MinionEntity;
import com.qualityplus.minions.old.base.minions.entity.MinionStorageState;
import com.qualityplus.minions.old.base.minions.entity.getter.MinionItemsGetter;
import com.qualityplus.minions.old.base.minions.minion.Minion;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public final class StorageHandlerImpl implements StorageHandler, MinionItemsGetter {
    private final MinionEntity minionEntity;
    private final Minion minion;

    @Override
    public MinionStorageState getMinionStorageState() {
        return getMinionState(minionEntity.getState().getFakeInventory(), minionEntity.getMinionUniqueId(), minion);
    }
}
