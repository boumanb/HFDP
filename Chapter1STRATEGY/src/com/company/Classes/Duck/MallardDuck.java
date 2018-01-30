package com.company.Classes.Duck;

import com.company.Abstract.Duck;
import com.company.Classes.FlyBehavior.FlyWithWings;
import com.company.Classes.QuackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
