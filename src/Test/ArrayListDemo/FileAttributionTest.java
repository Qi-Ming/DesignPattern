package Test.ArrayListDemo;

import java.io.File;
import java.io.IOException;

public class FileAttributionTest {
    public static void main(String[] args) {
        File file = new File("/home/cantona/temp");
        if(!file.exists()) {
            file.mkdirs();
        }
        System.out.println("Is a directory?"+file.isDirectory());
        File file1 = new File("/home/cantona/temp/abc.txt");
        if(!file1.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.isFile());
        System.out.println(file1.length());

        File [] files = file.listFiles();
        for(File file2 : files)
            System.out.println(file2.getParent());
        file1.delete();
    }
}
