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
}
