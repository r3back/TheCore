package com.qualityplus.minions.old.base.recipe.provider;

import com.qualityplus.minions.old.api.recipe.Recipe;
import com.qualityplus.minions.old.api.recipe.provider.RecipeProvider;

public final class EmptyRecipeProviderImpl implements RecipeProvider {
    @Override
    public Recipe getRecipe(String id) {
        return null;
    }
}
