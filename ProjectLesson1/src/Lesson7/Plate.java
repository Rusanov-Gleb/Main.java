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
        System.out.println("������� ���������� ����������� ��� ");
        int x = scanner.nextInt();
        food += x;
        System.out.println("� ������� ��������� " + x + " ���");
    }

    public void decriesFood(int appetite, String name) {
        while (appetite > food) {
            System.out.println("���� " + name + " �� ������� ���(");
            putFood();
        }
        if (food >= appetite) {
                food -= appetite;
                System.out.println(name + " ��� �� �������");
            }
    }
    public void info() {
        System.out.println("� ������� �������� [" + food + "] ���");
    }
}
