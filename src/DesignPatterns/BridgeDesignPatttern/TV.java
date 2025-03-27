package DesignPatterns.BridgeDesignPatttern;

public class TV implements Device{


    @Override
    public void turnOff() {
        System.out.println("Tv is turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("TV is turned on");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume is set to "+volume);
    }
}
