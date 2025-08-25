package Assignments;

import java.util.Scanner;

public class Q8AFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        //Formula to convert Fahrenheit to Celsius: C = (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println(fahrenheit + " degrees Fahrenheit is equal to" + celsius + " degrees Celsius");

    }

}
