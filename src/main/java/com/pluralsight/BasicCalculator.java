package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        // Exercise 4: Basic Calculator
        // multiplication only for now
        // Declare and initialize Scanner
        Scanner scanner = new Scanner(System.in); // Create the scanner for inputs

        // Display menu
        System.out.println("Possible calculations:");
        System.out.println("   (A)dd");
        System.out.println("   (S)ubtract");
        System.out.println("   (M)ultiply");
        System.out.println("   (D)ivide");
        System.out.println("Please select an option: ");  // M is the only option right now

        // Read menu choice
        String menuSelection = scanner.nextLine();

        // Declare and initialize variables
        System.out.print("Enter your first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int secondNumber = scanner.nextInt();

        int productTotal = 0;

        // Calculation
        productTotal = firstNumber * secondNumber;

        // Display results


    }
}
