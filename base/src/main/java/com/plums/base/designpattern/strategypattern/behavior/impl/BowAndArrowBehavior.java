package com.plums.base.designpattern.strategypattern.behavior.impl;

import com.plums.base.designpattern.strategypattern.behavior.WeapenBehavior;

public class BowAndArrowBehavior implements WeapenBehavior {

    @Override
    public void useWeapen() {
        System.out.println(" -- i can use Bow and Arrow ");
    }

}
