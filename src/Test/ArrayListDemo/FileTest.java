package Test.ArrayListDemo;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        //moveFile();
        createDirectory();

    }
    public static void moveFile(){
        Path path = Paths.get("/home/cantona/temp","abc.txt");
        Path path1 = path.getParent().resolve("test/def.txt");
        try {
            Files.move(path, path1, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createDirectory(){
        Path path = Paths.get("/home/cantona/temp/test1");
        try {
            Files.createDirectory(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path path1 = path.resolve("a.java");
        Path path2 = path.resolve("b.java");
        Path path3 = path.resolve("c.txt");
        Path path4 = path.resolve("d.jpg");
        try {
            Files.createFile(path1);
            Files.createFile(path2);
            Files.createFile(path3);
            Files.createFile(path4);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DirectoryStream<Path> paths = Files.newDirectoryStream(path);
            for (Path path5 :paths)
                System.out.println(path5.getFileName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        DirectoryStream<Path> paths = null;
        try {
            paths = Files.newDirectoryStream(path, "*.{java,txt}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Path path5: paths) {
            System.out.println(path5.getFileName());
        }
    }

}
