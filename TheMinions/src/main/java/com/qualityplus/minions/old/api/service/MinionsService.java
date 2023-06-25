package com.qualityplus.minions.old.api.service;

import com.qualityplus.assistant.api.service.DataManagementService;
import com.qualityplus.minions.old.persistance.data.MinionData;

import java.util.List;
import java.util.UUID;

public interface MinionsService extends DataManagementService<MinionData> {
    List<UUID> getAllKeys();
}
