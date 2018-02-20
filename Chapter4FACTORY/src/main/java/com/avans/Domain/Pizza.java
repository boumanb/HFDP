package com.avans.Domain;

import java.util.ArrayList;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
        System.out.println("Prepared");
    }

    void bake() {
        System.out.println("Baked");
    }

    void cut() {
        System.out.println("Cutted");
    }

    void box() {
        System.out.println("Boxed");
    }

    public String getName() {
        return name;
    }
}
