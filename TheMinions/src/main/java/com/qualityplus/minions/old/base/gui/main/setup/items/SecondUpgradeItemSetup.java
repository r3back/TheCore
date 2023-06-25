package com.qualityplus.minions.old.base.gui.main.setup.items;

import com.qualityplus.assistant.api.util.BukkitItemUtil;
import com.qualityplus.assistant.util.itemstack.ItemStackUtils;
import com.qualityplus.assistant.util.placeholder.Placeholder;
import com.qualityplus.assistant.util.placeholder.PlaceholderBuilder;
import com.qualityplus.minions.TheMinions;
import com.qualityplus.minions.old.api.box.Box;
import com.qualityplus.minions.old.api.minion.MinionEntity;
import com.qualityplus.minions.old.base.gui.main.MainMinionGUIConfig;
import com.qualityplus.minions.old.base.gui.main.setup.ItemSetup;
import com.qualityplus.minions.old.base.minions.minion.upgrade.MinionUpgrade;
import com.qualityplus.minions.old.persistance.data.MinionData;
import com.qualityplus.minions.old.persistance.data.upgrade.UpgradeEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

public final class SecondUpgradeItemSetup implements ItemSetup {
    @Override
    public void setItem(Inventory inventory, Box box, MainMinionGUIConfig config, MinionEntity minionEntity) {
        Optional<MinionData> minionData = TheMinions.getApi().getMinionsService().getData(minionEntity.getMinionUniqueId());

        UpgradeEntity upgradeEntity = minionData
                .map(MinionData::getSecondUpgrade)
                .orElse(null);

        if(upgradeEntity == null)
            inventory.setItem(config.getSecondUpgradeEmptyItem().slot, ItemStackUtils.makeItem(config.getSecondUpgradeEmptyItem()));
        else {
            MinionUpgrade fuel = box.files().upgrades().normalUpgrades.getOrDefault(upgradeEntity.getId(), null);

            if(fuel == null) return;

            ItemStack itemStack = fuel.getItemStack();

            String displayName = BukkitItemUtil.getName(itemStack);
            List<String> lore = BukkitItemUtil.getItemLore(itemStack);

            inventory.setItem(config.getSecondUpgradePlacedItem().slot, ItemStackUtils.makeItem(
                    config.getSecondUpgradePlacedItem(),
                    PlaceholderBuilder.create(
                            new Placeholder("minion_upgrade_item_display_name", displayName),
                            new Placeholder("minion_upgrade_item_lore", lore)
                    ).get(),
                    itemStack
            ));
        }
    }
}
