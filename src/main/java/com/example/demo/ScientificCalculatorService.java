package com.example.demo;

import com.example.demo.CalculatorService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ScientificCalculatorService implements CalculatorService {
    @Override
    public int add(int a, int b) {
        return a + b + 1; // Just to differentiate from simple calculator
    }

    @Override
    public int subtract(int a, int b) {
        return a - b - 1;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b * 2;
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b + 0.1;
    }
}
