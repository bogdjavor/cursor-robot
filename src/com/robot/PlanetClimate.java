package com.robot;

import java.util.Random;

public class PlanetClimate {

    public void RandomPlanet() {

        ClimateShield ClimateShield = new ClimateShield();

        Random number = new Random();
        char numberPlanet = (char) (number.nextInt(3) + 'a');
        System.out.printf("Random char is set to %s. \n", numberPlanet);

        if (numberPlanet == 'a') {
            System.out.println("Windy planet chosen");
            ClimateShield.WindShield();
        } else if (numberPlanet == 'b') {
            System.out.println("Sunny planet chosen");
            ClimateShield.SunShield();
        } else {
            System.out.println("Wet planet chosen");
            ClimateShield.WaterShield();
        }
    }

}
