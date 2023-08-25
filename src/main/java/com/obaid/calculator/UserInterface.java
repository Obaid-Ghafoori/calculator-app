package com.obaid.calculator;

import java.util.Scanner;

/**
 * Command line user Interface that allows a user to interact with the system!
 */
public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);

    public static double getValidInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\u001B[31mInvalid input. Please enter a valid number.");
            }
        }
    }

    public static char getValidOperation() {
        while (true) {
            System.out.println();
            System.out.print("\t\u001B[38;5;208mSelect operation (+, -, *, /): ");
            char operation = scanner.nextLine().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                return operation;
            } else {
                System.out.println("\u001B[31mInvalid operation. Please select +, -, *, or /.");
            }
        }
    }

    public static char getContinueChoice() {
        System.out.print("\u001B[32m------> Do you want to continue? (y/n): ");
        return scanner.nextLine().charAt(0);
    }

    public static void displayResult(double result) {
        System.out.println();
        System.out.println("\t\t\u001B[0m+++++++++++++++++++++++++");
        System.out.println("\t\t\t\tResult: " + result);
        System.out.println("\t\t+++++++++++++++++++++++++");
    }
}

