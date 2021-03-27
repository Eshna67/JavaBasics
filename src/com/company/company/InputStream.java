package company;
import java.io.*;

public class InputStream {
    public static void main(String[] args) {

//to Read a file
        File file = new File("C:\\Users\\eshna.sharma\\Documents\\Hello.txt");
//        Exception Handling here
        try {
            FileInputStream fis = new FileInputStream(file);
            //read this file input stream and print it, make use of Buffered i/p stream to print in bits
            //BufferedReader or, BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(fis);
            //It tries to read in bits buffer of words
            while(bis.available()>0) {
                System.out.println((char)bis.read());
            }
            fis.close();
            bis.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
