package Assignments;

public class Q28B {

    public static void main(String[] args) {
        int n = 10; // Example: Change this value to get the first 'n' primes
        firstNthPrime(n);
    }

    public static void firstNthPrime(int n) {
        int count = 0, num = 2; // Start checking from 2
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

