import java.util.Scanner;

public class ScCondition {
    
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        if (age >=14 && age <=55) {
            System.out.println("You are Young.");

        }
        else{
            System.out.println("You are not Young.");
        }
    }
}
