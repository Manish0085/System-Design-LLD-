package DesignPatterns.StateDesignPattern;

public class YellowLight implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("🚦 Yellow Light - Slow Down!");
        context.scheduleStateChange(new RedLight(), 5);
    }
}
