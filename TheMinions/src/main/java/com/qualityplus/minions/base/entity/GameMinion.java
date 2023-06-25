package com.qualityplus.minions.base.entity;

import com.qualityplus.minions.api.animation.Animation;
import com.qualityplus.minions.api.entity.MinionEntity;
import com.qualityplus.minions.api.equipment.MinionEquipment;
import com.qualityplus.minions.api.handler.ArmorStandHandler;
import com.qualityplus.minions.api.handler.EquipmentHandler;
import com.qualityplus.minions.api.handler.StorageHandler;
import com.qualityplus.minions.api.settings.MinionSettings;
import com.qualityplus.minions.api.state.MinionState;
import com.qualityplus.minions.api.storage.MinionStorage;
import com.qualityplus.minions.base.handler.ArmorStandHandlerImpl;
import com.qualityplus.minions.base.handler.EquipmentHandlerImpl;
import com.qualityplus.minions.base.handler.StorageHandlerImpl;
import com.qualityplus.minions.base.state.ActioningState;
import com.qualityplus.minions.base.state.ErrorState;
import com.qualityplus.minions.base.state.ReadyToSpawnState;
import com.qualityplus.minions.base.state.ThinkingState;
import lombok.Builder;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;


@Getter
public abstract class GameMinion implements MinionEntity {
    private static final ArmorStandHandler ARMOR_STAND_HANDLER = new ArmorStandHandlerImpl();
    private static final EquipmentHandler EQUIPMENT_HANDLER = new EquipmentHandlerImpl();

    protected final StorageHandler storage = new StorageHandlerImpl();
    protected final MinionSettings settings;
    protected MinionEquipment equipment;
    protected Animation animation;
    protected ArmorStand entity;
    protected MinionState state;

    @Builder
    public GameMinion(final Animation animation, final MinionState state, final MinionEquipment equipment, final MinionSettings settings) {
        this.equipment = equipment;
        this.animation = animation;
        this.settings = settings;
        this.state = state;
    }

    @Override
    public boolean spawn(final Location location) {
        if (!(this.state instanceof ReadyToSpawnState)) {
            return false;
        }

        this.setupEntity(location);
        this.setupArmor();

        return true;
    }

    @Override
    public void tick() {
        if (this.state instanceof ActioningState) {
            this.doWhileActioning();
        } else if (this.state instanceof ErrorState) {
            this.doWhileError();
        } else if (this.state instanceof ThinkingState) {
            this.doWhileThinking();
        }
    }

    protected abstract void doWhileActioning();

    protected abstract void doWhileThinking();

    protected abstract void doWhileError();

    private void setupEntity(final Location location) {
        this.entity = ARMOR_STAND_HANDLER.getEntity(location);
    }

    private void setupArmor() {
        EQUIPMENT_HANDLER.equip(this, this.equipment);
    }
}
