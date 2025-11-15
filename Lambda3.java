

interface MyLambda

{
public int display(String str1, String str2);
}


public class Lambda3{


public Lambda3 (String s)

{ 
    System.out.println(s.toUpperCase()); 
}



public static void main(String[] args)


{
MyLambda ml=String::compareTo;

System.out.println(ml.display("zello","well"));
}
}