package com.example.cicd;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(2, 3);
        LOGGER.info(() -> String.format("Sum(2,3) = %d", sum));
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int s1 = calc.sumUp(numbers); 
        int s2 = calc.addAll(numbers);   
        LOGGER.info(() -> String.format("sumUp=%d, addAll=%d", s1, s2));

        LOGGER.info(() -> String.format("isPalindrome('Anna')? %b", TextUtils.isPalindrome("Anna")));
        LOGGER.info(() -> String.format("safeParseInt('42'): %d", TextUtils.safeParseInt("42")));
        LOGGER.info(() -> String.format("safeParseInt('x'): %d", TextUtils.safeParseInt("x")));


        // für Konsolen-Ausgabe
        System.out.println("666 Konsolentest 666");
    }
}
