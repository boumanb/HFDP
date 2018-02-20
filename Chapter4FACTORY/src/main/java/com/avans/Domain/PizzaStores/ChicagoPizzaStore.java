package com.avans.Domain.PizzaStores;

import com.avans.Domain.Pizza;
import com.avans.Domain.PizzaStore;
import com.avans.Domain.Pizzas.Chicago.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }

}
