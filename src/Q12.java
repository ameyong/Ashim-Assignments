package Assignments;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println("Enter the age");
        int age = sc.nextInt();
        sc.nextLine(); // consume the newline character after reading the integer.

        System.out.println("Enter nationality");
        String nationality = sc.nextLine();

        System.out.println("\n----Person Details-----");
        System.out.println("Name: " + name);
        System.out.println("Age: "  + age);
        System.out.println("Nationality: " + nationality);

        sc.close();// close the scanner to release system source.



    }
}
