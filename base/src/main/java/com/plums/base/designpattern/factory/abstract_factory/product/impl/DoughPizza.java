package com.plums.base.designpattern.factory.abstract_factory.product.impl;

import com.plums.base.designpattern.factory.abstract_factory.ingredientFactory.PizzaIngredientFactory;
import com.plums.base.designpattern.factory.abstract_factory.ingredientFactory.impl.NYPizzaIngredientFactory;
import com.plums.base.designpattern.factory.abstract_factory.product.AbstraceFactoryPizza;
import com.plums.base.designpattern.factory.fatory_method.product.Pizza;

public class DoughPizza extends AbstraceFactoryPizza {

    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
    /** 准备一个Dough 和 Souce 组合 的披萨*/
    @Override
    public void prepare() {
        pizzaIngredientFactory.creatDough();
        pizzaIngredientFactory.creatSauce();
    }
}
