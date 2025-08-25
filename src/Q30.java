package Assignments;

public class Q30  {
    public static void main(String[] args) {
        int n = 10; // Number of terms to print
        int first = 1, second = 1;

        System.out.print(first + " " + second); // Print the first two terms

        for (int i = 3; i <= n; i++) {
            int next = first + second; // Calculate the next term
            System.out.print(" " + next); // Print the next term
            first = second; // Update first term
            second = next;  // Update second term
        }
    }
}

