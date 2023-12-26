package ru.mirea.lab19;

//Клиент совершает покупку онлайн. При оформлении заказа у
//пользователя запрашивается фио и номер ИНН. В программе проверяется,
//действителен ли номер ИНН для такого клиента. Исключение будет выдано
//в том случае, если введен недействительный ИНН



import java.util.Scanner;

public class INNchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше ФИО: ");
        String fullName = scanner.nextLine();
        if (!fullName.matches("[a-zA-Zа-яА-Я ]+")) {
            System.out.println("Ошибка: Фамилия должна содержать только буквы.");
            return;
        }

        System.out.println("Введите ваш номер ИНН: ");
        String inn = scanner.nextLine();
        if (!inn.matches("\\d+")) {
            System.out.println("Ошибка: ИНН должен содержать только цифры.");
            return;
        }

        try {
            if (isValidInn(inn)) {
                System.out.println("ИНН действителен. Заказ оформлен.");
            } else {
                throw new IllegalArgumentException("Введен недействительный ИНН.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static boolean isValidInn(String inn) {
        // ИНН действителен, если он состоит из 12 цифр
        return inn.matches("\\d{12}");
    }
}