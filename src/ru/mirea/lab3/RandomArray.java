package ru.mirea.lab3;

import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(Math.random() * 100.0) / 100.0;
        }

        System.out.println("Массив до сортировки (метод random() класса Math): ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Массив после сортировки (метод random() класса Math): ");
        System.out.println(Arrays.toString(numbers));


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(Math.random() * 100.0) / 100.0;
        }

        System.out.println("Массив до сортировки (класс Random): ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Массив после сортировки (класс Random): ");

    }
}
