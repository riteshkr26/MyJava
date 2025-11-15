import java.io.*;
import java.util.*;

public class PropertyDemo 
{
    public static void main(String[] args) throws Exception
    {
        Properties p=new Properties();
        
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");
        
        
       // p.store(new FileOutputStream("C:/MyJava/MyLaptop.txt"),"Laptop 1");
       // p.storeToXML(new FileOutputStream("C:/MyJava/MyLaptop.xml"),"Laptop 1");
        
        p.load(new FileInputStream("MyLaptop.txt"));
        
        System.out.println(p);
        System.out.println(p.getProperty("OS"));
               
    }  
}