package ru.mirea.lab4_1;

//Создайте класс Phone, который содержит переменные number, model
//и weight.
//1)Создайте три экземпляра этого класса. 2) Выведите на консоль значения
//их переменных. 3) Добавить в класс Phone методы: receiveCall, имеет один
//параметр – имя звонящего. 4)Выводит на консоль сообщение “Звонит {name}”.
//5)Метод getNumber – возвращает номер телефона. 6) Вызвать эти методы для
//каждого из объектов. 7) Добавить конструктор в класс Phone, который принимает
//на вход три параметра для инициализации переменных класса - number, model и
//weight. 8)Добавить конструктор, который принимает на вход два параметра для
//инициализации переменных класса - number, model. 9)Добавить конструктор без
//параметров. 10)Вызвать из конструктора с тремя параметрами конструктор с
//двумя. 11)Добавьте перегруженный метод. receiveCall, который принимает два
//параметра - имя звонящего и номер телефона звонящего. 12)Вызвать этот метод.
//13)Создать метод sendMessage с аргументами переменной длины. Данный метод
//принимает на вход номера телефонов, которым будет отправлено сообщение.
//14)Метод выводит на консоль номера этих телефонов.

import java.util.Arrays;

public class Phone {

    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){}

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name);
        System.out.println("Номер телефона " + number);
    }

    public void sendMassage(String... numbers){
        System.out.println(Arrays.toString(numbers));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}