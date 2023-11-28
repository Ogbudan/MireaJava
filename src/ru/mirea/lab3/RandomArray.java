package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Random;

//Создать массив вещественных чисел случайным образом, вывести его
//на экран, отсортировать его, и снова вывести на экран (использовать два подхода
//к генерации случайных чисел – метод random() класса Math и класс Random)
public class RandomArray {
    public static void main(String[] args) {
        double[] numbers = new double[10];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(Math.random() * 100.0) / 100.0;
        }

        System.out.println("Массив до сортировки (метод random() класса Math): ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers); // Сортировка массива

        System.out.println("Массив после сортировки (метод random() класса Math): ");
        System.out.println(Arrays.toString(numbers));


        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble() * 100;
            numbers[i] = Math.round(numbers[i] * 100.0) / 100.0;

        }

        System.out.println("Массив до сортировки (класс Random): ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Массив после сортировки (класс Random): ");
        System.out.println(Arrays.toString(numbers));
    }
}
