package Kata.Block_1;

import java.util.Arrays;

public class Ex_1_5_6 {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(inverseArray(arr)));
    }

    public static int[] inverseArray(int[] numbers) {
        int[] arrays = new int[numbers.length];
        if (arrays.length != 0) {
            for (int i = 0; i < numbers.length; i++) {
                arrays[numbers.length - 1 - i] = numbers[i];
            }
        } else {
            arrays = numbers;;
        }
        return arrays;
    }

}
