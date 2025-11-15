
import java.io.*;

public class SCInpoutput1 
{
    public static void main(String[] args) throws Exception
    {
        
       /* FileInputStream fis=new FileInputStream("Source1.txt");
        FileOutputStream fos=new FileOutputStream("Source2.txt");*/
        FileInputStream fis1=new FileInputStream("Source1.txt");
        FileInputStream fis2=new FileInputStream("Source2.txt");
        
       FileOutputStream fos=new FileOutputStream("Destination.txt");
                
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        
        /*changing one txt file in lowercase to another txt file.

        int b;
        while((b=fis.read())!=-1)
        {
            if(b>=65 && b<=90)fos.write(b+32);
            else fos.write(b);
        }*/
        int b;
        while((b=sis.read())!=-1)
        {
            
            fos.write(b);
        }
        //fis.close();;
        sis.close();
        fis1.close();
        fis2.close();
        //fos.close();
        
    }   
}