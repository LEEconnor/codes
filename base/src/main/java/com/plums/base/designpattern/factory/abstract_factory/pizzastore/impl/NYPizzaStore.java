package com.plums.base.designpattern.factory.abstract_factory.pizzastore.impl;

import com.plums.base.designpattern.factory.abstract_factory.product.AbstraceFactoryPizza;
import com.plums.base.designpattern.factory.abstract_factory.ingredientFactory.PizzaIngredientFactory;
import com.plums.base.designpattern.factory.abstract_factory.ingredientFactory.impl.NYPizzaIngredientFactory;
import com.plums.base.designpattern.factory.abstract_factory.pizzastore.AbstractFactoryPizzaStore;
import com.plums.base.designpattern.factory.abstract_factory.product.impl.CheesePizza;

public class NYPizzaStore extends AbstractFactoryPizzaStore {

    private PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
    ;

    @Override
    protected AbstraceFactoryPizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza(pizzaIngredientFactory);
        }
        return null;
    }
}
