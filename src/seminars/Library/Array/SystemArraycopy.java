package Library.Array;

import java.util.Arrays;
/*
Метод System.arraycopy() осуществляет копирование части массива в другой массив.

Рассмотрим пример, копирующий элементы 2,3,4 из массива arraySource в массив arrayDestination:
* */

public class SystemArraycopy {
    public static void main(String[] args) {
        int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDestination = {0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("arraySource: " + Arrays.toString(arraySource));
        System.out.println("arrayDestination: "
                + Arrays.toString(arrayDestination));

        System.arraycopy(arraySource, 1, arrayDestination, 2, 3);
        System.out.println("arrayDestination after arrayCopy: "
                + Arrays.toString(arrayDestination));
    }

    /*
    [0, 0, 2, 3, 4, 0, 0, 0]
    * */

    /*
    Можно КОПИРОВАТЬ В ТОТ ЖЕ МАССИВ  с перекрытием областей:


    * public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(array));

        System.arraycopy(array, 1, array, 3, 3);
        System.out.println(Arrays.toString(array));
    }*/
}
