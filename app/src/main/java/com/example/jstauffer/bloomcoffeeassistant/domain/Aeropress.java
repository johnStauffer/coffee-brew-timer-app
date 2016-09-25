package com.example.jstauffer.bloomcoffeeassistant.domain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jstauffer on 9/23/16.
 */

public class Aeropress implements BrewSystem {
    private int grindMass;
    private int waterMass;
    private int brewTime;
    private int numCups;
    private List<BrewStage> brewStages;


    public Aeropress() {
        brewStages = BrewConstants.AEROPRESS_STAGES;
    }

    @Override
    public int getGrindMass() {
        return this.grindMass;
    }

    @Override
    public void setGrindMass(int grindMass) {
        this.grindMass = grindMass;
        //Setting water mass based on water:coffee brew ratio
        this.waterMass = grindMass * BrewConstants.AEROPRESS_RATIO;
    }

    @Override
    public int getWaterMass() {
        return this.waterMass;
    }


    //TODO change builder to factory, figure out java 1.8 for android -> lambdas
    @Override
    public int getBrewTime() {
        int brewTime = 0;

        for (BrewStage brewStage : brewStages) {
            brewTime += brewStage.getStageTime();
        }
        return brewTime;
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
        return brewStages;
    }

    @Override
    public void setBrewStages(List<BrewStage> brewStages) {
        this.brewStages = brewStages;
    }

}
