package ru.mirea.lab2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Количество слов: " + wordCount);
    }

    private static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+");
        return words.length;
    }
}
