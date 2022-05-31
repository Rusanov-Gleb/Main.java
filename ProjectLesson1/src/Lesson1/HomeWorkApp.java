package Lesson1;

public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSin();
        printColor();
        compareNumbers();

    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSin() {
        int a = 10, b = 20, c;
        c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (0 < value && value <= 100) {
            System.out.println("Желтый");
        }
        if (100 < value) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = -100, b = 100;
        if (a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
