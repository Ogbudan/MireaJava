package ru.mirea.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numberOfPlayers = scanner.nextInt();

        List<String> deck = createDeck();
        Collections.shuffle(deck);

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            List<String> hand = dealCards(deck, 5);
            printHand(hand);
            System.out.println();
        }
    }

    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        List<String> suits = Arrays.asList("Пики", "Крести", "Буби", "Черви");
        List<String> ranks = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз");

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    private static List<String> dealCards(List<String> deck, int numberOfCards) {
        List<String> hand = new ArrayList<>();

        for (int i = 0; i < numberOfCards; i++) {
            hand.add(deck.remove(0));
        }

        return hand;
    }

    private static void printHand(List<String> hand) {
        for (String card : hand) {
            System.out.println(card);
        }
    }
}
