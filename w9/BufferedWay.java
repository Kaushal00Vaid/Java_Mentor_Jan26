package w9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWay {
    public static void main(String[] args) {
        try {
            // read a file in a buffered way
            // BufferedReader, FileReader
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

            // write in a buffered way
            // BufferedWriter, FileWriter
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("output.txt", true));

            String writeLine = "Adding a line in a buffered way";

            bw.write(writeLine);

            bw.append(writeLine).append(" ").append("hi there");

            bw.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
