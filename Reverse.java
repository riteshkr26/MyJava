import java.util.Scanner;

public class Reverse {

    
    /** 
     * @param args
     */
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A NUMBER :");
        int n = sc.nextInt();
         int m=n;
        int rev= 0, r ;

        while(n>0){
        
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }

//System.out.println("REVERSE NUMBER IS:"+ rev);
        
  if(rev==m){
    System.out.println("PALINDROME NUMBER. ");
    
  }
  else{
    System.out.println("NOT A PALINDROME NUMBER.");
  }
    }
    
}
