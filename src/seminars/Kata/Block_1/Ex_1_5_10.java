package Kata.Block_1;

import java.util.Arrays;

public class Ex_1_5_10 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 17};
        System.out.println(Arrays.toString(getArrayMiddle(arr)));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int left = (numbers.length - 1) / 2;
        int right = numbers.length == 0 ? 0 : left + 2 - numbers.length % 2;
        return Arrays.copyOfRange(numbers, left, right);
    }


    public static int[] getArrayMiddle1(int[] numbers) {
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
}
