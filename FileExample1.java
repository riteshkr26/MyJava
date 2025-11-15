
import java.io.*;

public class FileExample1 {

    public static void main(String[] args) throws Exception
    {
        
        try(FileInputStream fis=new FileInputStream("C:/MyJava/Test.txt");)
        {
            int x;
        
        do { 
            x=fis.read();
            if(x!=-1)
            System.out.print((char)x);
        } while (x!=1);
        
        /*
        //fos.write(str.getBytes());
        for(byte x:b)
            fos.write(x);*/
        //fos.write(b, 6, str.length()-6);
        
       // fis.read(b);
        
        //fos.close();
        
        }
        /*catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }*/
    }
    
}