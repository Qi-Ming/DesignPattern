package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZip {
    public static void main(String[] args) throws  Exception {
        File file = new File("/home/cantona/pharos-0501-0507");
        File toFile = new File("/home/cantona/logs");
        int temp = 1;
        OutputStream outputStream = null;

        File [] files = file.listFiles();
        for(int i = 0; i<files.length; i++) {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(files[i]));
            ZipEntry entry = zipInputStream.getNextEntry();
            File outFile = new File("/home/cantona/logs" + entry.getName());
            outputStream = new FileOutputStream(outFile);

            while ((temp = zipInputStream.read()) != -1) {
                outputStream.write(temp);
            }
            zipInputStream.close();
        }
        outputStream.close();
    }
}
