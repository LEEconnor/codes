package com.plums.base.designpattern.strategypattern;

import com.plums.base.designpattern.strategypattern.behavior.impl.GunBehavior;
import com.plums.base.designpattern.strategypattern.role.Character;
import com.plums.base.designpattern.strategypattern.role.impl.King;

public class StrategyTest {

    public static void main(String[] args) {
        Character a = new King();
        a.booldIncrease();
        a.fight();

        System.out.println(" -- 捡到枪了 --");

        a.setWeapenBehavior(new GunBehavior());
        a.fight();
    }

}
