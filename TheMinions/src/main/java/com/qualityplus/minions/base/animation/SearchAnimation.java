package com.qualityplus.minions.base.animation;

import com.qualityplus.minions.api.animation.Resultable;
import com.qualityplus.minions.api.entity.MinionEntity;
import lombok.Getter;
import org.bukkit.Location;

public class SearchAnimation extends MinionAnimation implements Resultable<Location> {
    @Getter
    private Location result;

    public SearchAnimation(final MinionEntity entity) {
        super(entity);
    }

    @Override
    public void start() {

    }
}
