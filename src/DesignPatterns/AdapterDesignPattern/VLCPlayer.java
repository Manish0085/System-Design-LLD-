package DesignPatterns.AdapterDesignPattern;

public class VLCPlayer implements AdvanceMediaPlayer{


    @Override
    public void mp4Player(String fileName) {

    }

    @Override
    public void vlcPlayer(String fileName) {
        System.out.println("Playing VLC file "+fileName);
    }
}
