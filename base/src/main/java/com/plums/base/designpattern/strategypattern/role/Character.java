package com.plums.base.designpattern.strategypattern.role;

import com.plums.base.designpattern.strategypattern.behavior.WeapenBehavior;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Character {

    private WeapenBehavior weapenBehavior;

    public void fight() {
        weapenBehavior.useWeapen();
    }

    public abstract void booldIncrease();

}
