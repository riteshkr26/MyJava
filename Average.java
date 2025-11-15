import java.util.*;
public class Average {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3;

        System.out.println("Enter three marks : ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        float avg = (float) (m1+m2+m3)/3; 
        
        if (avg>=80){
            System.out.println("Excellent");
        }
        else if (avg>=70&& avg<80) {
            System.out.println("Good");

        }
        else if (avg>=60 && avg<70){
            System.out.println("Average");

        }
        else {
            System.out.println("Poor Performance");
        }
    
    }
    
}
