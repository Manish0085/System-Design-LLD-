package DesignPatterns.AdapterDesignPattern;

public class Test {

    public static void main(String[] args) {
        MediaPlayer player = new AudioPlayer();

        player.play("mp3", "song.mp3");
        player.play("mp4", "movie.mp4");
        player.play("vlc", "video.vlc");
        player.play("avi", "documentary.avi");
    }
}
