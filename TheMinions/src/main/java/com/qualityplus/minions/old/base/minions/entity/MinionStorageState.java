package com.qualityplus.minions.old.base.minions.entity;

import com.qualityplus.minions.old.base.gui.main.handler.click.UpgradeSlot;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
public final class MinionStorageState {
    private final Map<Integer, ItemStack> toRemove;
    private final boolean hasFullStorage;
    private final ItemStack[] toAdd;
    private final UpgradeSlot slot;
}
