package com.qualityplus.minions.old.base.minions.entity.getter;

import com.qualityplus.minions.TheMinions;
import com.qualityplus.minions.old.persistance.data.MinionData;

import java.util.Optional;

public interface DataGetter extends MinionUUIDGetter {
    default Optional<MinionData> getData(){
        return TheMinions.getApi().getMinionsService().getData(getMinionUniqueId());
    }
}
