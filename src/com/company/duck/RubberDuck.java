package com.company.duck;

import com.company.fly.FlyNoWay;
import com.company.quack.MuteQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("\n---I'm a rubber duck---");
    }
}
