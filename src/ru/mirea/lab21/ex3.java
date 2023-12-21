package ru.mirea.lab21;

//Реализовать метод, который возвращает любой элемент
//массива по индексу



import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запросить пользователя ввести размер массива
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        // Создать массив объектов заданного размера
        Object[] array = new Object[size];

        // Заполнить массив элементами, введенными пользователем
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент #" + (i+1) + ":");
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt(); // Ввод числа
            } else {
                array[i] = scanner.next(); // Ввод строки
            }
        }

        // Запросить пользователя ввести индекс элемента
        System.out.println("Введите индекс элемента, который хотите получить:");
        int index = scanner.nextInt();

        // Получить элемент массива по индексу
        Object element = getElementByIndex(array, (index-1));
        System.out.println("Элемент по индексу " + index + " равен " + element);
    }

    // Метод для получения элемента массива по индексу
    public static Object getElementByIndex(Object[] array, int index) {
        // Проверка, чтобы индекс был в пределах массива
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            System.out.println("Индекс выходит за пределы массива");
            return null;
        }
    }
}
