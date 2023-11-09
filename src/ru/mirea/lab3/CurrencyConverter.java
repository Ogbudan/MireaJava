package ru.mirea.lab3;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convertToUSD(double amount) {
        return amount / exchangeRate;
    }

    public double convertFromUSD(double amount) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        double currentExchangeRate = 1.1; // Пример обменного курса
        CurrencyConverter converter = new CurrencyConverter(currentExchangeRate);

        double amountInEUR = 100.0;
        double amountInUSD = converter.convertToUSD(amountInEUR);
        System.out.println(amountInEUR + " EUR = " + amountInUSD + " USD");

        double amountInUSD2 = 150.0;
        double amountInEUR2 = converter.convertFromUSD(amountInUSD2);
        System.out.println(amountInUSD2 + " USD = " + amountInEUR2 + " EUR");
    }
}
