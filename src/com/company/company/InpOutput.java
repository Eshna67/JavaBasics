package company;
import java.io.*;
public class InpOutput {
    public static void main(String[] args) {
        try
        {
        BufferedWriter check=new BufferedWriter(
       new FileWriter("C:\\Users\\eshna.sharma\\Documents\\output-copy.txt")  );
        BufferedReader now=new BufferedReader(
                new FileReader("C:\\Users\\eshna.sharma\\Documents\\output.txt"));
        String s;
        while((s=now.readLine()) !=null){
            check.write(s+"\n");
        }
        now.close();
        check.close();
      } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
