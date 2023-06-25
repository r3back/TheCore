package com.qualityplus.minions.old.api.handler;

import com.qualityplus.minions.old.base.minions.entity.mob.MinionMobEntity;
import org.bukkit.block.Block;

import java.util.concurrent.CompletableFuture;

public interface AnimationHandler {
    CompletableFuture<Block> getBlockToRotate(ArmorStandHandler armorStand);

    CompletableFuture<MinionMobEntity> getEntityToRotate(ArmorStandHandler armorStand);
}
