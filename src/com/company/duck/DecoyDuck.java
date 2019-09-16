package com.company.duck;

import com.company.fly.FlyNoWay;
import com.company.quack.Squeak;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("\n---I'm a decoy duck---");
    }
}
