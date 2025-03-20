package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {
    private final List<String> history = new ArrayList<>();

    public void log(String operation, int a, int b, String result) {
        history.add(operation + "(" + a + ", " + b + ") = " + result);
    }

    public List<String> getHistory() {
        return history;
    }
}
