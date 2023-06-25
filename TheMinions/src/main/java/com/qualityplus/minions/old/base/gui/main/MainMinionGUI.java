package com.qualityplus.minions.old.base.gui.main;

import com.qualityplus.assistant.api.util.IPlaceholder;
import com.qualityplus.assistant.util.inventory.InventoryUtils;
import com.qualityplus.minions.old.api.box.Box;
import com.qualityplus.minions.old.api.minion.MinionEntity;
import com.qualityplus.minions.old.base.gui.MinionGUI;
import com.qualityplus.minions.old.base.gui.layout.LayoutGUI;
import com.qualityplus.minions.base.gui.main.handler.click.*;
import com.qualityplus.minions.old.base.gui.main.setup.ItemSetup;
import com.qualityplus.minions.old.base.gui.main.setup.PlaceholdersSetup;
import com.qualityplus.minions.old.base.gui.main.setup.items.AllItemsSetup;
import com.qualityplus.minions.old.base.gui.main.setup.placeholders.UpgradePlaceholdersSetup;
import com.qualityplus.minions.old.base.gui.recipes.MinionsRecipesGUI;
import com.qualityplus.minions.old.base.gui.main.handler.click.AutoShipClickHandler;
import com.qualityplus.minions.old.base.gui.main.handler.click.FuelClickHandler;
import com.qualityplus.minions.old.base.gui.main.handler.click.MinionSkinClickHandler;
import com.qualityplus.minions.old.base.gui.main.handler.click.PickUpItemsClickHandler;
import com.qualityplus.minions.old.base.gui.main.handler.click.PickUpMinionClickHandler;
import com.qualityplus.minions.old.base.gui.main.handler.click.QuickUpgradeClickHandler;
import com.qualityplus.minions.old.base.gui.main.handler.click.UpgradeClickHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public final class MainMinionGUI extends MinionGUI {
    private final PlaceholdersSetup placeholdersSetup = new UpgradePlaceholdersSetup();
    private final ItemSetup allItemSetup = new AllItemsSetup();
    private final MainMinionGUIConfig config;
    private final MinionEntity minionEntity;

    public MainMinionGUI(Box box, MinionEntity minionEntity) {
        super(box.files().inventories().minionGUIConfig.getSize(), getTitle(box.files().inventories().minionGUIConfig.getTitle(), minionEntity), box);

        this.config = box.files().inventories().minionGUIConfig;
        this.minionEntity = minionEntity;
    }

    @Override
    public @NotNull Inventory getInventory() {
        InventoryUtils.fillInventory(inventory, config.getBackground());

        List<IPlaceholder> upgradePlaceholders = placeholdersSetup.getPlaceholders(box, minionEntity);

        setItem(config.getMinionSkinEmptyItem());
        setItem(config.getFirstUpgradeEmptyItem());
        setItem(config.getSecondUpgradeEmptyItem());
        setItem(config.getIdealLayoutItem());
        setItem(config.getMinionTierItem(), upgradePlaceholders);
        setItem(config.getCollectAllItem());
        setItem(config.getQuickUpgradeItem(), upgradePlaceholders);
        setItem(config.getPickUpMinion());
        setItem(config.getCloseGUI());

        addItems();

        return inventory;
    }

    public void addItems() {
        allItemSetup.setItem(inventory, box, config, minionEntity);
    }

    @Override
    public void onInventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        ClickTarget target = getTarget(event);

        if (!target.equals(ClickTarget.INSIDE)) return;

        event.setCancelled(true);

        int slot = event.getSlot();

        if (isItem(slot, config.getCloseGUI())) {
            player.closeInventory();
        } else if (isItem(slot, config.getPickUpMinion())) {
            new PickUpMinionClickHandler().handle(event, minionEntity, box);
        } else if (isItem(slot, config.getQuickUpgradeItem())) {
            new QuickUpgradeClickHandler().handle(event, minionEntity, box);
        } else if (isItem(slot, config.getCollectAllItem())) {
            new PickUpItemsClickHandler().handle(event, minionEntity, box);

            addItems();
        } else if (isItem(slot, config.getAutomatedShippingPlacedItem())) {
            new AutoShipClickHandler().handle(event, minionEntity, box);
        } else if (isItem(slot, config.getFuelPlacedItem())) {
            new FuelClickHandler().handle(event, minionEntity, box);
        } else if (isItem(slot, config.getFirstUpgradeEmptyItem()) || isItem(slot, config.getSecondUpgradeEmptyItem())) {
            new UpgradeClickHandler().handle(event, minionEntity, box);
        } else if (isItem(slot, config.getIdealLayoutItem())) {
            player.openInventory(new LayoutGUI(box, minionEntity).getInventory());
        } else if (isItem(slot, config.getMinionTierItem())) {
            player.openInventory(new MinionsRecipesGUI(box, minionEntity).getInventory());
        } else if (isItem(slot, config.getMinionSkinEmptyItem())) {
            new MinionSkinClickHandler().handle(event, minionEntity, box);
        }
    }
}
