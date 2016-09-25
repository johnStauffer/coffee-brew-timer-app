package com.example.jstauffer.bloomcoffeeassistant.domain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jstauffer on 9/23/16.
 */

public abstract class BrewConstants {

    /**
     * Ratio water (grams) : grounds mass (grams)
     * http://legacy.sweetmarias.com/grind.brew.php
     **/
    public static final int CHEMEX_RATIO = 17;
    public static final int FP_RATIO = 28;

    /**
     * Aeropress Constants
     */

    //General brew Constants
    // Ratio water (grams) : grounds mass (grams)
    public static final int AEROPRESS_RATIO = 16;
    public static final int AEROPRESS_GROUNDS_MASS = 16;
    // http://sweetbloomcoffee.com/pages/brewing

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
    private static BrewStage aeropressBrew = new BrewStage("Brew", AEROPRESS_BREW_MASS, AEROPRESS_BREW_TIME );
    public static final List<BrewStage> AEROPRESS_STAGES = Arrays.asList(aeropressBloom, aeropressPour, aeropressBrew);

}