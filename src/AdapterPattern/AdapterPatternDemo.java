package AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "人生如梦.mp3");
        audioPlayer.play("vlc", "天天.vlc");
        audioPlayer.play("mp4", "下次再见.mp4");
        audioPlayer.play("avi", "asc.avi");
    }
}
