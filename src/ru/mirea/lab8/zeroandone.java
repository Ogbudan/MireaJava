package ru.mirea.lab8;

import java.util.Scanner;
public class zeroandone {
    public static int fun(int a, int b){
        if (a > b + 1){
            return 0;
        }
        if (a == 0 || b == 0){
            return 1;
        }
        return fun(a, b-1) + fun(a-1, b-1);
    }

    public static void main(String[] args){
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a: ");
        a = scanner.nextInt();
        System.out.println("Введите b: ");
        b = scanner.nextInt();

        System.out.println(fun(a, b));
    }
}