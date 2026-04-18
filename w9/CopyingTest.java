package w9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyingTest {
    public static void main(String[] args) {
        // read a file

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            // 1. read the content line by line
            // 2. write to the new file

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
