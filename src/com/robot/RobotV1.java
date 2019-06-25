package com.robot;

public class RobotV1 implements Robot {

    @Override
    public void shout() {
        System.out.println("Robot V1 is shouting " + '"'+ "Move your ass!" + '"');
    }

    @Override
    public void shoot() {
        System.out.println("Robot V1 shooting with gun!");
    }

    @Override
    public void move() {
        System.out.println("Robot V1 is moving somehow!");
    }
}
