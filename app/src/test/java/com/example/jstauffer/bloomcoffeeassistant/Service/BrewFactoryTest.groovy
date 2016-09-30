package com.example.jstauffer.bloomcoffeeassistant.service

import com.example.jstauffer.bloomcoffeeassistant.domain.Aeropress
import com.example.jstauffer.bloomcoffeeassistant.domain.FrenchPress
import com.example.jstauffer.bloomcoffeeassistant.domain.Pourover
import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by jstauffer on 9/30/16.
 */
class BrewFactoryTest extends Specification {

    @Shared brewFactory = new BrewFactory()

    def "Test getBrewSystem" () {
        given:
        def aeropress
        def frenchpress
        def pourover

        when:
        aeropress = brewFactory.getBrewSystem("aeropress")
        frenchpress = brewFactory.getBrewSystem("frenchpress")
        pourover = brewFactory.getBrewSystem("pourover")

        then:
        aeropress instanceof  Aeropress
        frenchpress instanceof FrenchPress
        pourover instanceof Pourover

    }
}
