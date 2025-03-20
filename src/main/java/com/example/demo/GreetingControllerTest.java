package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GreetingControllerTest {

    @Mock
    private GreetingService greetingService;

    @Mock
    private FarewellService farewellService;

    @InjectMocks
    private GreetingController greetingController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGreet() {
        when(greetingService.getGreeting()).thenReturn("Hello, Spring Boot!");
        assertEquals("Hello, Spring Boot!", greetingController.greet());
    }

    @Test
    void testFarewell() {
        when(farewellService.getFarewell()).thenReturn("Goodbye, Spring Boot!");
        assertEquals("Goodbye, Spring Boot!", greetingController.farewell());
    }
}
