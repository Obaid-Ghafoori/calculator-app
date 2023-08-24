package com.obaid.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }


    @ParameterizedTest
    @CsvSource({"3,2,5", "8,2,10", "1,0,1", "1 ,-2, -1", "-1,-1,-2"})
    public void testAddingTwoNumbersReturnsCorrectSum(double a, double b, double expectedResult) {
        double result = calculator.add(a, b);
        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({"3,2,1", "8,2,6", "-1,-1,0", "1,-4,5", "-1,2,-3"})
    public void testSubtractingNumbersReturnsCorrectDifference(double a, double b, double expectedResult) {
        double result = calculator.subtract(a, b);
        assertThat(result).isEqualTo(expectedResult);
    }


    @ParameterizedTest
    @CsvSource({"2, 3, 6", "5, 2, 10", "-2, 2, -4", "0, 0, 0", "2,0,0"})
    public void testMultiplicationReturnsCorrectResult(double a, double b, double expectedSum) {
        double result = calculator.multiply(a, b);
        assertThat(result).isEqualTo(expectedSum);
    }

}