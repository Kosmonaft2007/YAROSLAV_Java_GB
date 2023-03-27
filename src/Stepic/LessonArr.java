import java.util.Scanner;

public class LessonArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = 1;
        int y = 15;
        int sum = 0;
        int a;

        while (x <= y) {

            sum = sum + x ;
            x++;

        }System.out.println((x % 2 == 0) ? sum  : "");
    }
}

/*
На вход подаётся натуральное число n.
Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать (в одной строке, через пробел).

Sample Input:
5
Sample Output:
1 2 3 4 5
 */

//import java.util.Scanner;
    class LessonArr0 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }

////        String str = "";
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
////        int a, b;
//        int [] num = new int[a];
//
////        b = num.length;
//
//        for (int i = 1; i <= a; i++) num[i - 1] = i;
//
//        for (int i = 0; i < a; i++) System.out.print(num[i] + " ");
    }
}

/*
/////////////////////////
 */

//import java.util.Scanner;
class LessonArr1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
    }
    }

    /*
    Создайте массив, в котором будут храниться кубы чисел от 1 до 1000.
    Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

    Sample Input:
    8
    11
    Sample Output:
    512
    1331
     */

//import java.util.Scanner;
class LessonArr2 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for(int i = 1; i < n; i++)
            array[i] = (int) Math.pow(i, 3);
        System.out.println(array[3]);
    }
}
//import java.util.Scanner;
class LessonArr2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 1001;
        int [] mas = new int [n];

        for (int i = 0; i < n; i++)
            mas [i] = (int) Math.pow(i, 3 );

        System.out.println (mas [a] + "\n" + mas [b]);
    }
}

    class LessonArr2_2{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] a = new int[1001];
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x] = x * x * x;
            a[y] = y * y * y;
                System.out.println(a[x]);
            System.out.println(a[y]);
        }
    }


    /*
  Вводится число n, затем n чисел целых, по одному на каждой строке.
  Затем вводится число, на которое нужно умножить все введённые выше числа.
  Выведите на экран результат умножения построчно.

Sample Input:
4
1
2
3
5
2
Sample Output:

2
4
6
10

     */

//import java.util.Scanner;
class LessonArr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] mas = new int [n];

        for (int i = 0; i < n; i++)
            mas [i] = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < n; i++)
        System.out.println (mas [i] * b);
    }
}
/*
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) arr[i] *= x;
        for (int i = 0; i < n; i++) System.out.println(arr[i]);
    }
}
 */

/*
Вводится список (сначала количество элементов, потом сами элементы).
Найдите сумму всех элементов и выведите её.
А потом выведите введённые числа в обратном порядке.

Sample Input:

4
1
2
3
4
Sample Output:

10
4
3
2
1

     */

//import java.util.Scanner;
class LessonArr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] mas = new int [n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            mas [i] = sc.nextInt();
            sum += mas[i];
        }
        System.out.println (sum);
        for (int i = mas.length - 1; i >= 0 ; i--)
            System.out.println (mas[i]);
    }
}
/*
class MyProgram{
    public static void main(String[] args){
        Scanner sca = new Scanner (System.in);
        int n = sca.nextInt(),
            pr=0;
        int[] mass = new int[n];

        for (int j=0; j<n; j++)  // ввод массива
            mass[j]=sca.nextInt();
        for (int j=0; j<n; j++)
            pr+=mass[j];
        System.out.println(pr);
        for (int j=n-1;j>=0;j--) // вывод массива
            System.out.println(mass[j]);

    }
}
 */

/*
Вводится массив (сначала количество элементов, потом сами элементы).
Найдите сумму его элементов с чётными индексами и выведите её.
А потом выведите числа, которые суммировались.
Sample Input:
4
1
2
3
4
Sample Output:
4
1
3
 */

//import java.util.Scanner;
class LessonArr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] mas = new int [n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            mas [i] = sc.nextInt();
           if (i% 2 == 0 || i == 0)  // определяем на четность индекс массива  /   (mas[i]%2 !=0) определяем на четность значения  содержащихся в  массива
           sum += mas [i];  //  sum =sum + mass[i];  сумма элекментов массива
        }
//        sc.close();
        System.out.println (sum);
        for (int i = 0; i < mas.length ; i++)  //  почему ввели j вместо i ?????????
            if (i % 2 == 0 )
            System.out.println ( mas[i] );
    }
}
/*
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = sc.nextInt();
        int[] a = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(IntStream.range(0, a.length)
                .filter(i -> i % 2 == 0)
                .map(i -> a[i]).sum());
        IntStream.range(0, a.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> a[i])
                .forEach(System.out::println);
    }
}
 */

/*
Дан список (сначала количество элементов, потом сами элементы).
Потом водятся два числа: a и b. Поменяйте местами значения a-ого и b-ого элементов массива и выведите его на экран построчно.
Гарантируется, что а и b не выходят за границы размеров массива.

Sample Input:
5
12
78
45
378
12
2
4
Sample Output:
12
78
12
378
45
 */

class LessonArr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // количество элеметов массива 4

        int [] mas = new int [n];
        int sum = 0; // еще не знаю за чем
        for (int i = 0; i < mas.length; i++){
            mas [i] = sc.nextInt();  // список элеметов массива 2 3 4 5

        }
        int a = sc.nextInt(); // элеметы массива
        int b = sc.nextInt(); // элеметы массива


        if (a <= n || b <= n || a != b) {  // Гарантируется, что а и b не выходят за границы размеров массива
            int k = mas [a]; // k это наша третья переменная
            mas[a] = mas[b];
            mas[b] = k;
        }

        for (int i = 0; i < n; i++) { //  почему ввели j вместо i ?????????

            System.out.println(mas[i]);
        }
    }
}
/*
for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        for (int i = 0; i < s.length; i++) {
            if (i==a) {
                System.out.println(s[b]);
            } else if (i==b) {
                System.out.println(s[a]);
            } else {
                System.out.println(s[i]);
            }

            and ------

                import java.lang.reflect.Array;
    import java.util.Arrays;
    import java.util.Scanner;
    import java.util.stream.IntStream;

    class MyProgram {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] numbers = IntStream.generate(scanner::nextInt).limit(n).toArray();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            swap(numbers, a, b);
            Arrays.stream(numbers).forEach(System.out::println);
            scanner.close();
        }

        public static void swap(final Object array, final int i, final int j) {
            final Object atI = Array.get(array, i);
            Array.set(array, i, Array.get(array, j));
            Array.set(array, j, atI);
    }
}
 */


/*
Нахождение индексов максимального и минимального элемента массива
 */
class LessonArr06 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] array = new int [n];
        double[] array = {0.22, 0.4, 0.92, 1.5, 1.99, 4.5};
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMax + " " + indexOfMin);
    }
}

/*
Петя перешёл в другую школу. На уроке физкультуры ему понадобилось определить своё место в строю.
Помогите ему это сделать.

Входные данные
Программа получает на вход невозрастающую последовательность натуральных чисел (сначала вводится количество, затем сами числа),
означающих рост каждого человека в строю. После этого вводится число X – рост Пети.
Все числа во входных данных натуральные и не превышают 200.

Выходные данные
Выведите номер, под которым Петя должен встать в строй.
Если в строю есть люди с одинаковым ростом, таким же, как у Пети, то он должен встать после них.

Sample Input:

7
165
163
160
160
157
157
155
162
Sample Output:

3
 */

class LessonArr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // количество ребят
        int [] mas = new int [n];
////        int sum = 0; // еще не знаю за чем
        for (int i = 0; i < n; i++){
            if (mas [i] <=200){
                mas [i] = sc.nextInt();  // список элеметов массива - их рост
            }
        }
        int a = sc.nextInt(); // рост пети
////        int b = sc.nextInt(); // элеметы массива

        int index = n+1;
//        int index = 0;
             for(int i = 0; i < n; i++) {
                 if (mas[i] < a) {       //   перебираем массив, с маленького роста
                     index = i;
//                break;
                 }
             }
//             System.out.println(index + 1);
        System.out.println(index);
//        for (int i = 0; i < n; i++) {
//            if (a == mas[i]) {
//                continue;
//            }else if (a > mas[i]) {
//
//                System.out.println(i+1);
//                break;
//            }
//        }

    }
}

class LessonArr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] numbers = new int[a];
        for (int i = 0; i < a; i++) {     // заполняем массив
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) { // обработка массива
            boolean nonDuplicate = true;    // переменная "нет дубликата" - устанавливаем, по умолчанию считаем что нет
            for (int j = 0; j < a; j++) {
                if (i != j && numbers[i] == numbers[j]) {  // проверка: проверка на то что не сравнивал число в массиве, в итерациях с самим собой!!
                    // если число при проверки массива numbers нашел дубликат то nonDuplicate = false; (данное число игнарируется)
                    nonDuplicate = false;
                }
            }

            if (nonDuplicate) {
                System.out.println(numbers[i]);
            }
        }
    }

}


  class LessonArr9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ваш код
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int j = 0; j < n; j++)
            array[j] = j;
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
 */

class LessonArr10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int j = 0; j < n; j++)
            array[j] = j*j;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}