package com.company;
import java.io.*;

public class InputStream1 {
    public static void main(String[] args) {
//        read a file
        try{
            BufferedReader yeah=new BufferedReader(
                    new FileReader("C:\\Users\\eshna.sharma\\Documents\\Hello.txt"));

           String s;
           while ((s=yeah.readLine()) !=null){
               System.out.println(s);
           }
           yeah.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
