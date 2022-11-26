package com.qualityplus.dragon.base.events;

import com.qualityplus.assistant.util.StringUtils;
import com.qualityplus.assistant.util.math.MathUtils;
import com.qualityplus.dragon.TheDragon;
import com.qualityplus.dragon.api.box.Box;
import com.qualityplus.dragon.api.event.DragonGameEvent;
import com.qualityplus.dragon.api.factory.GuardianFactory;
import com.qualityplus.dragon.api.game.DragonGame;
import com.qualityplus.dragon.api.game.guardian.Guardian;
import com.qualityplus.dragon.api.game.structure.type.DragonSpawn;
import com.qualityplus.dragon.base.configs.DragonEventsFile;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import com.qualityplus.dragon.base.configs.DragonEventsFile.GuardianChanceConfig;
import com.qualityplus.dragon.base.configs.DragonEventsFile.SerializableEvent;

import java.util.*;

public final class DragonGuardianEvent extends DragonGameEvent {
    private final List<GuardianChanceConfig> guardiansConfig;
    private final Set<Entity> guardians = new HashSet<>();
    private final int guardiansAmount;

    public DragonGuardianEvent(SerializableEvent event) {
        super(event.generalSettings.secondsDuration, event.generalSettings.repeatEventAfterSeconds, event.generalSettings.dragonSpeedAmplifier, event.generalSettings.keepDragonAFK);
        this.guardiansAmount = event.guardianSettings.guardiansAmount;
        this.guardiansConfig = event.guardianSettings.guardians;
    }

    @Override
    public void start(DragonGame dragonGame) {
        time = 0;
        task = Bukkit.getScheduler().runTaskTimerAsynchronously(TheDragon.getApi().getPlugin(), () -> {
            move(dragonGame);
            //Cancelling Event
            if(time >= duration)
                finish();
            else
                //Chequear El Evento
                if(time % repeat == 0)
                    spawn();
            time++;
        }, 0, 20);
    }

    @Override
    public void finish() {
        super.finish();

        guardians.stream().filter(Objects::nonNull).forEach(entity -> Bukkit.getScheduler().runTask(TheDragon.getApi().getPlugin(), entity::remove));
    }


    private void spawn(){
        if(!isActive()) return;

        Set<Location> locations = getRandomLocations(guardiansAmount);


        locations.forEach(loc -> Bukkit.getScheduler().runTask(TheDragon.getApi().getPlugin(), () -> addGuardian(loc)));
    }

    private Set<Location> getRandomLocations(int amount){
        Set<Location> locations = new HashSet<>();

        for(int i = 0; locations.size()<amount; i++){
            Location location = TheDragon.getApi().getGuardianService().getRandomLocation();

            if(location == null) continue;

            locations.add(location);

            if(i == 100) break;
        }

        return locations;
    }


    private void addGuardian(Location location){
        try {
            Guardian guardian = TheDragon.getApi().getGuardianService().getRandomGuardian(guardiansConfig);

            guardians.add(guardian.spawn(location));
        }catch (Exception e){
            Bukkit.getConsoleSender().sendMessage(StringUtils.color("&c[TheDragon] Error trying to spawn guardian!"));
        }
    }
}
