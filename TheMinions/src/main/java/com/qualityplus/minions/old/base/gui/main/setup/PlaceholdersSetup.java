package com.qualityplus.minions.old.base.gui.main.setup;

import com.qualityplus.assistant.api.util.IPlaceholder;
import com.qualityplus.minions.old.api.box.Box;
import com.qualityplus.minions.old.api.minion.MinionEntity;

import java.util.List;

public interface PlaceholdersSetup {
    List<IPlaceholder> getPlaceholders(Box box, MinionEntity minionEntity);
}
