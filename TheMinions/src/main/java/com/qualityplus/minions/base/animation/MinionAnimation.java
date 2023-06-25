package com.qualityplus.minions.base.animation;

import com.qualityplus.minions.api.animation.Animation;
import com.qualityplus.minions.api.entity.MinionEntity;
import lombok.Getter;
import org.bukkit.scheduler.BukkitTask;

import java.util.Optional;

public abstract class MinionAnimation implements Animation {
    @Getter
    protected boolean isCompleted = false;
    protected final MinionEntity entity;
    protected BukkitTask task;

    public MinionAnimation(final MinionEntity entity) {
        this.entity = entity;
    }

    @Override
    public void stop() {
        this.isCompleted = true;

        Optional.ofNullable(this.task).ifPresent(BukkitTask::cancel);
    }
}
