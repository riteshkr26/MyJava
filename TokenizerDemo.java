import java.util.*;
import java.io.*;

public class TokenizerDemo {

    public static void main(String[] args) throws Exception
    {
        // File path must be valid
        FileInputStream fi=new FileInputStream("C:\\MyJava\\MyLaptop.txt");
        byte b[]=new byte[fi.available()];
        fi.read(b);
        
        String data=new String(b);

        //String data="name=Vijay address=delhi country=india dept=cse";
    
        
        StringTokenizer stk=new StringTokenizer(data,"=");
        
        String s;
      //  ArrayList<Integer> al=new ArrayList<>();
        
        while(stk.hasMoreTokens())
        {
            s=stk.nextToken();
            System.out.println(s);
           // al.add(Integer.valueOf(s));
            
        }
        
       // System.out.println(al);

    }
    
}