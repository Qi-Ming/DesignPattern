package ProxyPattern;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImage(filename);
    }

    public void loadImage(String filename) {
        System.out.println("Load " + filename);
    }
    @Override
    public void display() {
        System.out.println("display: "+filename);
    }
}
