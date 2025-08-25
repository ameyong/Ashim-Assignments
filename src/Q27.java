package Assignments;


    public class Q27 {
        public static void main(String[] args) {
            int number = 456; // Example number
            int sum = 0;
            int product = 1;

            while (number > 0) {
                int digit = number % 10; // Extract the last digit
                sum += digit;           // Add the digit to the sum
                product *= digit;       // Multiply the digit to the product
                number /= 10;           // Remove the last digit
            }

            System.out.println("Sum of digits: " + sum);
            System.out.println("Product of digits: " + product);
        }
    }


