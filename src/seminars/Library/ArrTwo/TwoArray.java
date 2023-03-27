package Library.ArrTwo;

import Library.String_Char.String_Char;

public class TwoArray {
    public static  void  main(String_Char[] args){

//        String[][] massiv = new String[2][4]; // не рекомендуется

        int length_horisontal = 3; // строчки
        int length_vertical = 4;  // колонки

        String_Char[][] massiv = new String_Char[length_horisontal][length_vertical];

    System.out.println(massiv.length);

        // Вывести, распечатать, массив
        for (int i =0; i < length_horisontal; i++){
            System.out.println();                       //разделение
            for (int k =0; k < length_vertical; k++){
                System.out.print(massiv[i][k] + "___");
                System.out.print(massiv[i][k] + " ");
            }
        }

    }


}
