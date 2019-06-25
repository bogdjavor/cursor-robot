package com.robot;

public class RobotInit {
    private int randomNumber;
    Robot robot;

    public int Number () {
        int min = 1;
        int max = 12;

        randomNumber = (int) (Math.random() * ((max - min) + min));
        return randomNumber;
    }

    public String RandomRobotVer () {
        if (randomNumber <= 3) {
            robot = new RobotV1();
            return "Version 1";

        } else if (randomNumber <= 8) {
            robot = new RobotV2();
            return "Version 2";

        } else {
            robot = new RobotV3();
            return "Version 3";
        }
    }
}
