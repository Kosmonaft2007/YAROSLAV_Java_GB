package Library.Array;
/*
Метод Arrays.toString() возвращает строковое представление одномерного массива, разделяя элементы запятой.
Вместо того чтобы перебирать массивы циклом for, можно воспользоваться этим методом для вывода элементов на консоль:
* */


import java.util.Arrays;

public class ArraysToString {


    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 8};
        System.out.println(Arrays.toString(array));
    }
}
