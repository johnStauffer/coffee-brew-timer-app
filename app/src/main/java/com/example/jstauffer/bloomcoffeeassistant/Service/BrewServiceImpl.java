package com.example.jstauffer.bloomcoffeeassistant.service;

/**
 * Created by jstauffer on 9/23/16.
 */

public class BrewServiceImpl implements BrewService {

    private static BrewService instance = null;

    private BrewServiceImpl() {
        //Singleton
    }

    /**
     * Singleton pattern instantiation
     */
    public static BrewService getInstance() {
        if (instance == null)
            instance = new BrewServiceImpl();
        return instance;
    }



}
