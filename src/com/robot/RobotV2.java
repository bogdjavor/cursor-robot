package com.robot;

public class RobotV2 implements Robot {

    @Override
    public void shout() {
        System.out.println("Robot V2 is shouting " + '"'+ "I'll be back!" + '"');
    }

    @Override
    public void shoot() {
        System.out.println("Robot V2 is shooting with a fire thrower!");
    }

    @Override
    public void move() {
        System.out.println("Robot V2 is coming for You!");
    }
}
