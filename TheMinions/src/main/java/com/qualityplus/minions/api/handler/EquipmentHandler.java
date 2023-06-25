package com.qualityplus.minions.api.handler;

import com.qualityplus.minions.api.entity.MinionEntity;
import com.qualityplus.minions.api.equipment.MinionEquipment;

public interface EquipmentHandler {
    public void equip(final MinionEntity entity, final MinionEquipment equipment);
}
