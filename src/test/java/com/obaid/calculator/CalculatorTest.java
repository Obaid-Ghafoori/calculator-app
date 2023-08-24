package com.obaid.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @ParameterizedTest
    @CsvSource({"3,2,5","8,2,10"})
    public void testAddingTwoPositiveNumbersReturnsCorrectSum(double a, double b, double expectedResult){
        double result = calculator.add(a, b);
        assertThat(result).isEqualTo(expectedResult);
    }
    
    @ParameterizedTest
    @CsvSource({"3,2,1","8,2,6"})
    public void testSubtractingPositiveNumbersReturnsCorrectDifference(double a, double b, double expectedResult){
        double result = calculator.subtract(a, b);
        assertThat(result).isEqualTo(expectedResult);
    }

}