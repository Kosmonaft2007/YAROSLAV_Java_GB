package Kata.Block_1;

import java.util.Arrays;

public class Ex_1_5_12 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (first) {
                    stringBuilder.append(arr[i]);
                    first = false;
                } else {
                    stringBuilder.append("," + arr[i]);
                }
            }
        }
        System.out.println(stringBuilder);
    }


    public static void printOddNumbers1(int[] arr) {

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                index = arr[i];
                index++;
//                System.out.println(arr[i]);
            }
        }
        int[] arrays = new int[index];
        Arrays.toString(arrays);
        for (int i = arrays.length; i < arr.length; i++) {

        }

    }
}
