package com.example.jstauffer.bloomcoffeeassistant.Service;

/**
 * Created by jstauffer on 10/7/16.
 */

public class BrewServiceImpl implements BrewService {

    BrewService instance = null ;

    private BrewServiceImpl (){
    }

    public BrewService getInstance() {
        if (instance == null) {
            instance = new BrewServiceImpl();
        }
        return instance;
    }



}
