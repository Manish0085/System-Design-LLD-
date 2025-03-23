package DesignPatterns.StateDesignPattern;

public class RedLight implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("🚦 Red Light - Stop!");
        context.scheduleStateChange(new GreenLight(), 5);
    }
}
