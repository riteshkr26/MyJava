public class PrimeCheck {

    
    /** 
     * @param number
     * @return boolean
     */
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Numbers less than 2 are not prime
        if (number < 2) {
            return false;
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        // If no factors are found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        // Test the isPrime method with different numbers
        int[] testNumbers = {1, 2, 3, 4, 5, 16, 17, 18, 19, 20};

        for (int num : testNumbers) {
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}
