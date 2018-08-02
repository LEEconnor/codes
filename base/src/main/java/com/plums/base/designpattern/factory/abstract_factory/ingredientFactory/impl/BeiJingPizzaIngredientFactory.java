package com.plums.base.designpattern.factory.abstract_factory.ingredientFactory.impl;

import com.plums.base.designpattern.factory.abstract_factory.ingredient.Cheese;
import com.plums.base.designpattern.factory.abstract_factory.ingredient.Dough;
import com.plums.base.designpattern.factory.abstract_factory.ingredient.Sauce;
import com.plums.base.designpattern.factory.abstract_factory.ingredientFactory.PizzaIngredientFactory;

public class BeiJingPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough creatDough() {
        return new Dough("this is chinese Dought");
    }

    @Override
    public Sauce creatSauce() {
        return new Sauce("this is chinese Souce");
    }

    @Override
    public Cheese creatCheese() {
        return new Cheese("this is chinese Cheese");
    }
}
