package com.qualityplus.minions.old.api;

import com.qualityplus.minions.old.api.config.ConfigFiles;
import com.qualityplus.minions.old.api.recipe.provider.RecipeProvider;
import com.qualityplus.minions.old.api.service.MinionsService;
import com.qualityplus.minions.old.api.service.UserService;
import com.qualityplus.minions.base.config.*;
import com.qualityplus.minions.old.base.config.upgrades.AutomatedShippingUpgrades;
import com.qualityplus.minions.old.base.config.upgrades.FuelUpgrades;
import com.qualityplus.minions.old.base.config.upgrades.NormalUpgrades;
import com.qualityplus.minions.old.base.config.Commands;
import com.qualityplus.minions.old.base.config.Config;
import com.qualityplus.minions.old.base.config.Inventories;
import com.qualityplus.minions.old.base.config.Messages;
import com.qualityplus.minions.old.base.config.Skins;

public interface TheMinionsAPI {
    ConfigFiles<Config, Inventories, Messages, Commands, Skins, AutomatedShippingUpgrades, FuelUpgrades, NormalUpgrades> getConfigFiles();
    MinionsService getMinionsService();
    RecipeProvider getRecipeProvider();
    UserService getUserService();
}
