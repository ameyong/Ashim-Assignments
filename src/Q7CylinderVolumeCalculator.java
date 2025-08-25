package Assignments;

import java.util.Scanner;

public class Q7CylinderVolumeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the radius of the cylinder");
        double radius = input.nextDouble();

        System.out.println("Enter the length (height) of the cylinder");
        double length = input.nextDouble();

        double vloumeCylinder = Math.PI * Math.pow(radius, 2) * length;
        System.out.println("The volume of the cylinder is:" + vloumeCylinder);


    }
}
