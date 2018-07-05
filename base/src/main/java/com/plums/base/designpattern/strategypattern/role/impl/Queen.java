package com.plums.base.designpattern.strategypattern.role.impl;

import com.plums.base.designpattern.strategypattern.behavior.WeapenBehavior;
import com.plums.base.designpattern.strategypattern.behavior.impl.NoWeapenBehavior;
import com.plums.base.designpattern.strategypattern.role.Character;

public class Queen extends Character {

    @Override
    public void booldIncrease() {
        System.out.println(" -- queen is boold increasse ");
    }


    public Queen(WeapenBehavior weapenBehavior) {
        super(weapenBehavior);
    }

    public Queen() {
        super(new NoWeapenBehavior());
    }
}
