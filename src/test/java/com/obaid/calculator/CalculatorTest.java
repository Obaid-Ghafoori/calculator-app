package com.obaid.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void Add(){
        double result = calculator.add(2, 3);
        assertThat(result).isEqualTo(5);
    }


    @Test
    public void Subtract(){
        double result = calculator.subtract(5, 2);
        assertThat(result).isEqualTo(3);
    }

}