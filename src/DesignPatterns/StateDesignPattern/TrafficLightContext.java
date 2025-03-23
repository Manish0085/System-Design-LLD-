package DesignPatterns.StateDesignPattern;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TrafficLightContext {

    private TrafficLightState state;
    private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

    public TrafficLightContext(){
        this.state = new RedLight();
    }

    public void start(){
        state.handleRequest(this);
    }

    public void setState(TrafficLightState state){
        this.state = state;
    }

    public void scheduleStateChange(TrafficLightState newState, int delayTime){
        scheduler.schedule(() -> {
            setState(newState);
            state.handleRequest(this);
        }, delayTime, TimeUnit.SECONDS);
    }
}
