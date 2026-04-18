package w9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamsTest {
    public static void main(String[] args) {
        // i have a input.txt

        try {

            // reading from a file
            FileInputStream fis = new FileInputStream("input.txt");

            int data;

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }

            fis.close();

            // write to a file
            FileOutputStream fos = new FileOutputStream("output.txt", true);

            String text = "Hello world, this is written from java";

            fos.write(text.getBytes());

            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}