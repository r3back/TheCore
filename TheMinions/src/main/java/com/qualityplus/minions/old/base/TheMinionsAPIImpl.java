package com.qualityplus.minions.old.base;

import com.qualityplus.assistant.lib.eu.okaeri.injector.annotation.Inject;
import com.qualityplus.minions.old.api.TheMinionsAPI;
import com.qualityplus.minions.old.api.config.ConfigFiles;
import com.qualityplus.minions.old.api.recipe.provider.RecipeProvider;
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

@Component
@Getter
public final class TheMinionsAPIImpl implements TheMinionsAPI {
    private @Inject ConfigFiles<Config, Inventories, Messages, Commands, Skins, AutomatedShippingUpgrades, FuelUpgrades, NormalUpgrades> configFiles;
    private @Inject MinionsService minionsService;
    private @Inject RecipeProvider recipeProvider;
    private @Inject UserService userService;
}
