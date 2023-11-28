package ru.mirea.lab4_1;

public class Test {
    public static void main(String[] args){
        Phone[] phones = {
                new Phone("+79876548765", "Iphone 14", 10),
                new Phone("+71232324623", "Xiaomi Mi MIX 2S", 8),
                new Phone("+75437456767", "Samsung Galaxy S22", 10),
        };

        Phone phone = new Phone();

        for(Phone _phone : phones){
            System.out.println(_phone.toString());
        }

        System.out.println();

        for(Phone _phone : phones){
            System.out.println(_phone.getNumber());
            _phone.receiveCall("Даниил", "+79262752311");
            System.out.println();
        }

        phone.sendMassage("+79154002003", "+79152704960", "+79195508943");
    }
}