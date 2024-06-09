package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.math.BigInteger;
import java.util.ArrayList;

public class NumberOperationsTest {

    @Test
    public void testMin() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(1, NumberOperations.getMin(numbers));
    }

    @Test
    public void testMax() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(4, NumberOperations.getMax(numbers));
    }

    @Test
    public void testSum() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(10, NumberOperations.getSum(numbers));
    }

    @Test
    public void testMult() {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 3);
        assertEquals(BigInteger.valueOf(24), NumberOperations.getMult(numbers));
    }

    @Test
    public void testPerformance() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(1); // Все единицы для простоты
        }
        long startTime = System.currentTimeMillis();
        NumberOperations.getSum(numbers);
        long endTime = System.currentTimeMillis();
        assertTrue((endTime - startTime) < 1000, "Сложение должно выполняться менее чем за 1 секунду");

        startTime = System.currentTimeMillis();
        NumberOperations.getMult(numbers);
        endTime = System.currentTimeMillis();
        assertTrue((endTime - startTime) < 1000, "Умножение должно выполняться менее чем за 1 секунду");
    }
}
