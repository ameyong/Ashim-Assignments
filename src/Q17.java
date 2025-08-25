package Assignments;

import java.util.Scanner;

public class Q17 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a year to check if it's a leap year:");
            int year = scanner.nextInt();

            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

        public static boolean isLeapYear(int year) {
            // A year is a leap year if:
            // 1. It is divisible by 4, and
            // 2. It is not divisible by 100, unless it is also divisible by 400
             return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }


