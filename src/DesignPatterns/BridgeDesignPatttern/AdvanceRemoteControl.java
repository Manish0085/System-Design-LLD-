package DesignPatterns.BridgeDesignPatttern;

public class AdvanceRemoteControl extends RemoteControl {

    public AdvanceRemoteControl(Device device){
        super(device);
    }

    public void setVolume(int volume){
        device.setVolume(volume);
    }
}
