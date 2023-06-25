package com.qualityplus.minions.api.handler;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface StorageHandler {
    public boolean canAdd(List<ItemStack> itemStacks);
    public void addItems(final List<ItemStack> items);
    public List<ItemStack> pickUpAll();
    public List<ItemStack> pickUpLast();
}
