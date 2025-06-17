package com.gmail.medvediev.homeworks.homework16_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5.0, calculator.calculate(new Addition(),2, 3), 0.001);
    }

    @Test
    void testSubtraction() {
        assertEquals(1.0, calculator.calculate(new Subtraction(),4, 3 ), 0.001);
    }

    @Test
    void testMultiplication() {
        assertEquals(12.0, calculator.calculate(new Multiplication(),3, 4 ), 0.001);
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculator.calculate(new Division(),10, 5 ), 0.001);
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculator.calculate(new Division(),5, 0));
        assertEquals("Division by zero", exception.getMessage());
    }
}
