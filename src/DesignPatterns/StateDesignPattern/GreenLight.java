package DesignPatterns.StateDesignPattern;

public class GreenLight implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("🚦 Green Light - Go!");
        context.scheduleStateChange(new YellowLight(), 5);
    }
}
