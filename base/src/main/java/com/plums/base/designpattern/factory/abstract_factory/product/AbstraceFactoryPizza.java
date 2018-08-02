package com.plums.base.designpattern.factory.abstract_factory.product;

import com.plums.base.designpattern.factory.abstract_factory.ingredient.Cheese;
import com.plums.base.designpattern.factory.abstract_factory.ingredient.Dough;
import com.plums.base.designpattern.factory.abstract_factory.ingredient.Sauce;

public abstract class AbstraceFactoryPizza {

    private String name;

    private Dough dough;

    private Cheese cheese;

    private Sauce sauce;

    /**
     * 不同的披萨需要不同的原料，原料是从原料工厂上生产的，我们把这部分抽象出来
     * 让子类去决定需要的原料 我们不关心具体都使用了什么原料 以此方式解耦
     * */
    public abstract void prepare();

    public void bake() {
        System.out.println(" baking  -- ");
    }

    public void cut() {
        System.out.println(" cutting  -- ");
    }

    public void box() {
        System.out.println(" boxing  -- ");
    }
}
