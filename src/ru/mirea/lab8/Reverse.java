package ru.mirea.lab8;

import java.util.Scanner;

public class Reverse {
    public static String fun(String num){
        if (num.length() < 2){
            return num;
        }
        return num.charAt(num.length()-1) + fun(num.substring(1, num.length()-1)) + num.charAt(0);
    }

    public static void main(String[] args){
        String number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число без нулей: ");
        number = scanner.nextLine();

        System.out.println(fun(number));
    }
}