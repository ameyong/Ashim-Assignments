package Assignments;

import java.util.Scanner;


public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number which you want to print the table");
        int number = scanner.nextInt();
        System.out.println("\n Multiplication Table for number " + number);

        for  (int i = 1; i <= 12; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);

       }
    }
}
