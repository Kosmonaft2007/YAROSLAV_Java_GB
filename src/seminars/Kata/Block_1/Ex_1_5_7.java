package Kata.Block_1;

import java.util.Arrays;

public class Ex_1_5_7 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 5};
        int[] arr1 = {8, 4, 2, 4};
        System.out.println(Arrays.toString(mergeAndSort(arr, arr1)));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] newArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            newArray[i] = firstArray[i];
        }
        int k = 0;
        for (int i = firstArray.length; i < newArray.length; i++) {
            newArray[i] = secondArray[k];
            k++;
        }
        for (int i = 0; i < newArray.length; i++) {
            int min = newArray[i]; // запоминаем минимальное значение
            int minI = i; // запоминаем индекс минимального значения
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j] < min) { // если наше число меньше минимального значения
                    int index = newArray[j];
                    min = newArray[j]; // запоминаем его минимальное значение
                    minI = j; // запоминаем его индекс минимального значения
                }
            }
            if (i != minI) {
                int temp = newArray[i];
                newArray[i] = newArray[minI];
                newArray[minI] = temp;
            }
        }
        return newArray;
    }
}
