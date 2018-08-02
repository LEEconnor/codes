package com.plums.base.designpattern.factory.abstract_factory.product.impl;

import com.plums.base.designpattern.factory.abstract_factory.ingredientFactory.PizzaIngredientFactory;
import com.plums.base.designpattern.factory.abstract_factory.product.AbstraceFactoryPizza;

/**
 * 无论墨西哥的奶酪披萨还是纽约的奶酪披萨
 * 只要是奶酪披萨都需要如下几种材料
 * 抽象解耦 隐藏细节
 * */
public class CheesePizza extends AbstraceFactoryPizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    /**
     * 准备一个奶酪和Dough做的披萨
     * */
    @Override
    public void prepare() {
        pizzaIngredientFactory.creatCheese();
        pizzaIngredientFactory.creatDough();
    }
}
