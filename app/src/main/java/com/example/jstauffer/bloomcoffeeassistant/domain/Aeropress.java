package com.example.jstauffer.bloomcoffeeassistant.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jstauffer on 9/23/16.
 */

public class Aeropress implements BrewSystem {
    private int grindMass;
    private int waterMass;
    private List<BrewStage> brewStages;

    /**
     * Aeropress Constants
     *  http://sweetbloomcoffee.com/pages/brewing
     */

    /**
     * Ratio water (grams) : grounds mass (grams)
     * http://legacy.sweetmarias.com/grind.brew.php
     */
    public static final int AEROPRESS_RATIO = 16;

    //Bloom
    public static final int AEROPRESS_BLOOM_TIME = 25;
    public static final int AEROPRESS_BLOOM_MASS = 35;
    //Pour
    public static final int AEROPRESS_POUR_TIME = 40;
    public static final int AEROPRESS_POUR_MASS = 230;
    //Brew
    public static final int AEROPRESS_BREW_TIME = 105;
    public static final int AEROPRESS_BREW_MASS = 0;

    public Aeropress() {
        this.brewStages = initBrewStages();
    }

    @Override
    public int getGrindMass() {
        return this.grindMass;
    }


    /**
     * This is a method used to set the mass of grounds as well as calculate and set the total water
     * mass according to a constant ratio
     */
    @Override
    public void setGrindMass(int grindMass) {
        this.grindMass = grindMass;
        //Setting water mass based on water:coffee brew ratio
        this.waterMass = grindMass * AEROPRESS_RATIO;
    }

    @Override
    public int getWaterMass() {
        return this.waterMass;
    }

    /* return sum of brew stage times */
    @Override
    public int getBrewTime() {
        int brewTime = 0;
        /*sums brew times*/
        for (BrewStage brewStage : brewStages) {
            brewTime += brewStage.getStageTime();
        }
        return brewTime;
    }

    @Override
    public List<BrewStage> getBrewStages() {
        return brewStages;
    }

    /*Creating brew stages with brew constants and then making them into a list */
    private List<BrewStage> initBrewStages() {
        BrewStage aeropressBloom = new BrewStage("Bloom", AEROPRESS_BLOOM_MASS, AEROPRESS_BLOOM_TIME);
        BrewStage aeropressPour = new BrewStage("Pour", AEROPRESS_POUR_MASS, AEROPRESS_POUR_TIME);
        BrewStage aeropressBrew = new BrewStage("Brew", AEROPRESS_BREW_MASS, AEROPRESS_BREW_TIME);
        return Arrays.asList(aeropressBloom, aeropressPour, aeropressBrew);
    }

}
