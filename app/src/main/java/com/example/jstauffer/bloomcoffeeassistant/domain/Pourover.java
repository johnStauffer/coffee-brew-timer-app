package com.example.jstauffer.bloomcoffeeassistant.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jstauffer on 9/25/16.
 */

public class Pourover implements BrewSystem {

    private int grindMass;
    private int waterMass;
    private int numPourStages = 4;
    private List<BrewStage> brewStages;

    /**
     * Aeropress Constants
     *  http://sweetbloomcoffee.com/pages/brewing
     */

    /**
     * Ratio water (grams) : grounds mass (grams)
     * http://legacy.sweetmarias.com/grind.brew.php
     */
    public static final int POUROVER_RATIO = 16;

    //Bloom
    public static final int POUROVER_BLOOM_TIME = 30;
    public static final int POUROVER_BLOOM_MASS = 35;
    //Pour
    public static final int POUROVER_POUR_TIME = 200;

    public Pourover () {
        brewStages = initBrewStages();
    }

    @Override
    public int getGrindMass() {
        return this.grindMass;
    }

    @Override
    public void setGrindMass(int grindMass) {
        this.waterMass = grindMass * POUROVER_RATIO;
        this.grindMass = grindMass;
    }

    @Override
    public int getWaterMass() {
        return this.waterMass;
    }

    @Override
    public int getBrewTime() {
        int totalBrewTime = 0;
        for (BrewStage brewStage : brewStages) {
            totalBrewTime += brewStage.getStageTime();
        }
        return totalBrewTime;
    }

    @Override
    public List<BrewStage> getBrewStages() {
        return this.brewStages;
    }

    protected List<BrewStage> initBrewStages() {
        /*bloom*/
        List<BrewStage> brewStages = new ArrayList<BrewStage>();
        brewStages.add(new BrewStage("Bloom", POUROVER_BLOOM_MASS, POUROVER_BLOOM_TIME));

        /*Splitting pour into n brew stages*/
        int pourStageWaterMass = waterMass / numPourStages;
        int pourStageTime = POUROVER_POUR_TIME / numPourStages;
        for (int stageNum = 0; stageNum < numPourStages; stageNum++) {
            String brewName = String.format("Pour Stage %d/%d", stageNum+1, numPourStages);
            BrewStage brewStage = new BrewStage(brewName, pourStageWaterMass, pourStageTime);
            brewStages.add(brewStage);
        }
        return brewStages;
    }

    public int getNumPourStages() {
        return numPourStages;
    }

    public void setNumPourStages(int numPourStages) {
        this.numPourStages = numPourStages;
        this.brewStages = initBrewStages();
    }
}
