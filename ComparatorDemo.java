
import java.util.*;

class My implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}

public class ComparatorDemo 
{
    public static void main(String[] args) 
    {
        Integer a[]={2,4,6,8,1,3,5,7};
        //int a[]={2,4,6,8,1,3,5,7};
// int c[]= Arrays.copyOf(a,a.length);
      // Arrays.fill(c, 10);
       // Arrays.sort(a);
       // Arrays.sort(c);
       Arrays.sort(a, new My());
       for(Integer x:a) 
            System.out.println(x);

            //for(int x:c) 
           // System.out.println(x);


    }   
}