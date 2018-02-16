package com.avans;

import com.avans.Domain.CoffeeWithHook;
import com.avans.Domain.Duck;
import com.avans.Domain.Tea;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Tea myTea = new Tea();
//        myTea.prepareRecipe();
//
//        CoffeeWithHook cwh = new CoffeeWithHook();
//        cwh.prepareRecipe();
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Kees", 6),
                new Duck("Henk", 34),
                new Duck("Klaas", 12),
                new Duck("Piet", 24)
        };

        System.out.println("Before sorting");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting");
        display(ducks);
    }

    public static void display(Duck[] ducks){
        for (Duck d : ducks) {
            System.out.println(d);
        }
    }
}
