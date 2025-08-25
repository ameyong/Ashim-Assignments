package Assignments;

public class Q11Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("Before swapping (using temp");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = a;
        a=b;
        b = temp;

        System.out.println("After swapping (using temp)");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int x=5;
        int y=10;
        System.out.println("Before swapping (without temp)");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //swapping logic
        x=x+y; // 5 + 10 = 15
        y=x-y; //15 -5 = 10
        x=x-y; //15-10 = 5
        System.out.println("After swapping (without temp)");
        System.out.println("x = " + x);
        System.out.println("y = " + y);




        }
    }


