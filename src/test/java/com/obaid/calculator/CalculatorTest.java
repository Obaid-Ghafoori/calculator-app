package com.obaid.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void Add(){
        Calculator calculator = new Calculator();
        double result = calculator.add(2, 3);
        assertThat(result).isEqualTo(5);
    }


    @Test
    public void Subtract(){
        Calculator calculator = new Calculator();
        double result = calculator.subtract(5, 2);
        assertThat(result).isEqualTo(3);
    }

}