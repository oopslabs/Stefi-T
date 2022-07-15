import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
import java.io.*;
public class copy{
    public static void main(String args[]) throws Exception
    {
        
            FileWriter fw=new FileWriter("copy.txt");
            FileReader fr=new FileReader("content.txt");
            BufferedReader br=new BufferedReader(fr);
            String ch;
            while((ch=br.readLine())!=null)
            {
                fw.write(ch);
            }
      System.out.println("Content is copied");  
    
    fr.close();
    fw.close();

    }
}
