package com.company;

import com.company.Abstract.Duck;
import com.company.Classes.Duck.MallardDuck;
import com.company.Classes.Duck.ModelDuck;
import com.company.Classes.FlyBehavior.FlyRocketPowered;

public class Main {

    public static void main(String[] args) {
	    Duck mallard = new MallardDuck();
	    mallard.performQuack();
	    mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
