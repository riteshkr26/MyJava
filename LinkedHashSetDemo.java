

import java.util.*;

public class LinkedHashSetDemo 
{
    public static void main(String[] args) 
    {
        HashSet<String> lhs=new HashSet<>(10);//it is automatically sorted but linkedhashset is not sorted we can slo use this instead of replacing hash set.
        
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        lhs.add("B");
        
        Iterator<String> itr=lhs.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        Hashtable ht=new Hashtable(10);
        
    }   
}