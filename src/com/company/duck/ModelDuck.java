package com.company.duck;

import com.company.fly.FlyNoWay;
import com.company.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("\n---I'm a model duck---");
    }
}
