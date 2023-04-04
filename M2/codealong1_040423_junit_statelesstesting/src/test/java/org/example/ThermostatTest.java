package org.example;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class ThermostatTest {
    private Thermostat testThermostat;


    @BeforeEach
    void setUp() {
        testThermostat = new Thermostat();
        testThermostat.setTargetTemperature(72);
        testThermostat.setTolerance(2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void thermostatShouldBeOnHeatWhenTemperatureIsLow() {
        //Arrange
        int[] tempInput = {72,70,68,69,70};
        Thermostat.ThermostatBehavior expectedResult = Thermostat.ThermostatBehavior.ON_HEAT;

        //Act
        Thermostat.ThermostatBehavior actualResult = testThermostat.readSensorData(tempInput);

        //Assert
        AssertEquals(expectedResult,actualResult);
    }

    @Test
    public void thermostatShouldBeOffWhenTemperatureIsWithinTolerance(){
        //Arrange
        int[] tempInput = {72,70,69,71,70};
        Thermostat.ThermostatBehavior expectedResult = Thermostat.ThermostatBehavior.OFF;

        //Act
        Thermostat.ThermostatBehavior actualResult = testThermostat.readSensorData(tempInput);

        //Assert
        AssertEquals(expectedResult,actualResult);
    }

    @Test public void thermostatShouldBeOnACWhenTempIsHigh(){
        //Arrange
        int[] tempInput = {74,76,75,75,76};
        Thermostat.ThermostatBehavior expectedResult = Thermostat.ThermostatBehavior.ON_AC;

        //Act
        Thermostat.ThermostatBehavior actualResult = testThermostat.readSensorData(tempInput);

        //Assert
        AssertEquals(expectedResult,actualResult);
    }
}