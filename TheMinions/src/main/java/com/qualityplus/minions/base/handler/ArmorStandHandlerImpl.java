package com.qualityplus.minions.base.handler;

import com.qualityplus.assistant.util.armorstand.ArmorStandUtil;
import com.qualityplus.minions.api.handler.ArmorStandHandler;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;

public class ArmorStandHandlerImpl implements ArmorStandHandler {
    @Override
    public ArmorStand getEntity(final Location location) {
        return ArmorStandUtil.createDefault(location);
    }
}
