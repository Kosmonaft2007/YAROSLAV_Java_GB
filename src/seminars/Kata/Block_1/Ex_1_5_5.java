package Kata.Block_1;

import java.util.Arrays;

public class Ex_1_5_5 {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(getArrayMiddle(arr)));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int[] arrMins;
        if (numbers.length > 2) {
            arrMins = new int[2];
            if (numbers.length % 2 == 0) {
                arrMins[0] = numbers[((numbers.length) / 2) - 1];
                arrMins[1] = numbers[(numbers.length) / 2];

            } else {
                arrMins = new int[1];
                arrMins[0] = numbers[((numbers.length - 1) / 2)];
            }
        } else {
            arrMins = numbers;
        }
        return arrMins;
    }


    public static int[] getArrayMiddle1(int[] numbers) {
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                int[] arr = new int[2];
                arr[0] = numbers[numbers.length / 2 - 1];
                arr[1] = numbers[numbers.length / 2];
                return arr;
            } else {
                int[] arr1 = new int[1];
                arr1[0] = numbers[numbers.length / 2];
                return arr1;
            }
        } else {
            return numbers;
        }
    }
}
