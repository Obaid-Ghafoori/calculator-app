package com.obaid.calculator;

public class CalculatorManager {
    Calculator calculator = new Calculator();
    UserInterface ui = new UserInterface();

    public void runCalculator() {
        char choice;
        do {
            double num1 = ui.getValidInput("\t\tEnter the first number: ");
            double num2 = ui.getValidInput("\t\tEnter the second number: ");
            char operation = ui.getValidOperation();

            double result;
            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    result = 0;
            }

            ui.displayResult(result);

            choice = ui.getContinueChoice();
        } while (choice == 'y' || choice == 'Y');
        System.out.println("\u001B[31m|------>> End Of Calculator App. <<-------|");

    }

}