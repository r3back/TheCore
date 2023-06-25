package com.qualityplus.minions.base.storage;

import com.qualityplus.minions.api.storage.MinionStorage;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class AdvancedChestStorage implements MinionStorage {
    @Override
    public void addItems(List<ItemStack> items) {

    }

    @Override
    public boolean canAdd(List<ItemStack> itemStacks) {
        return false;
    }

    @Override
    public List<ItemStack> pickUpAll() {
        return null;
    }

    @Override
    public List<ItemStack> pickUpLast() {
        return null;
    }
}
