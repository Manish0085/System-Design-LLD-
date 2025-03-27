package DesignPatterns.BridgeDesignPatttern;

public class Radio implements Device{


    @Override
    public void turnOff() {
        System.out.println("Radio is turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("Radio is turned on");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio volume is set to "+volume);
    }
}
