package Assignments;


import java.util.Scanner;

public class Q3SumAndAverage {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int x = inputScanner.nextInt();
        System.out.println("Please enter the second number");
        int y = inputScanner.nextInt();
        int sum = x + y;
        int avg = sum / 2;
        System.out.println("The sum of " + x + " and " + y + " is: " + sum);
        System.out.println("The avg is: " + avg);



    }
}
