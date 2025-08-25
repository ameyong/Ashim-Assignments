package Assignments;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number: ");
        int num1 = sc.nextInt();

        System.out.println("Second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter an operator (+, _, *, /): ");
        char operator = sc.next().charAt(0);

        int result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '_':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                    validOperation = false;

                }
                break;

            default:
                System.out.println("Error: Invalid operation entered");
                validOperation = false;
        }
        //Display result if operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }

           sc.close();

        }

    }

