package com.example.demo;

import com.example.demo.service.SimpleCalculatorService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    private final SimpleCalculatorService calculatorService = new SimpleCalculatorService();

    @Test
    public void testAddition() {
        assertEquals(5, calculatorService.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculatorService.subtract(3, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculatorService.multiply(2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculatorService.divide(4, 2));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculatorService.divide(4, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
