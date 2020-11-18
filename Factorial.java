package com.example.getmehired;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact =1;

        // Create scanner class object
        Scanner in = new Scanner(System.in);


        // Input a number from user to calculate factorial
        System.out.println("Enter number :");
        int num = in.nextInt();


        if (num < 0)
            System.out.println("Number should be non-negative.");
        else {
            for (int i = 1; i <= num; i++)
                fact = fact * i;

            System.out.println("Factorial of " + num + " is = " + fact);
        }

    }
}
