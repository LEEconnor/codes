package com.plums.base.designpattern.factory.product;

public class Pizza {

    public void prepare() {
        System.out.println(" prepareing  -- ");
    }

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
