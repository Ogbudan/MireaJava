package ru.mirea.lab4.Atelie;

public enum Size {
    XXS(32){
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private int EuroSize;

    Size(int euroSize) {
        EuroSize = euroSize;
    }

    public int getEuroSize() {
        return EuroSize;
    }

    public void setEuroSize(int euroSize) {
        EuroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}