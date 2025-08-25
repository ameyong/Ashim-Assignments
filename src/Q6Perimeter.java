package Assignments;

import java.util.Scanner;

public class Q6Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Perimeter of the Circle
        System.out.println(" Enter the radius of the circle");
        double radius = scanner.nextDouble();
        double PerimeterCircle = 2 * Math.PI * radius;
        System.out.println(" The perimeter of the circle is:" + PerimeterCircle);

        //Perimeter of the Rectangle
        System.out.println("Enter the length of the rectangle");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle");
        double width = scanner.nextDouble();
        double PerimeterRectangle = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is:" + PerimeterRectangle);

        //Perimeter of the Triangle (a+b+c)
        System.out.println("Enter side a of the triangle");
        double a  = scanner.nextDouble();
        System.out.println("Enter side b of the triangle");
        double b = scanner.nextDouble();
        System.out.println("Enter side c of the triangle");
        double c = scanner.nextDouble();
        double PerimeterTriangle = a + b + c;
        System.out.println("The perimeter of the triangle:" + PerimeterTriangle);
    }
}
