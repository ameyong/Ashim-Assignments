package Assignments;

    import java.util.Scanner;

    public class Q14 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter two integers
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Compare the integers and display the result
            if (num1 == num2) {
                System.out.println(num1 + " is equal to " + num2);
            } else if (num1 > num2) {
                System.out.println(num1 + " is greater than " + num2);
            } else {
                    System.out.println(num1 + " is less than " + num2);
            }
        }
    }


