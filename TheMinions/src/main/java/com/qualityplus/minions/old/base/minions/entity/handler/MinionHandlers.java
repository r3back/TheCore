package com.qualityplus.minions.old.base.minions.entity.handler;

import com.qualityplus.minions.api.handler.*;
import com.qualityplus.minions.old.api.handler.AnimationHandler;
import com.qualityplus.minions.old.api.handler.FuelHandler;
import com.qualityplus.minions.old.api.handler.LayoutHandler;
import com.qualityplus.minions.old.api.handler.SellHandler;
import com.qualityplus.minions.old.api.handler.StorageHandler;

public interface MinionHandlers {
    StorageHandler getStorageHandler();
    AnimationHandler getAnimationHandler();
    LayoutHandler getLayoutHandler();
    SellHandler getSellHandler();
    FuelHandler getFuelHandler();
}
