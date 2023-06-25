package com.qualityplus.minions.base.animation;

import com.qualityplus.minions.api.animation.Resultable;
import com.qualityplus.minions.api.entity.MinionEntity;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class BreakAnimation extends MinionAnimation implements Resultable<ItemStack> {
    @Getter
    private final List<ItemStack> result = new ArrayList<>();

    public BreakAnimation(final MinionEntity entity) {
        super(entity);
    }

    @Override
    public void start() {

    }
}
