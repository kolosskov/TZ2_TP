package com.example;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTest {
    public static void main(String[] args) {
        List<Long> times = new ArrayList<>();
        int repetitions = 100;

        for (int size = 100000; size <= 1000000; size += 100000) {
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                numbers.add((int)(Math.random() * 100)); // Добавление случайных чисел для разнообразия
            }

            long totalDuration = 0;
            for (int i = 0; i < repetitions; i++) {
                long startTime = System.nanoTime();
                NumberOperations.getSum(numbers);
                long endTime = System.nanoTime();
                totalDuration += (endTime - startTime);
            }

            long averageDuration = totalDuration / repetitions; // Усреднение результатов
            times.add(averageDuration);
        }

        System.out.println("Размер массива vs Время выполнения (нс)");
        for (int i = 0; i < times.size(); i++) {
            System.out.println((i + 1) * 100000 + ": " + times.get(i));
        }
    }
}
