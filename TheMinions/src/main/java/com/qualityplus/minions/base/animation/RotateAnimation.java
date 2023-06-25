package com.qualityplus.minions.base.animation;

import com.qualityplus.minions.api.entity.MinionEntity;
import org.bukkit.Location;

public class RotateAnimation extends MinionAnimation{
    private final Location location;

    public RotateAnimation(final MinionEntity entity, final Location location) {
        super(entity);

        this.location = location;
    }

    @Override
    public void start() {

    }
}
