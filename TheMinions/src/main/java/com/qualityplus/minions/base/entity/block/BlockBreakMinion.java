package com.qualityplus.minions.base.entity.block;

import com.qualityplus.minions.api.animation.Animation;
import com.qualityplus.minions.api.animation.Resultable;
import com.qualityplus.minions.api.equipment.MinionEquipment;
import com.qualityplus.minions.api.exception.NoStorageSpaceException;
import com.qualityplus.minions.api.settings.MinionSettings;
import com.qualityplus.minions.api.state.MinionState;
import com.qualityplus.minions.base.animation.AFKAnimation;
import com.qualityplus.minions.base.animation.BreakAnimation;
import com.qualityplus.minions.base.animation.RotateAnimation;
import com.qualityplus.minions.base.animation.SearchAnimation;
import com.qualityplus.minions.base.entity.GameMinion;
import com.qualityplus.minions.base.state.ActioningState;
import com.qualityplus.minions.base.state.ThinkingState;
import com.qualityplus.minions.base.state.error.InventoryFullState;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class BlockBreakMinion extends GameMinion {
    protected BlockBreakMinion(final Animation animation, final MinionState state, final MinionEquipment equipment, final MinionSettings settings) {
        super(animation, state, equipment, settings);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void doWhileActioning() {
        if (!this.animation.isCompleted()) {
            return;
        }

        if (!(this.animation instanceof Resultable)) {
            return;
        }

        final Resultable<List<ItemStack>> resultable = (Resultable<List<ItemStack>>) this.animation;

        final List<ItemStack> result = resultable.getResult();

        if (this.storage.canAdd(result)) {
            this.storage.addItems(result);
            this.state = new ThinkingState();
            this.animation = new SearchAnimation(this);
        } else {
            this.state = new InventoryFullState();
            this.animation = new AFKAnimation(this);
        }
    }

    @Override
    protected void doWhileThinking() {
        if (this.animation instanceof SearchAnimation) {

            if (!animation.isCompleted()) {
                return;
            }

            final SearchAnimation searchAnimation = (SearchAnimation) this.animation;

            this.animation = new RotateAnimation(this, searchAnimation.getResult());

        } else if (this.animation instanceof RotateAnimation) {

            if (!animation.isCompleted()) {
                return;
            }

            this.state = new ActioningState();
            this.animation = new BreakAnimation(this);
        }
    }

    @Override
    protected void doWhileError() {

    }

    @Override
    public void deSpawn() {

    }



}
