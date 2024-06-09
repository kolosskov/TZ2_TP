package com.example;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class NumberOperations {

    public static List<Integer> readNumbersFromFile(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        InputStream inputStream = NumberOperations.class.getClassLoader().getResourceAsStream(filePath);
        if (inputStream == null) {
            throw new FileNotFoundException("Файл не найден: " + filePath);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = reader.readLine();
        reader.close();

        if (line != null) {
            String[] parts = line.split(" ");
            for (String part : parts) {
                numbers.add(Integer.parseInt(part));
            }
        }

        return numbers;
    }

    public static int getMin(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    public static int getMax(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static BigInteger getMult(List<Integer> numbers) {
        BigInteger product = BigInteger.ONE;
        for (int number : numbers) {
            product = product.multiply(BigInteger.valueOf(number));
        }
        return product;
    }

    public static void main(String[] args) {
        try {
            List<Integer> numbers = readNumbersFromFile("numbers.txt");
            System.out.println("Минимальное: " + getMin(numbers));
            System.out.println("Максимальное: " + getMax(numbers));
            System.out.println("Сумма: " + getSum(numbers));
            System.out.println("Произведение: " + getMult(numbers));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
