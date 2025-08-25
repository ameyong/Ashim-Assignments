package Assignments;

public class Q28A {

        // Method to check if a number is prime
        public static boolean isPrimeNumber(int number) {
            if (number <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false; // If divisible by any number other than 1 and itself
                }
            }
            return true; // Number is prime
        }

        // Main method to test the isPrimeNumber function
        public static void main(String[] args) {
            int testNumber = 29; // Example number to test
            if (isPrimeNumber(testNumber)) {
                System.out.println(testNumber + " is a prime number.");
            } else {
                System.out.println(testNumber + " is not a prime number.");
            }
        }
    }


