package com.qualityplus.minions.old.base.box;

import com.qualityplus.assistant.lib.eu.okaeri.injector.annotation.Inject;
import com.qualityplus.minions.old.api.box.Box;
import com.qualityplus.minions.old.api.config.ConfigFiles;
import com.qualityplus.minions.old.api.service.MinionsService;
import com.qualityplus.minions.old.api.service.UserService;
import com.qualityplus.minions.base.config.*;
import com.qualityplus.minions.old.base.config.upgrades.AutomatedShippingUpgrades;
import com.qualityplus.minions.old.base.config.upgrades.FuelUpgrades;
import com.qualityplus.minions.old.base.config.upgrades.NormalUpgrades;

import com.qualityplus.assistant.lib.eu.okaeri.platform.core.annotation.Component;
import com.qualityplus.minions.old.base.config.Commands;
import com.qualityplus.minions.old.base.config.Config;
import com.qualityplus.minions.old.base.config.Inventories;
import com.qualityplus.minions.old.base.config.Messages;
import com.qualityplus.minions.old.base.config.Skins;
import lombok.Getter;
import org.bukkit.plugin.Plugin;

@Component
public final class BoxImpl implements Box {
    private @Inject ConfigFiles<Config, Inventories, Messages, Commands, Skins, AutomatedShippingUpgrades, FuelUpgrades, NormalUpgrades> files;
    private @Inject @Getter MinionsService minionsService;
    private @Inject @Getter UserService userService;
    private @Inject Plugin plugin;

    @Override
    public ConfigFiles<Config, Inventories, Messages, Commands, Skins, AutomatedShippingUpgrades, FuelUpgrades, NormalUpgrades> files() {
        return files;
    }

    @Override
    public Plugin plugin() {
        return plugin;
    }
}
