package com.example.jstauffer.bloomcoffeeassistant.domain;

import java.util.List;

/**
 * Created by jstauffer on 9/23/16.
 */

public interface BrewSystem {

    int getGrindMass();

    void setGrindMass(int grindMass);

    int getWaterMass();

    int getBrewTime();

    List<BrewStage> getBrewStages();

}
