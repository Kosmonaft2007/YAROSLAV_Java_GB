package Library;

import java.util.Scanner;

public class LibrarySem {
    // Считываем текс из консоли
    public static String scannerText() {
//        String s =
//        String s =
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст");
        String text = sc.nextLine();

        sc.close();
        return text;

    }

    // Выводим массив на консоль в одну строчку
    /*
        public static void main(String[] args) {
        String str = scannerText();
        String[] parts = str.split("~");
        arrayPrintLine(parts);//
    }*/

    public static void arrayPrintLine(String[] array) { // (int[] array)
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // генерируем случайные числа в заддном диапазоне


    // вычисляем треугольник числа


    // факториал
    public static int factorial(int n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }
}
