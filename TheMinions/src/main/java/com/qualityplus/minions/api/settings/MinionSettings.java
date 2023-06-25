package com.qualityplus.minions.api.settings;

import com.qualityplus.assistant.lib.com.cryptomorin.xseries.XMaterial;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Map;

public interface MinionSettings {
    public Map<XMaterial, List<ItemStack>> getItemsToPickUp();
}
