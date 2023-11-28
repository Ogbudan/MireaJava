package ru.mirea.lab4.Atelie;

public abstract class Clothes {

    public Size size;
    public int price;
    public Color color;


    public Clothes(Size size, int price, Color color){
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Size size, int price, Color color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "size=" + size +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(Size size, int price, Color color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}

class Skirt extends Clothes implements WomenClothing {

    public Skirt(Size size, int price, Color color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size=" + size +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}

class Tie extends Clothes implements MenClothing {

    public Tie(Size size, int price, Color color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + size +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}