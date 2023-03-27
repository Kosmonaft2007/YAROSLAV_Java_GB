import java.util.Arrays;
import java.util.Scanner;
import java.util.NoSuchElementException;

/*
Вводится число n. Затем вводится 2 раза по n действительных чисел - два массива. Вывести на экран их сумму.

Sample Input:

5
-3 2.5 3.47 86 1.2
1 -2 5 -12.5 4
Sample Output:

-2.0
0.5
8.47
73.5
5.2
 */
public class SecondArray { // 1.14-0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
        int n = sc.nextInt();

        double[] array = new double[n];
        double[] array2 = new double[n];
        int count =0;
        for (int i = 0; i < n; i++)
        {
//            array[i] = Double.parseDouble(sc.nextLine());
            array[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++)
        {
//            array2[i] = Double.parseDouble(sc.nextLine());
            array2[i] = sc.nextDouble();
        }

        for (int i=0; i<n; i++)
        {
             array[i] += array2[i];
            System.out.println(array[i]);
        }
        sc.close();

    }
}

/*
Вводятся 2 натуральных числа: n и m. Выведите на экран таблицу умножения размером n*m через пробел.

Sample Input:

3
4
Sample Output:

1 2 3 4
2 4 6 8
3 6 9 12

 */
 class SecondArray0 { // 1.14-1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(); // количество строк и количество столбцов
        int tabl [][] = new int[n][m]; // создаем двумерный массив

        // заполняем массив
        for (int i = 0; i<n; i++)
            for (int j = 0; j<m; j++)
                tabl [i][j] = (i+1)*(j+1); // у массива 2 индекса - первый определяет индекс массива, который мы берём, а второй - индекс элемента в массиве.
        // 1 строка = (0+1)*(0+1), (0+1)*(1+1), (0+1)*(2+1), (0+1)*(3+1)
        // 1 строка = 1 2 3 4
        // 2 строка = (1+1)*(0+1), (1+1)*(1+1), (1+1)*(2+1), (1+1)*(3+1)
        // 2 строка = 2 4 6 8
        // 3 строка = (2+1)*(0+1), (2+1)*(1+1), (2+1)*(2+1), (2+1)*(3+1)
        // 3 строка = 3 6 9 12

        // выводим таблицу
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++) System.out.print(tabl[i][j]+" "); // выводим элементы массива, не переходя на следующую строку
            System.out.println();} // переходим на новую строку при полном обходе второго цикла (заполнения первой строки)
        sc.close();

    }
}

/*
Вводятся 2 натуральных числа: n и m. Затем вводится через пробел n*m целых чисел. Сохраните их в табличном виде и выведите на экран (разделитель - пробел).

Sample Input:

2
3
2 5 89 12 4 -7
Sample Output:

2 5 89
12 4 -7

 */
class SecondArray1 { // 1.14-2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(); // количество строк и количество столбцов
        int arr [][] = new int[n][m]; // создаем двумерный массив

        // заполняем массив
        for (int i = 0; i<arr.length; i++)
            for (int j = 0; j<arr[i].length; j++)
                arr [i][j] = sc.nextInt();

        // выводим таблицу
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++) System.out.print(arr[i][j]+" "); // выводим элементы массива, не переходя на следующую строку
            System.out.println();} // переходим на новую строку при полном обходе второго цикла (заполнения первой строки)
        sc.close();

    }
}
/*
Главной диагональю в таблице (правильнее говорить матрице) называют диагональ, идущую из верхнего левого угла в нижний правый.

Вводится число n. Выведите на экран матрицу размером n на n, у которой:

все элементы главной диагонали равны 1
все элементы, которые лежат ниже главной диагонали равны 2
все элементы, которые лежат выше главной диагонали равны 0.
Внутри строки между элементами должен находится пробел.
Sample Input 1:

5
Sample Output 1:

1 0 0 0 0
2 1 0 0 0
2 2 1 0 0
2 2 2 1 0
2 2 2 2 1
 */
class SecondArray2 { // 1.14-3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int arr [][] = new int[n][n]; // создаем двумерный массив

        // заполняем массив
        for (int i = 0; i<arr.length; i++)
            for (int j = 0; j<arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                    continue;
                }
                if (i > j) {
                    arr[i][j] = 2;
                    continue;
                }
                arr[i][j] = 0;
            }

        // выводим таблицу
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++)
                System.out.print(arr[i][j]+" "); // выводим элементы массива, не переходя на следующую строку
            System.out.println();} // переходим на новую строку при полном обходе второго цикла (заполнения первой строки)

        sc.close();

    }
}
/*
---------------
int n = scan.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = i == j ? 1 : i < j ? 0 : 2;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
 */
/*


 */