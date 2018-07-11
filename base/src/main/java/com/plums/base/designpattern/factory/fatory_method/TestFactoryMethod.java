package com.plums.base.designpattern.factory.fatory_method;

import org.junit.jupiter.api.Test;

public class TestFactoryMethod {

    @Test
    public void test(){
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
