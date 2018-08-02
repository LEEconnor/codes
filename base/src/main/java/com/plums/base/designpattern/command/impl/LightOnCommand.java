package com.plums.base.designpattern.command.impl;

import com.plums.base.designpattern.command.Command;
import com.plums.base.designpattern.command.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        light.on();
    }
}
