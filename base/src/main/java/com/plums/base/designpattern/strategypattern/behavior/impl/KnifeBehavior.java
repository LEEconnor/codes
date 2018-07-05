package com.plums.base.designpattern.strategypattern.behavior.impl;

import com.plums.base.designpattern.strategypattern.behavior.WeapenBehavior;

public class KnifeBehavior implements WeapenBehavior {

    @Override
    public void useWeapen() {
        System.out.println(" i can use knife !! ");
    }

}
