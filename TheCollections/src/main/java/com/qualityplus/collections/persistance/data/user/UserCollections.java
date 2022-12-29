package com.qualityplus.collections.persistance.data.user;

import com.qualityplus.assistant.api.common.data.LevellableInteger;
import com.qualityplus.assistant.api.common.data.ProgressableData;
import com.qualityplus.collections.base.collection.Collection;
import com.qualityplus.collections.base.collection.registry.CollectionsRegistry;
import eu.okaeri.persistence.document.Document;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public final class UserCollections extends Document implements LevellableInteger<String>, ProgressableData<String> {
    private Map<String, Integer> level = new HashMap<>();
    private Map<String, Double> xp = new HashMap<>();

    public void fillIfEmpty(){
        CollectionsRegistry.values().stream().map(Collection::getId).forEach(skill -> level.putIfAbsent(skill, 0));
        CollectionsRegistry.values().stream().map(Collection::getId).forEach(skill -> xp.putIfAbsent(skill, 0D));
    }
}