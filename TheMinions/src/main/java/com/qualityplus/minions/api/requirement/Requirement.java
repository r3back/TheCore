package com.qualityplus.minions.api.requirement;

import org.bukkit.inventory.ItemStack;

public interface Requirement {
    public ItemStack getItem();
    public int getAmount();
}
