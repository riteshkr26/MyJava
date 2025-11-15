
import java.io.*;

class Customer implements Serializable
{
    String custID;
    String name;
    String phno;

    static int count=1;

    Customer()
    {

    }
  
    Customer(String n, String p)
    {
        custID="C"+count;
        count++;
        name=n;
        phno=p;

    }

    public String toString()
    {
        return "Customer ID:"+custID+"\nName :"+name+"\nPhno:"+phno+"\n";
    }
    
}



public class SCInputOut3 {
   
    public static void main(String[] args) throws Exception
     {
        /*Customer list[]={new Customer("Ritesh","7991138845"),new Customer("Ashutosh","9508263099"),new Customer("Vicky","7991138899")};
        FileOutputStream fos=new FileOutputStream("Customer.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        oos.writeInt(list.length);
        for(Customer c:list)
            oos.writeObject(c);
        
        
        oos.close();
        fos.close();
        */
        java.util.Scanner sc =new java.util.Scanner(System.in);

        FileInputStream fis=new FileInputStream("Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length=ois.readInt();
        Customer list[]=new Customer[length];
        for(int i =0;i<length;i++)
        {
            list[i]=(Customer)ois.readObject();
        }
        System.out.println("Enter name of customer:");
        String name=sc.nextLine();

        for(int i=0;i<length;i++)
        {
            if(name.equalsIgnoreCase(list[i].name))
            System.out.println(list[i]);
        }
        ois.close();
        fis.close();
    }
}
