package ru.mirea.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyConverter {
    static String[] currency = {"USD", "EUR", "RUB", "JPY", "GBP", "CNY"};
    static double[] USD = {1, 0.95, 97, 149.49, 0.8244, 7.31};
    static double[] EUR = {1.05, 1, 102.1, 157.34, 0.8677, 7.69};
    static double[] RUB = {0.010309, 0.009795, 1, 1.54, 0.008499, 0.075328};
    static double[] JPY = {0.006689, 0.006356, 0.648885, 1, 0.005515, 0.048879};
    static double[] GBP = {1.21, 1.15, 117.66, 181.33, 1, 8.86};
    static double[] CNY = {0.136856, 0.130025, 13.28, 20.46, 0.112825, 1};

    public static void main(String[] args){
        Scanner source = new Scanner(System.in);

        System.out.println(Arrays.toString(currency));

        System.out.println();

        String cCode;

        while(true) {
            System.out.println("Введите код валюты: ");
            cCode = source.nextLine();
            if ( Arrays.asList(currency).contains(cCode) ){
                break;
            }
            System.out.println("Ошибка ввода");
        }

        System.out.println("Введите количество " + cCode + ": ");
        int amount = source.nextInt();

        switch (cCode){
            case ("USD"):
                for (int i = 0; i < 6; i++){
                    if (i != Arrays.asList(currency).indexOf(cCode)) System.out.println(amount + " " + cCode + " = " + amount * USD[i] + ' ' + currency[i]);
                }
                break;
            case ("EUR"):
                for (int i = 0; i < 6; i++){
                    if (i != 1) System.out.println(amount + " " + cCode + " = " + amount * USD[i] + ' ' + currency[i]);
                }
                break;
            case ("RUB"):
                for (int i = 0; i < 6; i++){
                    if (i != 2) System.out.println(amount + " " + cCode + " = " + amount * USD[i] + ' ' + currency[i]);
                }
                break;
            case ("JPY"):
                for (int i = 0; i < 6; i++){
                    if (i != 3) System.out.println(amount + " " + cCode + " = " + amount * USD[i] + ' ' + currency[i]);
                }
                break;
            case ("GBP"):
                for (int i = 0; i < 6; i++){
                    if (i != 4) System.out.println(amount + " " + cCode + " = " + amount * USD[i] + ' ' + currency[i]);
                }
                break;
            case ("CNY"):
                for (int i = 0; i < 6; i++){
                    if (i != 5) System.out.println(amount + " " + cCode + " = " + amount * USD[i] + ' ' + currency[i]);
                }
                break;
        }
    }
}