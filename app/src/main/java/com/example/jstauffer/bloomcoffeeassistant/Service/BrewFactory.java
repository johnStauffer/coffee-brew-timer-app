package com.example.jstauffer.bloomcoffeeassistant.service;

import com.example.jstauffer.bloomcoffeeassistant.domain.Aeropress;
import com.example.jstauffer.bloomcoffeeassistant.domain.BrewSystem;
import com.example.jstauffer.bloomcoffeeassistant.domain.FrenchPress;
import com.example.jstauffer.bloomcoffeeassistant.domain.Pourover;

/**
 * Created by jstauffer on 9/23/16.
 */

public class BrewFactory {

    public BrewSystem getBrewSystem(String brewSystem) {

        if (brewSystem.equalsIgnoreCase("aeropress")) {
            return new Aeropress();
        }
        if (brewSystem.equalsIgnoreCase("frenchpress")){
            return new FrenchPress();
        }
        if (brewSystem.equalsIgnoreCase("pourover")) {
            return new Pourover();
        }
        return null;
    }
}
