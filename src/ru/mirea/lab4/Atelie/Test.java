package ru.mirea.lab4.Atelie;

public class Test {
    public static void main(String[] args){
        Clothes[] clothes = {
                new Tie(Size.S, 3999, Color.BLUE),
                new TShirt(Size.M, 1499, Color.WHITE),
                new Tie(Size.XS, 999, Color.RED),
                new TShirt(Size.L, 1699, Color.GREEN),
                new Skirt(Size.S, 2999, Color.BLACK),
                new Tie(Size.M, 4999, Color.WHITE),
                new Skirt(Size.S, 9999, Color.PURPLE),
                new TShirt(Size.XS, 2500, Color.ORANGE),
                new Pants(Size.M, 4999, Color.YELLOW),
                new Skirt(Size.L, 1599, Color.GRAY),
                new Pants(Size.XXS, 2999, Color.BLUE),
                new Tie(Size.XS, 15999, Color.WHITE)

        };

        Atelie atelie = new Atelie();
        atelie.dressMan(clothes);
        System.out.println();
        atelie.dressWoman(clothes);
    }
}