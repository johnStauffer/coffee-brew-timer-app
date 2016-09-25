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

    /**
     * Aeropress Constants
     *  http://sweetbloomcoffee.com/pages/brewing
     */

    /**
     * Ratio water (grams) : grounds mass (grams)
     * http://legacy.sweetmarias.com/grind.brew.php
     **/
    public static final int AEROPRESS_RATIO = 16;
    public static final int AEROPRESS_GROUNDS_MASS = 16;

    //Bloom
    public static final int AEROPRESS_BLOOM_TIME = 25;
    public static final int AEROPRESS_BLOOM_MASS = 35;
    //Pour
    public static final int AEROPRESS_POUR_TIME = 40;
    public static final int AEROPRESS_POUR_MASS = 230;
    //Brew
    public static final int AEROPRESS_BREW_TIME = 105;
    public static final int AEROPRESS_BREW_MASS = 0;

    /**
     * Aeropress brew stages
     */
    private static BrewStage aeropressBloom = new BrewStage("Bloom", AEROPRESS_BLOOM_MASS, AEROPRESS_BLOOM_TIME);
    private static BrewStage aeropressPour = new BrewStage("Pour", AEROPRESS_POUR_MASS, AEROPRESS_POUR_TIME);
    private static BrewStage aeropressBrew = new BrewStage("Brew", AEROPRESS_BREW_MASS, AEROPRESS_BREW_TIME);
    private final List<BrewStage> AEROPRESS_STAGES = Arrays.asList(aeropressBloom, aeropressPour, aeropressBrew);


    public Aeropress() {
        brewStages = AEROPRESS_STAGES;
    }

    @Override
    public int getGrindMass() {
        return this.grindMass;
    }


    /**
     * This is a method used to set the mass of grounds as well as calculate the total water mass
     * based off of a constant ratio
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


    //TODO figure out java 1.8 for android -> lambdas
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
