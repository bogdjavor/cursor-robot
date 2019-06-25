package com.robot;

public class Main {

    public static void main(String[] args) {

        RobotInit init = new RobotInit();
        PlanetClimate planet = new PlanetClimate();

        System.out.println("Random number is " + init.Number() + ". The " + init.RandomRobotVer() + " was initiated");

        init.robot.move();
        init.robot.shoot();
        init.robot.shout();

        planet.RandomPlanet();
    }
}
