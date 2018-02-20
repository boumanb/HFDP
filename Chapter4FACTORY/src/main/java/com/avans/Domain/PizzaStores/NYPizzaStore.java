package com.avans.Domain.PizzaStores;

import com.avans.Domain.Factories.SimplePizzaFactory;
import com.avans.Domain.Pizza;
import com.avans.Domain.PizzaStore;
import com.avans.Domain.Pizzas.NY.NYStyleCheesePizza;
import com.avans.Domain.Pizzas.NY.NYStyleClamPizza;
import com.avans.Domain.Pizzas.NY.NYStylePepperoniPizza;
import com.avans.Domain.Pizzas.NY.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }

}
