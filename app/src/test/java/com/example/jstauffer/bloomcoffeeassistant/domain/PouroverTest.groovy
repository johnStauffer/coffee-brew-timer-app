package com.example.jstauffer.bloomcoffeeassistant.domain

import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by jstauffer on 9/30/16.
 */
class PouroverTest extends Specification {

    @Shared pourover;

    def setupSpec() {
        pourover = new Pourover()
    }

    def "Test setGrindMass"() {
        given:
        def grindMass = 22
        def expectedWaterMass = grindMass * Pourover.POUROVER_RATIO
        when:
        pourover.setGrindMass(grindMass)
        then:
        expectedWaterMass == pourover.getWaterMass()
        grindMass == pourover.getGrindMass()
    }

    def "Test intitBrewStages"() {
        given:
        def defaultNumStages = pourover.getNumPourStages() + 1
        def altNumPourStages = 2
        def exptectedAltStages = altNumPourStages + 1
        when:
        def returnDefaultNumStages = pourover.getBrewStages().size()
        pourover.setNumPourStages(altNumPourStages)
        then:
        defaultNumStages == returnDefaultNumStages
        exptectedAltStages == pourover.getBrewStages().size()
    }

    def "Test getBrewTime"() {
        given:
        def expectedTime = Pourover.POUROVER_BLOOM_TIME + Pourover.POUROVER_POUR_TIME;
        when:
        def returnedTime = pourover.getBrewTime()
        then:
        expectedTime == returnedTime
    }

}
