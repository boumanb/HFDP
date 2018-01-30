package com.company.Classes.Duck;

import com.company.Abstract.Duck;
import com.company.Classes.FlyBehavior.FlyNoWay;
import com.company.Classes.QuackBehavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
