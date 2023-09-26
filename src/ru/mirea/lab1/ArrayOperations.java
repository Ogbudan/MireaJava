package ru.mirea.lab1;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = array[0];
        int min = array[0];
        int i = 0;

        // Считаем сумму элементов с помощью цикла do-while
        do {
            sum += array[i];
            i++;
        } while (i < size);

        i = 0;

        // Находим максимальный элемент с помощью цикла while
        while (i < size) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }

        i = 0;

        // Находим минимальный элемент с помощью цикла while
        while (i < size) {
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
