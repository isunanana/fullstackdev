package com.example.getmehired;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        // Create scanner class object
        Scanner in = new Scanner(System.in);


        // Input two numbers from user
        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();

        // Input Arithmetic Operation from user
        System.out.println("Enter the Arithmetic Operation + - * /");
        char op = in.next().charAt(0);


        // Perform arithmetic operations using switchcase

        switch (op) {

            case '+':
                int sum = num1 + num2;
                System.out.println("Sum : "         + sum);
                break;
            case '-':
                int difference = num1 - num2;
                System.out.println("Difference : "  + difference);
                break;
            case '*':
                int product = num1 * num2;
                System.out.println("Product : "     + product);
                break;
            case '/':
                int quotient = num1 / num2;
                System.out.println("Quotient : "    + quotient);
                break;
        }

    }
}
