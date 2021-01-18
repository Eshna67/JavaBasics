package com.company;
import java.io.*;
public class OutputStream {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\eshna.sharma\\Documents\\output.txt"));

            bw.write("yeahh\n");
            bw.write("did\n");
            bw.write("it");
            bw.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }


}
