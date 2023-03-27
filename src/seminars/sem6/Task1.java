package sem6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
1.5. Создайте метод, в который передайте заполненный выше массив,
и с помощью Set вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class Task1 {

    /*
    Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
     */
    private static int[] fillArray(int capacity, int maxRange) {
        int[] array = new int[capacity];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxRange);
        }
        return array;
    }

    private static float calcPercent(int[] array) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        int count = set.size();
        System.out.println(set);
        return count * 100.0f / array.length;
    }

    public static void main(String[] args) {
        int[] array = fillArray(1000, 25);

        System.out.println(Arrays.toString(array));

        float percent = calcPercent(array);

        System.out.println(percent);
    }
}
