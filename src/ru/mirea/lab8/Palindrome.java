package ru.mirea.lab8;

import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(String word){
        if (word.length() < 2){
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length()-1)){
            return false;
        }
        return isPalindrome(word.substring(1, word.length()-1));
    }

    public static void main(String[] args) {
        String word;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово: ");
        word = scanner.nextLine();

        if (isPalindrome(word)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}