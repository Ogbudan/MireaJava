package ru.mirea.lab6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите х координату: ");
        int x = 0;
        if (scanner.hasNextInt()) {
            x = scanner.nextInt();
        } else {
            System.out.println("Неправильный ввод\n");
            System.exit(0);
        }
        System.out.print("Введите y координату: ");
        int y = 0;
        if (scanner.hasNextInt()) {
            y = scanner.nextInt();
        } else {
            System.out.println("Неправильный ввод\n");
            System.exit(0);
        }
        System.out.print("Введите на сколько (положительное) переместить центр по x: ");
        int xSpeed1 = 0;
        int xSpeed = 0;
        if (scanner.hasNextInt()) {
            xSpeed1 = scanner.nextInt();
            if (xSpeed1>0){
                xSpeed = xSpeed1;
            }
            else {
                System.out.println("Неправильный ввод\n");
                System.exit(0);
            }
        }
        System.out.print("Введите на сколько (положительное) переместить центр по y: ");
        int ySpeed1 = 0;
        int ySpeed = 0;
        if (scanner.hasNextInt()) {
            ySpeed1 = scanner.nextInt();
            if (ySpeed1>0){
                ySpeed = ySpeed1;
            }
            else {
                System.out.println("Неправильный ввод\n");
                System.exit(0);
            }
        }
        MovablePoint point = new MovablePoint(x, y, xSpeed, ySpeed);
        System.out.println("Координаты  изначальной точки: " + point);
        System.out.print("Выбери куда переместить точку:\n ");
        System.out.println("1 - перемещение вверх и влево");
        System.out.println("2 - перемещение вверх и вправо");
        System.out.println("3 - перемещение вниз и вправо");
        System.out.println("4 - перемещение вниз и влево");
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                point.moveUp();
                point.moveLeft();
                break;
            case 2:
                point.moveUp();
                point.moveRight();
                break;
            case 3:
                point.moveDown();
                point.moveRight();
                break;
            case 4:
                point.moveDown();
                point.moveLeft();
                break;
            default:
                System.out.println("Некорректная команда!");
                return; // выходим из программы
        }
        System.out.println("Координаты точки после перемещения: " + point);

        System.out.print("Введите х координату для центра: ");
        if (scanner.hasNextInt()) {
            x = scanner.nextInt();
        } else {
            System.out.println("Неправильный ввод\n");
            System.exit(0);
        }
        System.out.print("Введите y координату для центра: ");
        if (scanner.hasNextInt()) {
            y = scanner.nextInt();
        } else {
            System.out.println("Неправильный ввод\n");
            System.exit(0);
        }
        System.out.print("Введите радиус для круга: ");
        int radius = 1;
        if (scanner.hasNextInt()) {
            radius = scanner.nextInt();
        } else {
            System.out.println("Неправильный ввод\n");
            System.exit(0);
        }
        System.out.print("Введите на сколько (положительное) переместить центр по x для круга: ");
        if (scanner.hasNextInt()) {
            xSpeed1 = scanner.nextInt();
            if (xSpeed1>0){
                xSpeed = xSpeed1;
            }
            else {
                System.out.println("Неправильный ввод\n");
                System.exit(0);
            }
        }
        System.out.print("Введите на сколько (положительное)переместить центр по y для круга: ");
        if (scanner.hasNextInt()) {
            ySpeed1 = scanner.nextInt();
            if (ySpeed1>0){
                ySpeed = ySpeed1;
            }
            else {
                System.out.println("Неправильный ввод\n");
                System.exit(0);
            }
        }

        MovableCircle circle = new MovableCircle(x, y, xSpeed, ySpeed, radius);
        System.out.println("Изначальный круг: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Круг после перемещения вниз и вправо: " + circle);
    }
}
