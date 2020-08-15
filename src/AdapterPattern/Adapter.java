package AdapterPattern;

public class Adapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public Adapter(String type) {
        if (type.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }


    @Override
    public void play(String type, String filename) {
        if (type.equalsIgnoreCase("vlc")) {
           advancedMediaPlayer.playVlc(filename);
        } else if(type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(filename);
        } else {
            System.out.println("invalid input");
        }
    }
}
