package com.qualityplus.minions.api.level;

import com.qualityplus.minions.api.requirement.Requirement;

public interface MinionLevel {
    public Requirement getLevelRequirement();

    public String getRecipe();
}
