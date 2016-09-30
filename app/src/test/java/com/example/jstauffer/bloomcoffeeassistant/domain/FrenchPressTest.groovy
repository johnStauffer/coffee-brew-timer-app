package com.example.jstauffer.bloomcoffeeassistant.domain

import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by jstauffer on 9/30/16.
 */
class FrenchPressTest extends Specification {

    @Shared frenchpress = new FrenchPress()

    def "Test setGrindMass" () {
        given:
        def grindMass = 16
        def expectedMass = grindMass * FrenchPress.FRENCHPRESS_RATIO
        when:
        frenchpress.setGrindMass(grindMass);
        then:
        frenchpress.getWaterMass() == expectedMass
        frenchpress.getGrindMass() == grindMass
    }

    def "Test getBrewTime"(){
        given:
        def brewTime = FrenchPress.FRENCHPRESS_BLOOM_TIME + FrenchPress.FRENCHPRESS_BREW_TIME
        when:
        def totalBrewTime = frenchpress.getBrewTime()
        then:
        brewTime == totalBrewTime
    }

}
