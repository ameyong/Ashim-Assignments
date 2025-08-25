package Assignments;

import java.util.Scanner;


public class Q8BCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp in Celsius");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " degrees celsius is equals to " + fahrenheit + " degrees fahrenheit");

    }

}
