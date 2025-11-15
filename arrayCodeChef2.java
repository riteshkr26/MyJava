import java.util.Scanner;

class arrayCodechef2
{
	
  /** 
   * @param args
   */
  public static void main (String[] args) 
	{
		// your code goes here
      Scanner scanner = new Scanner(System.in);
      int N = scanner.nextInt();
      int[] arr = new int[N];
      for (int i = 0; i <N; i++){
        arr[i]= scanner.nextInt();
      }
      int x = scanner.nextInt();
      int newsize = 0 ;
       for (int i =0; i <N; i++){
         if (arr[i]!=x){
           arr[newsize]= arr[i];
           newsize++;
         }
  
     }
     for (int i =0; i< newsize; i++){
       System.out.println(arr[i] + " ");
     }
	}
	
	
}
