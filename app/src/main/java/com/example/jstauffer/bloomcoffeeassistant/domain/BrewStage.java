package com.example.jstauffer.bloomcoffeeassistant.domain;

/**
 * Created by jstauffer on 9/23/16.
 */

/**
 * BrewStage is a class for more granular information about each stage of the brew process
 */
public class BrewStage {
    private String stageName;
    private int stageWaterMass;
    private int stageTime;

    public BrewStage(String stageName, int waterMass, int stageTime){
        this.stageWaterMass = waterMass;
        this.stageTime = stageTime;
    }

    public int getStageWaterMass() {
        return stageWaterMass;
    }

    public void setStageWaterMass(int stageWaterMass) {
        this.stageWaterMass = stageWaterMass;
    }

    public int getStageTime() {
        return stageTime;
    }

    public void setStageTime(int stageTime) {
        this.stageTime = stageTime;
    }


    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
}
