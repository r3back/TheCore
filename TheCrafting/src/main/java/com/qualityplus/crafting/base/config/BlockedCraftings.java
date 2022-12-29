package com.qualityplus.crafting.base.config;

import com.cryptomorin.xseries.XMaterial;
import com.qualityplus.crafting.api.recipes.IRecipe;
import eu.okaeri.configs.OkaeriConfig;
import eu.okaeri.configs.annotation.Header;
import eu.okaeri.configs.annotation.NameModifier;
import eu.okaeri.configs.annotation.NameStrategy;
import eu.okaeri.configs.annotation.Names;
import eu.okaeri.platform.core.annotation.Configuration;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

@Configuration(path = "blocked_craftings.yml")
@Header("================================")
@Header("       Blocked Craftings      ")
@Header("================================")
@Names(strategy = NameStrategy.HYPHEN_CASE, modifier = NameModifier.TO_LOWER_CASE)
public final class BlockedCraftings extends OkaeriConfig {
    public List<XMaterial> blockedCraftings = Arrays.asList(XMaterial.DIAMOND_BLOCK, XMaterial.GOLD_BLOCK);

    public boolean isBlocked(IRecipe recipe){
        ItemStack result = recipe.getResult();

        if(result == null) return false;

        return blockedCraftings.contains(XMaterial.matchXMaterial(result.getType()));
    }
}
