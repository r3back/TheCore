package com.qualityplus.minions.old.base.minions.entity.getter;

import com.qualityplus.minions.TheMinions;
import com.qualityplus.minions.old.persistance.data.MinionData;

import java.util.Optional;

public interface LevelGetter extends MinionUUIDGetter{

    default int getLevel(){
        Optional<MinionData> petData = TheMinions.getApi().getMinionsService().getData(getMinionUniqueId());

        return petData.map(MinionData::getLevel).orElse(1);
    }
}
