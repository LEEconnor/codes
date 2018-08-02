package com.plums.base.designpattern.factory.abstract_factory.pizzastore;

import com.plums.base.designpattern.factory.abstract_factory.product.AbstraceFactoryPizza;

public abstract class AbstractFactoryPizzaStore {

    /**
     * 做披萨的朴准流程 无论什么披萨 都要按照这个标准去制造
     */
    public AbstraceFactoryPizza orderPizza(String type) {
        AbstraceFactoryPizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 实例化的权利交个子类
     */
    protected abstract AbstraceFactoryPizza createPizza(String type);
}
