package com.qualityplus.minions.old.base.gui.changeitem;

import com.qualityplus.minions.old.base.minions.minion.Minion;
import com.qualityplus.minions.old.base.minions.minion.upgrade.MinionUpgrade;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ChangeItemRequest {
    private final MinionUpgrade minionUpgrade;
    private final ChangeItem changeItem;
    private final Minion minion;

    public boolean is(ChangeItem changeItem) {
        return this.changeItem.equals(changeItem);
    }
}
