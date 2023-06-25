package com.qualityplus.minions.old.base.handler;

import com.qualityplus.minions.old.api.handler.FuelHandler;
import com.qualityplus.minions.old.base.minions.entity.getter.DataGetter;
import com.qualityplus.minions.old.persistance.data.MinionData;
import com.qualityplus.minions.old.persistance.data.upgrade.FuelEntity;
import lombok.AllArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
public final class FuelHandlerImpl implements FuelHandler, DataGetter {
    private final UUID minionUniqueId;

    /* Remove Fuel if expired */
    @Override
    public void removeFuel() {
        Optional<MinionData> data = getData();

        FuelEntity fuel = data.map(MinionData::getFuel).orElse(null);

        if(fuel == null) return;

        if(fuel.getMarkable().isMarked()) return;

        data.ifPresent(MinionData::removeFuel);
    }

    @Override
    public UUID getMinionUniqueId() {
        return minionUniqueId;
    }
}
