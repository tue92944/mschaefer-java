package org.example;

public class Fridge implements Connectable{
    private boolean isOn;
    private String name = "Fridge";
    @Override
    public void turnOn() {
        isOn = true;

    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public boolean getState() {
        return isOn;
    }

    @Override
    public String getName() {
        return name;
    }
}
