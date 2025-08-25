package Assignments;

import java.util.Scanner;

public class Q4SimpleInterest {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the principle amount (P):");
        float principle = inputScanner.nextFloat();
        System.out.println("Enter the time in years (T):");
        float time = inputScanner.nextFloat();
        System.out.println("Enter the annual interest rate (R):");
        float rate = inputScanner.nextFloat();
        float SimpleInterest = (principle*time*rate) / 100;
        System.out.println("Simple Interest = " + SimpleInterest);





    }
}
