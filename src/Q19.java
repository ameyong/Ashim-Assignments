package Assignments;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input sides of the triangle
        System.out.println("Enter side A:");
        double a = sc.nextDouble();
        System.out.println("Enter side B:");
        double b = sc.nextDouble();
        System.out.println("Enter side C");
        double c = sc.nextDouble();

        //Check if the sides can form a triangle
        if (a + b > c && a + c > b && b + c > a) {
            //Determine the type of triangle
            if (a == b && b == c) {
                System.out.println("An equilateral triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("An Isolated triangle");
            } else {
                System.out.println("A Scalene triangle");
            }
        } else {
            System.out.println("The given sides do not form a triangle");


            }

        }

    }

