package ru.mirea.lab1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Введено неверное число. Число должно быть больше или равно 0.");
        } else {
            long factorial = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен: " + factorial);
        }
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
