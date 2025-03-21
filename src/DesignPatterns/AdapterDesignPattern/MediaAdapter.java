package DesignPatterns.AdapterDesignPattern;

public class MediaAdapter implements MediaPlayer{

    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer = new MP4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VLCPlayer();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.mp4Player(fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.vlcPlayer(fileName);
        }

    }
}
