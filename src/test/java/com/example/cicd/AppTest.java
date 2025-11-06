package com.example.cicd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testMainRunsWithoutError() {
        // Führt main() aus, um Coverage zu erzeugen
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void testCalculatorIntegration() {
        Calculator calc = new Calculator();
        int sum = calc.add(2, 3);
        assertEquals(5, sum);
    }

    @Test
    void testTextUtilsIntegration() {
        assertTrue(TextUtils.isPalindrome("Anna"));
        assertEquals(42, TextUtils.safeParseInt("42"));
        assertEquals(0, TextUtils.safeParseInt("x"));
    }
}