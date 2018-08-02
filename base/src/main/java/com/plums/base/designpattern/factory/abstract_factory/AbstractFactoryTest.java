package com.plums.base.designpattern.factory.abstract_factory;

import com.plums.base.designpattern.factory.abstract_factory.pizzastore.AbstractFactoryPizzaStore;
import com.plums.base.designpattern.factory.abstract_factory.pizzastore.impl.NYPizzaStore;
import com.plums.base.designpattern.factory.abstract_factory.product.AbstraceFactoryPizza;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        // 我想吃一个纽约芝士披萨
        AbstractFactoryPizzaStore pizzaStore = new NYPizzaStore();
        AbstraceFactoryPizza cheese = pizzaStore.orderPizza("cheese");
        System.out.println(cheese);
    }
}
