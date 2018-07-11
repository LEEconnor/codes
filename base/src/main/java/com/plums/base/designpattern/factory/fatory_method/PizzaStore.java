package com.plums.base.designpattern.factory.fatory_method;

import com.plums.base.designpattern.factory.product.Pizza;

/**
 *  统一 售卖pizza接口
 * */
public abstract class PizzaStore {

    /** 做披萨的朴准流程 无论什么披萨 都要按照这个标准去制造*/
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /** 实例化的权利交个子类 */
    protected abstract Pizza createPizza(String type);

}
