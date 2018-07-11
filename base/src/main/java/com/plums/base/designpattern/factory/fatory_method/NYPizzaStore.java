package com.plums.base.designpattern.factory.fatory_method;

import com.plums.base.designpattern.factory.product.Pizza;
import com.plums.base.designpattern.factory.product.impl.NYStyleCheesePizza;
import com.plums.base.designpattern.factory.product.impl.NYStyleClamPizza;
import com.plums.base.designpattern.factory.product.impl.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if(type.equals("clam")){
            pizza = new NYStyleClamPizza();
        }else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }

}
