package Library.Array;
/*
*Сортировка массива - это частая задача при написании Java приложений.
* Метод Arrays.sort() позволяет сортировать элементы массива по возрастанию:
* */

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 1, 5, 6, 8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
