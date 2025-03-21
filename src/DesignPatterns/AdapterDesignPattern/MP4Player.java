package DesignPatterns.AdapterDesignPattern;

public class MP4Player implements AdvanceMediaPlayer{


    @Override
    public void mp4Player(String fileName) {
        System.out.println("Playing Mp4 File "+fileName);
    }

    @Override
    public void vlcPlayer(String fileName) {

    }
}
