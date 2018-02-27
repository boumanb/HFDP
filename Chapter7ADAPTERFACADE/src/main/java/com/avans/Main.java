package com.avans;

import com.avans.Adapters.TurkeyAdapter;
import com.avans.Domain.MallardDuck;
import com.avans.Domain.WildTurkey;
import com.avans.Interfaces.Duck;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey:");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck:");
        testDuck(duck);

        System.out.println("\nTurkeyAdapter:");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
