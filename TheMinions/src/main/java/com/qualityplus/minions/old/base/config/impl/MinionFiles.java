package com.qualityplus.minions.old.base.config.impl;

import com.qualityplus.assistant.lib.eu.okaeri.injector.annotation.Inject;
import com.qualityplus.minions.old.api.config.ConfigFiles;
import com.qualityplus.minions.base.config.*;
import com.qualityplus.minions.old.base.config.Commands;
import com.qualityplus.minions.old.base.config.Config;
import com.qualityplus.minions.old.base.config.Inventories;
import com.qualityplus.minions.old.base.config.Messages;
import com.qualityplus.minions.old.base.config.Skins;
import com.qualityplus.minions.old.base.config.minions.CowMinion;
import com.qualityplus.minions.old.base.config.minions.DiamondMinion;
import com.qualityplus.minions.old.base.config.minions.SnowMinion;
import com.qualityplus.minions.old.base.config.minions.WheatMinion;
import com.qualityplus.minions.old.base.config.upgrades.AutomatedShippingUpgrades;
import com.qualityplus.minions.old.base.config.upgrades.FuelUpgrades;
import com.qualityplus.minions.old.base.config.upgrades.NormalUpgrades;

import com.qualityplus.assistant.lib.eu.okaeri.platform.core.annotation.Component;

@Component
public final class MinionFiles implements ConfigFiles<Config, Inventories, Messages, Commands, Skins, AutomatedShippingUpgrades, FuelUpgrades, NormalUpgrades> {
    private @Inject AutomatedShippingUpgrades autoSell;
    private @Inject NormalUpgrades normalUpgrades;
    private @Inject FuelUpgrades fuelUpgrades;
    private @Inject Inventories inventories;
    private @Inject Skins skins;
    private @Inject Messages messages;
    private @Inject Commands commands;
    private @Inject Config config;
    private @Inject DiamondMinion diamondMinion;
    private @Inject WheatMinion cropBreakMinion;
    private @Inject SnowMinion snowMinion;
    private @Inject CowMinion cowMinion;


    @Override
    public Config config() {
        return config;
    }

    @Override
    public Skins skins() {
        return skins;
    }

    @Override
    public AutomatedShippingUpgrades getAutoSell() {
        return autoSell;
    }

    @Override
    public FuelUpgrades fuelUpgrades() {
        return fuelUpgrades;
    }

    @Override
    public NormalUpgrades upgrades() {
        return normalUpgrades;
    }

    @Override
    public Inventories inventories() {
        return inventories;
    }

    @Override
    public Messages messages() {
        return messages;
    }

    @Override
    public Commands commands() {
        return commands;
    }

    @Override
    public void reloadFiles() {
        normalUpgrades.load();
        autoSell.load();
        fuelUpgrades.load();
        config.load();
        skins.load();
        messages.load();
        inventories.load();
        commands.load();
        diamondMinion.load();
        cropBreakMinion.load();
        snowMinion.load();
        cowMinion.load();
    }
}
