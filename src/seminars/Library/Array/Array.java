package Library.Array;

public class Array {
    public static void main(String[] args) {
// массив или вектор, содержат значения одного типа
        /*----------
         РЕКОМЕНДУЕМО
           int length_massiv = 5;

        int[] array = new int[length_massiv];
            or
        String[] array2 = new String[length_massiv];
        --------- */

        int[] array = new int[5];
//        int[] array = new int[] {2,3,4,6,9};
        System.out.println(array.length); //  метод length - длину массива от 0 до 4 = 5
// записываеи новое значение в массив
        array[3] = 4;
        System.out.println(array[3]);

        int b = 3;
        if (b < array.length) {
            System.out.println(array[b]);
        }
        // Вывести, распечатать, массив
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//     ---------------ARRAY STRING---------
        String[] array2 = new String[5];
//        String[] array2 = new String[] {"null","null","null","null","null"};
        System.out.println(array2.length); //  метод length - длину массива от 0 до 4 = 5

        // записываеи новое значение в массив "_"
//        array2[3] = "любой текст"; //                 спросить у ДЕНА

        // Вывести, распечатать, массив
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }


        String a = "aaaa";                        //                 спросить у ДЕНА
        // Манипуляции с массивом
        for (int i = 0; i < array2.length; i++) {
            // находим свободный элемент
            if (array2[i] == null) ;
            {
                //
//            array2[i] = a;             //                 спросить у ДЕНА
                break;
            }
        }
        // Вывести, распечатать, массив
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
}
