package com.qualityplus.minions.base.handler;

import com.qualityplus.minions.api.handler.StorageHandler;
import com.qualityplus.minions.api.storage.MinionStorage;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public final class StorageHandlerImpl implements StorageHandler {
    private final List<MinionStorage> storages = new ArrayList<>();

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
