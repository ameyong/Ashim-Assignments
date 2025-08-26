public class PrimeNumbers {

    // Function to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not prime if divisible by any number other than 1 and itself
            }
        }
        return true;
    }

    // Function to print all prime numbers between start and end
    public void allPrimeBetween(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Print the prime number
            }
        }
        System.out.println(); // New line after printing all primes
    }

    // Main method to test the program
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.allPrimeBetween(10, 50); // Example: Find primes between 10 and 50
    }
}

