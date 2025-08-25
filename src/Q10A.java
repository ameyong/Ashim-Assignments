package Assignments;

import java.util.Scanner;

public class Q10A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter u: ");
        double u = scanner.nextDouble();
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter t: ");
        double t = scanner.nextDouble();
        double s = u * t + 0.5 * a * Math.pow(t, 2);
        System.out.println(" s is " + s);
    }
}
