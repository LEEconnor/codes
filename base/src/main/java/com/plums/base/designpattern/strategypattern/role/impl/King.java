package com.plums.base.designpattern.strategypattern.role.impl;

import com.plums.base.designpattern.strategypattern.behavior.WeapenBehavior;
import com.plums.base.designpattern.strategypattern.behavior.impl.NoWeapenBehavior;
import com.plums.base.designpattern.strategypattern.role.Character;

public class King extends Character {

    public King(WeapenBehavior weapenBehavior) {
        super(weapenBehavior);
    }

    public King() {
        super(new NoWeapenBehavior());
    }


    @Override
    public void booldIncrease() {
        System.out.println(" king boold increase ");
    }

}
