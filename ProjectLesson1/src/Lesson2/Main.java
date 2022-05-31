package Lesson2;

public class Main {

    public static void main(String[] args) {
        System.out.println(within10and20(13, 3));
        System.out.println(isPositiveOrNegative(-4));
        System.out.println(isNegative(0));
        printWordNTimes("Будь здоров",1);
        System.out.println(leapYear(100));
    }

    public static boolean within10and20(int x1, int x2) {
        int c = x1 + x2;
        if (c >= 10 && c <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
    public static String isPositiveOrNegative(int x) {
        if (x >= 0) {
            return ("Положительное");
        } else {
            return ("Отрицательное");
        }

    }
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println (word);
        }
    }
    public static boolean leapYear(int year) {
        int i = year%100;
        int c = year%4;
        int r = year%400;
        if ( i != 0 && c == 0) {
            return true;
        }
        if (r == 0) {
            return true;
        }
        else  {
            return false;
        }
    }
}


