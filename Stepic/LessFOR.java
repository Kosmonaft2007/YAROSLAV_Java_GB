import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.String;

public class LessFOR {

/*
Вводится 2 целых числа a и b (a <= b). Необходимо вычислить сумму всех чисел от а до b включительно.

Sample Input:

1
3
Sample Output:

6
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.print(sum);
    }
}

/*
Напишем программу, которая считывает целые числа с клавиатуры и находит их сумму, если они заканчиваются на 7. Если ввели число, кратное 7, то программа должна завершиться (оно не суммируется). Во время решения задачи воспользуемся break и continue.

Sample Input:
1
2
17
27
14
37
45
12
Sample Output:
44
 */
class Less1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int sum = 0;

//        for (int i = sc.nextInt(); i % 7 != 0; i = sc.nextInt())
        for (int i = a; true; i = sc.nextInt()) {
            if (i % 7 == 0) {
                break;
            }
            if (i % 10 == 7) {
                sum = sum + i;
            }
        }

        System.out.print(sum);
    }
}

/*  ----- KYB----

Пользователь вводит слова до тех пор, пока не введёт "СТОП". Необходимо выяснить, было ли среди введённых слов слово "Куб".
Если да, то выведите "YES", если нет, то  "NO".

Sample Input:
Привет
Я
люблю
рисовать
круги
и
Куб
Это
Прикольно)
СТОП

Sample Output:
YES
 */
class KUB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        String s = sc.nextLine();
        boolean is_Coub = false;

        for (String str = s; true; str = sc.nextLine()) {
            if (str.equals("СТОП")) {
                break;
            }
            if (str.equals("Куб")) {
                is_Coub = true;
                break;
            }
        }
        if (is_Coub == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

/*     Найдите Куб 2.0

Пользователь вводит слова до тех пор, пока не введёт "СТОП". Среди введённых слов могут быть слова - паразиты, а именно: "'ээээ" или "потом". Слова-паразиты не считаются нормальными словами.
Необходимо выяснить, было ли среди введённых слов слово "Куб". Если да, то выведите, каким по счёту нормальным словом оно было введено. В противном случае выведите на экран слово "NO".

Sample Input 1:
Привет
ээээ
Я
люблю
рисовать
круги
и
Куб
Это
Прикольно)
СТОП
Sample Output 1:

7
 */

class KUB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = "Куб";
        boolean isStr = false;
        int count = 0;
        int sum = 0;
        for (String i = "СТОП"; !i.equals(str); str = sc.nextLine()) {
            if (str.equals("ээээ") || str.equals("потом")) {
                count--;
            }

            count++;
            if (str.equals("Куб")) {
                isStr = true;
                sum += count;
            }
        }
        if (isStr == true) {
            System.out.println(sum);
        } else if (isStr == false) {
            System.out.println("NO");
        }
    }
}

/*  второй спобоб КУБ 2

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyProgram{
    public static void main(String[] args){
       List<String> list = Stream.generate(new Scanner(System.in)::nextLine)    //делаем стрим и собираем его в лист, из которого в итоге легко можем узнать номер элемента
                .takeWhile(x -> !x.equals("СТОП"))                              //стрим делаем пока не встретится СТОП
                .filter(x->!x.equals("ээээ")&&!x.equals("потом"))               //фильтруем лишние слова
                .collect(Collectors.toList());                                  //собираем лист
        System.out.println(list.contains("Куб")?list.indexOf("Куб")+1:"NO");  //выводим номер элемента с Кубом или NO через тернарник
    }
}

---------------------- 3 вариант

import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean is_0 = false;
        int count = 1;
        for (; true; ) {
            String x = sc.nextLine();
            if ("СТОП".equals(x)) {
                break;
            } else if ("ээээ".equals(x) || "потом".equals(x)) {
                continue;
            } else if ("Куб".equals(x)) {
                is_0 = true;
            } else if (is_0 == false) {
                count++;
            }
        }
        if (is_0) {
            System.out.print(count);
        } else {
            System.out.print("NO");
        }
    }
}

 */


class Less3 {
    public static void main(String[] args) {

        // ITVDN.com 1 из ТОП 20 тестовых заданий на интервью для Java разработчика

        String st = "Задача1";

        StringBuilder stB = new StringBuilder();

        stB.append(st);

        stB = stB.reverse();       // используем StringBuilder для переворота строки

        System.out.println(stB);

    }
}

class Less4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

    }
}

/*  MAX  __ MINI
Задача на поиск минимума и максимума. Пользователь вводит натуральное число n, затем n целых чисел. Необходимо определить и вывести на экран минимальное и максимальное из них.
Обратите внимание, что в большинстве задач как минимальное и максимальное значения часто используются -2*109 и 2*109 соответственно. Но в олимпиадных задачах всегда смотрите на ограничения по числам (в них всегда оговорены границы, в которых будут лежать значения переменных).

Sample Input:
5
6
10
-7
13
4
Sample Output:

-7
13

 */
//   import java.util.Scanner;
////import java.util.stream.IntStream;
class Less5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // здесь должна быть проверка кол-ва эл-тов

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value < min) min = value;
            if (value > max) max = value;
        }

        System.out.println(min + "\n" + max);


//    MinMax minMax = new MinMax();
//
//    IntStream.generate(sc::nextInt).limit(sc.nextInt()).forEach(minMax::check);
//
//    System.out.println(minMax);

    }
}

// АЛЬТЕРНАТИВА
class MinMax {

    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public void check(int value) {
        if (value < min) min = value;
        if (value > max) max = value;
    }

    @Override
    public String toString() {
        return min + "\n" + max;
    }
}

class MinMax1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 0;
        int max = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        min = nums[0];
        max = nums[0];
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println(min);
        System.out.println(max);
    }
}

//              ------- Факториал-------
class Less6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        System.out.println(res);

                /*
                int n = new Scanner(System.in).nextInt(), factorial = 1;
                for (int i = 1; i <= n; i++) factorial *= i;
                System.out.println(factorial);
                 */

    }
}

        /*
        Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП" (гарантируется, что других слов не будет).
        Найдите произведение ненулевых чисел. Если же такое произведение найти не удалось, то выведите на экран "Не найдено".

       Для того, чтобы превратить String в другой тип данных используйте конструкцию подобную этой:
        String s = "45";
        int n = Integer.parseInt(s); //в переменной n окажется число 45

        Sample Input:

        3
        0
        2
        4
        СТОП
        Sample Output:
        24
         */

//class Less7 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int p = 1, i2 = 0;
        //for (String i = sc.nextLine(); !i.equals("СТОП"); i=sc.nextLine()) {
//        while (true) {
//            int i = sc.nextline();
//
//            int n = Integer.parseInt(i);
//            if (n!=0) {
//                p*=n;
//                i2++;
//            }
//        }
//        System.out.print((i2==0)? "Не найдено" : p);
//    }
//    public static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        String s = sc.nextLine();
//    }
//
//    public static int String(int s) {
//        int p = 1;
//        int counter = 0;
//        for (String i = "СТОП"; !i.equals(s); i = sc.nextLine())
//            if (!i.equals("0")) {
//                int n = Integer.parseInt(i);
//                p *= n;
//                counter++;
//            }
//        if (counter > 0)
//            System.out.println(p);
//        else
//            System.out.println("Не найдено");
//        sc.close();
//        return p;
//    }
//        public static void main(String[] args) {
//
//            Scanner sc = new Scanner(System.in);
//            String s = sc.nextLine();
//            int p = 1;
//            int counter = 0;
//            for (String i = "СТОП"; !i.equals(s);s = sc.nextLine())
//                if (!s.equals("0")){
//                    int n = Integer.parseInt(s);
//                    p *= n;
//                    counter++;
//                }
//            if (counter>0)
//                System.out.println(p);
//            else
//                System.out.println("Не найдено");
//            sc.close();
//        }
//}

class Less8 {
    public static void main(String[] args) {

        String sc = "Привет";

        for (int i = 0; i < 10; i++) {
            System.out.println(sc);
        }
/*
class JavaBasicsCourse {
    public static void main(String[] args) {
        Stream.generate(() -> "Привет").limit(10).forEach(System.out::println); // !!!!!!!!!!!
    }
}
 */
    }
}

/*
Напишите программу, которая находит сумму квадратов натуральных чисел от 1 до n, где n вводится с клавиатуры
 */
class Less9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i * i;

        }
        System.out.println(sum);

    }
}

/*

 */
class Less10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), p = sc.nextInt();
        int sum = 0;

        for (int i = n; i <= p; i++) {
            sum = i;
            System.out.println(i + " " + i + ".$");
        }
/* ?API
import java.util.Scanner;
import java.util.stream.IntStream;

class MyProgram{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IntStream.rangeClosed(scanner.nextInt(), scanner.nextInt())
                .mapToObj(x-> x + " " + x + ".$")
                .forEach(System.out::println);

    }
}
 */

    }
}

/*
Составьте программу, которая запрашивает ввод n чисел и считает их произведение.
Входные данные
На первой строке вводится натуральное число n. Затем вводится n строк, на каждой из которых находится ровно одно целое число.
Выходные данные
Выведите единственное число - ответ на задачу.
Примечание
В этой задаче есть достаточно большой тест, поэтому используйте тип данных long.
Sample Input 1:
3
2
5
7
Sample Output 1:

70
 */
class Less11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= n; i++) {
            int p = sc.nextInt();
            sum *= p;

        }
        System.out.println(sum);

    }
}

class Less12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= n; i += 2) {

            System.out.println(i);
        }
        System.out.println();

    }
}

class Less13 // не удача
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 1; i <= n; i++) {
            number[i] = sc.nextInt();
            if (a < n && n < b) {
                int sun = (int) Math.pow(a, 3);
                System.out.println(sun);
            } else System.out.println("Error");


        }

    }
}
/*
Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Напишите код,
который создаст массив с именем array на n элементов, в котором буду храниться введённые числа
(элемент массива равен соответствующему числу в во второй строке).
На следующей строке вводится 2 числа - индексы элементов, сумму которых вам надо найти.
Выведите на экран сумму этих двух элементов. Если вдруг индекс индекс оказался вне
пределов диапазона от 0 до n - 1, то выведите на экран слово Error.

Sample Input 1:
5
12 3 -4 6 2
0 3
Sample Output 1:
18
Sample Input 2:
3
9 -4 3
1 10
Sample Output 2:
Error
 */

class Less14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
            int a = sc.nextInt(), b = sc.nextInt();
            if (a >= 0 && a <= n-1 && b >= 0 && b <= n-1 && a != b) // a >=0  ghjdthrf yf (-)i элемент
            {
                int sum = array[a] + array[b];
                System.out.println(sum);
            }
            else
                System.out.println("Error");
        sc.close();
//        System.out.print((a < 0 || b < 0 || a >= n || b >= n) ? "Error" : array[a] + array[b]);


    }
}
 // pflfxf 1.13/ 9
/*
Вводится натуральное число n. На следующей строчке вводятся n целых чисел. Считайте их как массив на n элементов.
Затем вводится число k. Найдите индекс элемента k. Если такого элемента нет в массиве, выведите на экран слово Error.
 */
class Less15 { // 1.13-9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i=0; i<n; i++)
        {
            if (k==array[i])
            {
                System.out.println(i);
                return;                 // ?????
//                break;
            }
        }
        System.out.println("Error");
        sc.close();

    }
}

class Less16 { // 1.13-10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count =0;
        for (int i=0; i<k; i++)
        {
                count += array[i];

        }System.out.println(count);

        sc.close();

    }
}

class Less17 { // 1.13-7
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        for (int i=1; i<n; i++)
        {
           int sum = array[i]+array[i-1];
            System.out.println(sum+" ");
        }


        sc.close();

    }
}