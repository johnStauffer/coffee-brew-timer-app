package com.example.jstauffer.bloomcoffeeassistant.domain;

import java.util.List;

/**
 * Created by jstauffer on 9/25/16.
 */

public class FrenchPress implements BrewSystem {
    @Override
    public int getGrindMass() {
        return 0;
    }

    @Override
    public void setGrindMass(int grindMass) {

    }

    @Override
    public int getWaterMass() {
        return 0;
    }

    @Override
    public int getBrewTime() {
        return 0;
    }

    @Override
    public int getNumCups() {
        return 0;
    }

    @Override
    public void setNumCups(int numCups) {

    }

    @Override
    public List<BrewStage> getBrewStages() {
        return null;
    }

    @Override
    public void setBrewStages(List<BrewStage> brewStages) {

    }
}
