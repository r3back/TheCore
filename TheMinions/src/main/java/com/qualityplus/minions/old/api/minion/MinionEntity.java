package com.qualityplus.minions.old.api.minion;

import com.qualityplus.minions.old.base.minions.entity.getter.DataGetter;
import com.qualityplus.minions.old.base.minions.entity.getter.LevelGetter;
import com.qualityplus.minions.old.base.minions.entity.getter.MinionItemsGetter;
import com.qualityplus.minions.old.base.minions.entity.state.MinionState;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public interface MinionEntity extends LevelGetter, DataGetter, MinionItemsGetter {
    void load();
    void unload();

    MinionState getState();
    void tick();

    Collection<ItemStack> pickUpAllItems();

    void spawn(Location location, boolean load);
    void deSpawn(DeSpawnReason reason);

    void updateSkin();
    void updateInventory();

    public enum DeSpawnReason{
        SERVER_TURNED_OFF,
        PLAYER_DE_SPAWN_PET
    }
}
