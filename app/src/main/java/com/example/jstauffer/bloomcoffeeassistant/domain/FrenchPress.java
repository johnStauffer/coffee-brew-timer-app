package com.example.jstauffer.bloomcoffeeassistant.domain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jstauffer on 9/25/16.
 */

public class FrenchPress implements BrewSystem {

    private int grindMass;
    private int waterMass;
    private List<BrewStage> brewStages;

    /**
     * Ratio water (grams) : grounds mass (grams)
     * http://legacy.sweetmarias.com/grind.brew.php
     **/
    public static final int FRENCHPRESS_RATIO = 17;

    //Bloom
    public static final int FRENCHPRESS_BLOOM_TIME = 25;
    public static final int FRENCHPRESS_BLOOM_MASS = 35;

    //Brew
    public static final int FRENCHPRESS_BREW_TIME = 205;


    public FrenchPress() {
        this.brewStages = initBrewStages();
    }

    @Override
    public int getGrindMass() {
        return this.grindMass;
    }

    /*Sets grind mass and calculates then sets water mass based off constant ratio */
    @Override
    public void setGrindMass(int grindMass) {
        this.waterMass = grindMass * FRENCHPRESS_RATIO;
        this.grindMass = grindMass;

    }

    @Override
    public int getWaterMass() {
        return this.waterMass;
    }

    /* return sum of brew stage times */
    @Override
    public int getBrewTime() {
        int totalBrewTime = 0;
        /*sums brew times from individual brew stages*/
        for (BrewStage brewStage : brewStages){
            totalBrewTime += brewStage.getStageTime();
        }
        return totalBrewTime;
    }

    @Override
    public List<BrewStage> getBrewStages() {
        return this.brewStages;
    }

    private List<BrewStage> initBrewStages(){
        BrewStage bloom = new BrewStage("Bloom", FRENCHPRESS_BLOOM_MASS, FRENCHPRESS_BLOOM_TIME );
        BrewStage brew = new BrewStage("Brew", waterMass - FRENCHPRESS_BLOOM_MASS, FRENCHPRESS_BREW_TIME);
        return Arrays.asList(bloom, brew);
    }
}
