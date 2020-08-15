package Test;

import java.io.*;

public class TxtDemo {
    public static void main(String[] args) {
        writeFile1();
        writeFile2();
        readFile();
    }

    private static void writeFile1() {
        try {
            FileOutputStream fos = new FileOutputStream("/home/cantona/abc.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("hello");
            bw.newLine();
            bw.write("zx");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile2() {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/cantona/abc.txt", true)));
            bw.write("\nhello");
            bw.newLine();
            bw.write("qm");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        String line = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/cantona/abc.txt")));
            line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
