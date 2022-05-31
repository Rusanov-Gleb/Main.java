package Lesson3;

public class Main {
    public static void main(String[] args) {
        arr1();
        arr2();
        arr3();
        table();
        arrReturn(5,0);
    }
        public static void arr1() {
            int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                } else {
                    arr[i] = 0;
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public static void arr2(){
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
        public static void arr3() {
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        }
        public static void table() {
        int counter = 0;
        int[][] table = new int [5][5];
        for (int i = 0;i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = counter;
                if (i == j){
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + "   ");
            }
            System.out.println();
        }
        }
        public static int[] arrReturn(int len, int initialValue) {
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
                System.out.print(arr[i] + "  ");
            }
            return arr;
        }

}
