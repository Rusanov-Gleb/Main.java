package Lesson7;

import java.util.Scanner;

public class Plate {
    private int food;
    public void setFood(int food) {
        this.food = food;
    }
    public Plate(int food) {
        this.food = food;
    }
    public void putFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите количесвто добавленной еды ");
        int x = scanner.nextInt();
        food += x;
        System.out.println("В тарелку добавлено " + x + " еды");
    }

    public void decriesFood(int appetite, String name) {
        while (appetite > food) {
            System.out.println("Коту " + name + " не хватает еды(");
            putFood();
        }
        if (food >= appetite) {
                food -= appetite;
                System.out.println(name + " ест из тарелки");
            }
    }
    public void info() {
        System.out.println("В тарелке осталось [" + food + "] еды");
    }
}
