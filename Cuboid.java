import java.util.Scanner;

public class Cuboid {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        double volume,area;

        System.out.println("Enter three sides of cuboid");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        area=2*(a*b+b*c+a*c);
        volume= a*b*c;

       System.out.println("AREA "+area);
       System.out.println("Volume "+volume);
       

    }
    
}
