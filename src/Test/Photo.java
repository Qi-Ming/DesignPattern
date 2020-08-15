package Test;

public class Photo {
    private static int price = 5;
    private String content = "";

    public Photo(int price, String content) {
        this.price = price;
        this.content = content;
    }

    public static void main(String[] args) {
        System.out.println(Photo.price);
        System.out.println("-------------------------------");

        Photo photo = new Photo(20, "14寸");
        System.out.println(photo.price);
        System.out.println(Photo.price);
        System.out.println("--------------------------------");

        Photo photo1 = new Photo(25, "20寸");
        System.out.println(photo1.price);
        System.out.println(photo.price);
        System.out.println(Photo.price);
    }
}
