package com.example.jstauffer.bloomcoffeeassistant.domain;

/**
 * Created by jstauffer on 7/15/16.
 */
public class Brew {
    private int grindMass;
    private int waterMass;
    private int brewTime;
    private int numCups;



    public int getGrindMass() {
        return grindMass;
    }

    public void setGrindMass(int grindMass) {
        this.grindMass = grindMass;
    }

    public int getWaterMass() {
        return waterMass;
    }

    public void setWaterMass(int waterMass) {
        this.waterMass = waterMass;
    }

    public int getBrewTime() {
        return brewTime;
    }

    public void setBrewTime(int brewTime) {
        this.brewTime = brewTime;
    }

    public int getNumCups() {
        return numCups;
    }

    public void setNumCups(int numCups) {
        this.numCups = numCups;
    }

    private enum brewSystem {Aeropress, Chemex, Hario}

}
