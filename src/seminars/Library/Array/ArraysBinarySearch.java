package Library.Array;

import java.util.Arrays;

/*
*
Метод Arrays.binarySearch() возвращает позицию заданного значения.
 Если искомый элемент не найден, то возвращается - (position + 1), где position - позиция элемента где он МОГ БЫ БЫТЬ.
Массив должен быть отсортирован, иначе результат вызова метода будет не определен:
* */
public class ArraysBinarySearch {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int pos1 = Arrays.binarySearch(array1, 20);
        int pos2 = Arrays.binarySearch(array1, 25);
        System.out.println(pos1);
        System.out.println(pos2);
    }
}
