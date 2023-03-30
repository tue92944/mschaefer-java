package org.example;

public class Tv implements Connectable{
    private boolean isOn;

    private String name = "Tv";
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
