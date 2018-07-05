package com.plums.base.designpattern.strategypattern.behavior.impl;

import com.plums.base.designpattern.strategypattern.behavior.WeapenBehavior;

public class GunBehavior implements WeapenBehavior {

    @Override
    public void useWeapen() {
        System.out.println(" i can ues gun !!  biu~biu~biu~  ");
    }

}
