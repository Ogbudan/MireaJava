package ru.mirea.lab2;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"Hello", "World", "Java", "Programming"};

        System.out.println("Исходный массив:");
        printArray(array);

        reverseArray(array);

        System.out.println("Массив после обращения:");
        printArray(array);
    }

    private static void reverseArray(String[] array) {
        int length = array.length;
        int mid = length / 2;

        for (int i = 0; i < mid; i++) {
            String temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }

    private static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
