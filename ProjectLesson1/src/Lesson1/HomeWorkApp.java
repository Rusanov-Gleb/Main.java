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
            System.out.println("����� �������������");
        }
        else {
            System.out.println("����� �������������");
        }
    }
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("�������");
        }
        if (0 < value && value <= 100) {
            System.out.println("������");
        }
        if (100 < value) {
            System.out.println("�������");
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
