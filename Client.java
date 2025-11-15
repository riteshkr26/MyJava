import java.net.*;
import java.io.*;

class Client 
{
    public static void main(String[] args) throws Exception
    {
        Socket stk=new Socket("192.168.29.60",2000);
        
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        
        do
        {
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server"+msg);
            
        }while(!msg.equals("dne"));
        stk.close();
    }    
}
