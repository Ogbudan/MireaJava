package ru.mirea.lab4.Atelie;

public class Test {
    public static void main(String[] args){
        Clothes[] clothes = {
                new Tie(Size.S, 3000, Color.BLUE),
                new TShirt(Size.M, 1500, Color.WHITE),
                new Tie(Size.XS, 1000, Color.RED),
                new TShirt(Size.L, 1500, Color.GREEN),
                new Skirt(Size.S, 2000, Color.BLACK),
                new Tie(Size.M, 5500, Color.WHITE),
                new Skirt(Size.S, 8000, Color.PURPLE),
                new TShirt(Size.XS, 2500, Color.ORANGE),
                new Pants(Size.M, 4000, Color.YELLOW),
                new Skirt(Size.L, 1500, Color.GRAY),
                new Pants(Size.XXS, 4000, Color.BLUE),
                new Tie(Size.XS, 7500, Color.WHITE)

        };

        Atelie atelie = new Atelie();
        atelie.dressMan(clothes);
        System.out.println();
        atelie.dressWoman(clothes);
    }
}