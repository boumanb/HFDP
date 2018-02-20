package com.avans.Domain.Factories;

import com.avans.Domain.*;
import com.avans.Domain.Pizzas.CheesePizza;
import com.avans.Domain.Pizzas.ClamPizza;
import com.avans.Domain.Pizzas.PepperoniPizza;
import com.avans.Domain.Pizzas.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
