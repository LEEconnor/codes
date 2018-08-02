package com.plums.base.designpattern.factory.fatory_method;

import com.plums.base.designpattern.factory.fatory_method.pizzastore.impl.NYPizzaStore;
import com.plums.base.designpattern.factory.fatory_method.pizzastore.PizzaStore;
import org.junit.jupiter.api.Test;

public class TestFactoryMethod {

    @Test
    public void test(){
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
