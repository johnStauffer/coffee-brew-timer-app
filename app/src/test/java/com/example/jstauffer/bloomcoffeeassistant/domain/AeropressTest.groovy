package com.example.jstauffer.bloomcoffeeassistant.domain

import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by jstauffer on 9/28/16.
 */
class AeropressTest extends Specification {

    @Shared def aeropress = new Aeropress();

    def "Test setGrindMass" () {
        when:
        aeropress.setGrindMass(16);
        then:
        aeropress.getWaterMass() == 256
        aeropress.getGrindMass() == 16
    }

    def "Test getBrewTime"(){
        given:
        def brewTime = Aeropress.AEROPRESS_BLOOM_TIME + Aeropress.AEROPRESS_BREW_TIME + Aeropress.AEROPRESS_POUR_TIME
        when:
        def totalBrewTime = aeropress.getBrewTime()
        then:
        brewTime == totalBrewTime
    }

}
