package com.avans.Commands;

import com.avans.Domain.Light;
import com.avans.Interface.Command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
