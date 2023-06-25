package com.qualityplus.minions.old.base.minions.entity.handler;

import com.qualityplus.minions.api.handler.*;
import com.qualityplus.minions.old.api.handler.AnimationHandler;
import com.qualityplus.minions.old.api.handler.FuelHandler;
import com.qualityplus.minions.old.api.handler.LayoutHandler;
import com.qualityplus.minions.old.api.handler.SellHandler;
import com.qualityplus.minions.old.api.handler.StorageHandler;
import com.qualityplus.minions.old.api.minion.MinionEntity;
import com.qualityplus.minions.base.handler.*;
import com.qualityplus.minions.old.base.handler.AnimationHandlerImpl;
import com.qualityplus.minions.old.base.handler.FuelHandlerImpl;
import com.qualityplus.minions.old.base.handler.LayoutHandlerImpl;
import com.qualityplus.minions.old.base.handler.SellHandlerImpl;
import com.qualityplus.minions.old.base.handler.StorageHandlerImpl;
import com.qualityplus.minions.old.base.minions.minion.Minion;
import lombok.Getter;

@Getter
public final class MinionHandlersImpl implements MinionHandlers {
    private final AnimationHandler animationHandler;
    private final StorageHandler storageHandler;
    private final LayoutHandler layoutHandler;
    private final SellHandler sellHandler;
    private final FuelHandler fuelHandler;

    public MinionHandlersImpl(MinionEntity entity, Minion minion) {
        this.animationHandler = new AnimationHandlerImpl(entity.getMinionUniqueId(), minion);
        this.layoutHandler = new LayoutHandlerImpl(entity, minion);
        this.fuelHandler = new FuelHandlerImpl(entity.getMinionUniqueId());
        this.sellHandler = new SellHandlerImpl(entity, minion);
        this.storageHandler = new StorageHandlerImpl(entity, minion);
    }
}
