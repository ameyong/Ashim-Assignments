package Assignments;

import java.util.Scanner;

public class Q5AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Calculate Area of Circle (PI*R^2)
        System.out.println("Enter the radius of the circle");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println(" Area of the circle is:" + circleArea);

        //Calculate Area of Rectangle (Length * Width)
        System.out.println("Enter the length of the rectangle");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle");
        double width = scanner.nextDouble();
        double RectangleArea = length * width;
        System.out.println("Area of the rectangle is:" + RectangleArea);

        //Calculate the Area of Triangle
        System.out.println("Enter the base of the Triangle");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the Triangle");
        double height = scanner.nextDouble();
        double TriangleArea = 0.5 * base * height;
        System.out.println("The area of square is:" + TriangleArea);





    }

}
