package com.obaid.calculator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Calculator {
    public double add(double valueA, double valueB) {
        return valueA + valueB;
    }

    public double subtract(double valueA, double valueB) {
        return valueA - valueB;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return dividend / divisor;
    }
}
