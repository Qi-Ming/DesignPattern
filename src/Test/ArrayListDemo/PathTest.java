package Test.ArrayListDemo;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("/home/cantona","abc.txt");
        System.out.println(path.getNameCount());

        //获得path方法2
        File file = new File("/home/cantona/abc.txt");
        Path path1 = file.toPath();
        System.out.println(path.compareTo(path1));

        //获得path方法3
        Path path2 = Paths.get("/home/cantona", "abc.txt");
        System.out.println(path2.toString());

        //获取path方法4
        Path path3 = Paths.get("/home/cantona");
        System.out.println(path3.resolve("abc.txt"));
    }
}
