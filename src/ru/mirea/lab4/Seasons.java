package ru.mirea.lab4;

public enum Seasons {
    SUMMER(25){
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    WINTER(-20),
    SPRING(10){
        public String getDescription() {
            return "Переходный сезон";
        }
    },
    AUTUMN(5){
        public String getDescription() {
            return "Переходный сезон";
        }
    };

    Seasons(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    private double averageTemperature;

    public void setAverageTemperature(double temperature){
        this.averageTemperature = temperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void favouriteSeason(Seasons season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public String getDescription() {
        return "Холодное время года";
    }

    public static void main(String[] args) {
        for (Seasons season : Seasons.values()){
            System.out.println(season);
            System.out.println(season.getDescription());
            System.out.println("Средняя температура = " + season.getAverageTemperature());
            System.out.println();
        }
    }
}