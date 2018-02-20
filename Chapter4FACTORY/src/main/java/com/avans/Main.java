package com.avans;

import com.avans.Domain.Pizza;
import com.avans.Domain.PizzaStore;
import com.avans.Domain.PizzaStores.ChicagoPizzaStore;
import com.avans.Domain.PizzaStores.NYPizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
