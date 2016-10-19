package com.example.jstauffer.bloomcoffeeassistant.service;

/**
 * Created by jstauffer on 10/7/16.
 */

public class BrewServiceImpl implements BrewService {

    BrewService instance = null ;

    private BrewServiceImpl() {
        //Singleton
    }

    public BrewService getInstance() {
        if (instance == null) {
            instance = new BrewServiceImpl();
        }
        return instance;
    }



}
