package com.example.demo;

import com.example.demo.service.CalculatorService;
import com.example.demo.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;
    private final HistoryService historyService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService, HistoryService historyService) {
        this.calculatorService = calculatorService;
        this.historyService = historyService;
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.add(a, b);
        historyService.log("add", a, b, String.valueOf(result));
        return result;
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.subtract(a, b);
        historyService.log("subtract", a, b, String.valueOf(result));
        return result;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        int result = calculatorService.multiply(a, b);
        historyService.log("multiply", a, b, String.valueOf(result));
        return result;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int a, @RequestParam int b) {
        double result = calculatorService.divide(a, b);
        historyService.log("divide", a, b, String.valueOf(result));
        return result;
    }

    @GetMapping("/history")
    public List<String> getHistory() {
        return historyService.getHistory();
    }
}
