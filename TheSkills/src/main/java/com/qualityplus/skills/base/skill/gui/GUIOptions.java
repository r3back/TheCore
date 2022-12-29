package com.qualityplus.skills.base.skill.gui;

import com.cryptomorin.xseries.XMaterial;
import eu.okaeri.configs.OkaeriConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class GUIOptions extends OkaeriConfig {
    private int slot;
    private int page;
    private XMaterial item;
    private String texture;
    private int customModelData;
    private List<String> mainMenuLore;

    @Builder
    public GUIOptions(int slot, int page, XMaterial item, String texture, List<String> mainMenuLore, int customModelData) {
        this.slot = slot;
        this.page = page;
        this.item = item;
        this.texture = texture;
        this.mainMenuLore = mainMenuLore;
        this.customModelData = customModelData;
    }
}
