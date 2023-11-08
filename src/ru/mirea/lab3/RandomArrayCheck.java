package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

public class RandomArrayCheck {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(90) + 10;
        }

        System.out.println("Массив случайных чисел: " + Arrays.toString(numbers));

        boolean isIncreasing = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
