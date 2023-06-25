package com.qualityplus.minions.old.base.minions.entity;

import com.qualityplus.assistant.lib.eu.okaeri.configs.OkaeriConfig;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public final class MinionEntityOptions extends OkaeriConfig {
    private String displayName;
    private String particle;
}
