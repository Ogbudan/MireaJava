package ru.mirea.lab4.Atelie;

public class Atelie {
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes thing : clothes){
            if (thing instanceof MenClothing){
                System.out.println(thing.toString());
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes thing : clothes){
            if (thing instanceof WomenClothing){
                System.out.println(thing.toString());
            }
        }
    }
}