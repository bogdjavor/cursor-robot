package com.robot;

public class RobotV3 implements Robot {
    @Override
    public void shout() {
        System.out.println("Robot V3 is shouting " + '"'+ "I'm staying Aliveeee" + '"');
    }

    @Override
    public void shoot() {
        System.out.println("Robot V3 shooting with a laser!.");
    }

    @Override
    public void move() {
        System.out.println("Robot V3 would like to come over to You.");
    }
}
