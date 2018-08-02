package com.plums.base.designpattern.factory.abstract_factory.ingredientFactory;

import com.plums.base.designpattern.factory.abstract_factory.ingredient.Cheese;
import com.plums.base.designpattern.factory.abstract_factory.ingredient.Dough;
import com.plums.base.designpattern.factory.abstract_factory.ingredient.Sauce;

/**  抽象工厂 包装了一组对象的创建方法*/
public interface PizzaIngredientFactory {

    public Dough creatDough();
    public Sauce creatSauce();
    public Cheese creatCheese();

}
