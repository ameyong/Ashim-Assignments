package Assignments;


    import java.util.Scanner;

    public class Q15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for an ASCII code
            System.out.print("Enter an ASCII code (0 - 127): ");
            int asciiCode = scanner.nextInt();

            // Validate the input
            if (asciiCode >= 0 && asciiCode <= 127) {
                // Convert ASCII code to character
                char character = (char) asciiCode;
                System.out.println("The character for ASCII code " + asciiCode + " is: " + character);
            } else {
                System.out.println("Invalid input! Please enter a number between 0 and 127.");
            }

            scanner.close();
        }
    }


