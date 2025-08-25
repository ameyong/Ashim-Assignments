package Assignments;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        String highestScoreStudentName = "";
        double highestScore = -1.0;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter name of student " + (i + 1) + ": ");
            String name = input.next();

            System.out.println("Enter score of student " + (i +1) + ": ");
            double score = input.nextDouble();

            if (score > highestScore) {
                highestScore = score;
                highestScoreStudentName = name;
            }
        }
        System.out.println("\nStudent with the highest score: " + highestScoreStudentName + " with a score of " + highestScore);

        }
    }

