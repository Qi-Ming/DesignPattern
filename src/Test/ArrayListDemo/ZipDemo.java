package Test.ArrayListDemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipDemo {
    public static void main(String[] args) throws Exception {
        //zipSingle();
        //multipleFileZip();
        unzipSingle();

    }

    private static void zipSingle() throws Exception {
        File file = new File("/home/cantona/abc.txt");
        File zipFile = new File("/home/cantona/abc.zip");

        InputStream is = new FileInputStream(file);
        ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(zipFile));
        zout.putNextEntry(new ZipEntry(file.getName()));
        zout.setComment("single zip");
        int temp = 0;
        while ((temp = is.read())!= -1) {
            zout.write(temp);
        }
        is.close();
        zout.close();
    }

    private static void multipleFileZip() throws Exception {
        File file = new File("/home/cantona/temp");
        File zipFile = new File("/home/cantona/temp.zip");
        ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        int temp = 0;

        if (file.isDirectory()) {
            File [] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                InputStream inputStream = new FileInputStream(files[i]);
                zipOut.putNextEntry(new ZipEntry(file.getName()+File.separator+files[i].getName()));
                while ((temp = inputStream.read()) != -1) {
                    zipOut.write(temp);
                }
                inputStream.close();
            }
        }
        zipOut.close();
    }

    private static void unzipSingle() throws  Exception {
        File zipFile = new File("/home/cantona/abc.zip");
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
        ZipEntry entry = zipInputStream.getNextEntry();
        File outfile = new File("/home/cantona/"+entry.getName());
        OutputStream out = new FileOutputStream(outfile);
        int temp = 0;

        while ((temp = zipInputStream.read()) != -1) {
            out.write(temp);
        }
        zipInputStream.close();
        out.close();
    }
}
