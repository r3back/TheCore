package com.qualityplus.anvil.base.gui.anvilmain.strategy.gui.normal;

import com.qualityplus.anvil.api.box.Box;
import com.qualityplus.anvil.api.session.AnvilSession;
import com.qualityplus.anvil.base.gui.anvilmain.AnvilMainGUI;
import com.qualityplus.anvil.base.gui.anvilmain.request.ClickRequest;
import com.qualityplus.anvil.base.gui.anvilmain.strategy.ClickRequestStrategy;
import com.qualityplus.anvil.base.session.AnvilSessionImpl;
import com.qualityplus.anvil.util.ClickLocation;
import com.qualityplus.assistant.api.util.BukkitItemUtil;
import org.bukkit.entity.Player;

public final class NormalPickUpRequestStrategy implements ClickRequestStrategy {
    @Override
    public boolean applies(ClickRequest request) {
        return ClickLocation.of(request).isGuiInventory() &&
                request.isPickUpSlot() &&
                !request.isShiftClick();
    }

    @Override
    public void execute(ClickRequest request) {
        final Player player = request.getPlayer().orElse(null);
        final AnvilSession session = request.getSession();
        final AnvilMainGUI gui = request.getGui();
        final Box box = request.getBox();

        if (player == null) {
            return;
        }

        if(BukkitItemUtil.isNull(session.getResult())) {
            cancelEvent(request);
            return;
        }

        gui.setGiveItem(false);

        player.openInventory(new AnvilMainGUI(box, new AnvilSessionImpl(null, null, null)).getInventory());

        player.setItemOnCursor(session.getResult());
    }
}
