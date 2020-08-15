package AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String type, String filename) {
        if (type.equalsIgnoreCase("mp3")) {
            System.out.println("play mp3 : " + filename);
        } else if (type.equalsIgnoreCase("vlc") || type.equalsIgnoreCase("mp4")) {
            Adapter adapter = new Adapter(type);
            adapter.play(type, filename);
        } else {
            System.out.println("无效输入");
        }
    }
}
