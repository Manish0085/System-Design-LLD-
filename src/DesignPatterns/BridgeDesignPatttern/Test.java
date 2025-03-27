package DesignPatterns.BridgeDesignPatttern;

public class Test {

    public static void main(String[] args) {
        Device tv = new TV();
        tv.turnOn();
        tv.setVolume(45);
        tv.turnOff();

        Device radio = new Radio();
        radio.turnOn();
        radio.setVolume(45);
        radio.turnOff();


    }
}
