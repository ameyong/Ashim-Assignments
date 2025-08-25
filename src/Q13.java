package Assignments;
import java.util.Scanner;


public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = input.nextInt();
        if (number < 0) {
            System.out.println("It is a negative number" + number);
        } else {
            System.out.println("rest of the code");

        }
    }
}