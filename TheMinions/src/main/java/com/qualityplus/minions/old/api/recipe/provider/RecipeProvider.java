package com.qualityplus.minions.old.api.recipe.provider;

import com.qualityplus.minions.old.api.recipe.Recipe;

public interface RecipeProvider {
    Recipe getRecipe(String id);
}
