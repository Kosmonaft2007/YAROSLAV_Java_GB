package Library.Exception.Ex_1;
/*

Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

import java.util.Arrays;

public class Ex_4 {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 6, 7, 8};
        int[] myArray1 = {1, 3, 4, 6, 7, 8};
//        for (int a: sunArr(myArray, myArray1)
//             ) {
//            System.out.println(a);
//        }
        System.out.println(Arrays.toString(sunArr(myArray, myArray1)));
    }
    public static int [] sunArr(int[]arr1, int []arr2){
        int [] newArr= new int[arr1.length];

        if (arr2.length != arr1.length){
            throw  new RuntimeException(String.format("%d не равны %d", arr1.length, arr2.length));
        }
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i]+arr2[i];
        }
        return newArr;
    }
}
