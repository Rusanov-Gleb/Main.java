package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] field = initField(5);
        printField(field);

        while (true) {
            humanTurn(field);
            printField(field);
            if (isDraw(field)) {
                break;
            }
            if (isWinnerHorizontal(field, "X") ||
                    isWinnerVertical(field, "X") ||
                    isWinnerDiagonalsOne(field, "X") ||
                    isWinnerDiagonalsTwo(field, "X")) {
                System.out.println("Вы победили");
                break;
            }

            aiTurn(field);
            printField(field);
            if (isDraw(field)) {
                break;
            }
            if (isWinnerHorizontal(field, "0") ||
                    isWinnerVertical(field, "0") ||
                    isWinnerDiagonalsOne(field, "0") ||
                    isWinnerDiagonalsTwo(field, "0")) {
                System.out.println("Восстание машин началось 0_0");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }

    public static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    public static void humanTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Укажите клетку по Х и У: ");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int size = field.length;

            if (x < size && y < size && x >= 0 && y >= 0)

                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Эта клетка занята!)");
                }
            else {
                System.out.println("Вы тыкунли не игровое поле");
            }
        }
    }

    public static void aiTurn(String[][] field) {

        while (true) {
            Random random = new Random();
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);

            if (field[x][y].equals("*")) {
                field[x][y] = "0";
                break;
            }
        }
        System.out.println("Ход компьютера: ");
    }

    public static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }

    /* Проверка победы перебором для 3*3
    public static boolean isWinner (String[][] field, String turn) {

        if (    field[0][0].equals(turn) && field[0][1].equals(turn) && field[0][2].equals(turn) ||
                field[1][0].equals(turn) && field[1][1].equals(turn) && field[1][2].equals(turn) ||
                field[2][0].equals(turn) && field[2][1].equals(turn) && field[2][2].equals(turn)) {
            return true;
        }
        else if (       field[0][0].equals(turn) && field[1][0].equals(turn) && field[2][0].equals(turn) ||
                        field[0][1].equals(turn) && field[1][1].equals(turn) && field[2][1].equals(turn) ||
                        field[0][2].equals(turn) && field[1][2].equals(turn) && field[2][2].equals(turn)) {
           return true;
        }
        else if (       field[0][0].equals(turn) && field[1][1].equals(turn) && field[2][2].equals(turn) ||
                        field[0][2].equals(turn) && field[1][1].equals(turn) && field[2][0].equals(turn)) {
            return true;
        }

        return false;
    }

     */
    public static boolean isWinnerHorizontal(String[][] field, String turn) {
        boolean res;
        for (int i = 0; i < field.length; i++) {
            res = true;
            for (int j = 0; j < field.length; j++) {
                res &= (field[i][j].equals(turn));
            }
            if (res) {
                return true;
            }
        }
        return false;
    }
    public static boolean isWinnerVertical(String[][] field, String turn) {
        boolean res;
        for (int i = 0; i < field.length; i++) {
            res = true;
            for (int j = 0; j < field.length; j++) {
                res = (res & field[j][i].equals(turn));
            }
            if (res) {
                return true;
            }
        }
        return false;
    }
    public static boolean isWinnerDiagonalsOne(String[][] field, String turn) {
        boolean res = true;
        for (int i = 0; i < field.length; i++) {
            res = (res & field[i][i].equals(turn));
        }
        return res;
    }
    public static boolean isWinnerDiagonalsTwo(String[][] field, String turn) {
        boolean res = true;
        for (int i = 0; i < field.length; i++) {
            res = (res & field[field.length - i - 1][i].equals(turn));
        }
        return res;
    }
}
