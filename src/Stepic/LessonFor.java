import java.util.Scanner;
/*


 */
public class LessonFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

                for (int i = 1; i <= 10; i++) {
                    System.out.println("Отлично!");
                }

        System.out.println("Цикл завершён");

    }
}


/*
В качестве условий можно использвать любые логические выражения, главное - чтобы условие однозначно определялось, как true или false.

Счётчик также может иметь любой шаг или быть отрицательным:

for (int i = 5; i < 10; i += 2) {
    System.out.print(i + " "); // 5 7 9
}

for (int i = 5; i > -1; i--) {
    System.out.print(i + " "); // 5 4 3 2 1 0
}

for (int i = 1; i < 10;) {
    System.out.print(i + " "); // Бесконечный цикл
}

 */

 class LessonFor0 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        for (int i = 2; i < 100; i = i * i) {
            System.out.println(i);
        }
        System.out.println("Цикл завершён");

    }
}

/*
На вход подаётся натуральное число n.
Выведите на печать в одной строке через пробел все числа от 1 до n включительно,
которые одновременно без остатка делятся на 2 и на 3. Если таких чисел в диапазоне нет, выведите "Таких чисел нет".

Sample Input 1:

1
Sample Output 1:

Таких чисел нет
Sample Input 2:

20
Sample Output 2:

6 12 18

 */

class LessonFor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n =sc.nextInt();
        int i;
        if(n<6)
        {System.out.print("Таких чисел нет");
        }
        for (i = 6; i<=n; i+=6){
            System.out.print(i + " ");}
        }
    }
/*
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), x = 0;
        input.close();
        if (n < 6) System.out.print("Таких чисел нет");
        else for (int i = 6; i<=n; i+=6) System.out.print(i+" ");
}}
 */


/*
на вход подаётся два натуральных числа - n и m. Напечатайте число n, повторённое m раз в одной строке через пробел.

Sample Input:
3 5
Sample Output:

3 3 3 3 3
 */


//import java.util.Scanner;
class LessonFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число:");
        int n =sc.nextInt();
        int m =sc.nextInt();
        for (int i = 1; i<=m; i++){
            System.out.print(n);
        }
    }
}

/*
лесенка
p
p p
p p p
p p p p
p p p p p

p p p p p
p p p p
p p p
p p
p
 */


//import java.util.Scanner;
class LessonFor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i< 5; i++){         // Этот цикл отвечает за перенос новой строки и инициализацию счётчика)
            for (int j = 0; j<=i; j++) {  // лесенка j<=i
                System.out.print("p");
            }

//            for (int j = 0; j<= 5; j++) {
//                System.out.print("p");  //выводимт в строчку
//            }
            System.out.println(); // переводит на следующую строчку
        }
        // в обратную сторону
        for (int i = 0; i< 5; i++){
            for (int j = 5; j > i; j--) {
                System.out.print("p");
            }
            System.out.println(); // переводит на следующую строчку
        }
    }
}

/*
лесенка
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
 */


//import java.util.Scanner;
class LessonFor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=i; j++) {  // лесенка j<=i
                System.out.print(i + " ");//  операция называется контатинация
            }

//            for (int j = 0; j<= 5; j++) {
//                System.out.print("p");  //выводимт в строчку
//            }
            System.out.println(); // переводит на следующую строчку
        }
        // в обратную сторону
        for (int i = 5; i>=1; i--){
//        for (int i = 1; i<=5; i++){
//            for (int j = 5; j >= i; j--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // переводит на следующую строчку
        }
    }
}

    /*
     1
     2 3
     3 4 5
     5 6 7 8 9
      */

class LessonFor5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<=5; i++){
            for (int j = i; j<=i*2-1; j++) {  // можно поиграться j<=i*2-1 либо  j<=i+i-1
                System.out.print(j + " ");//  операция называется контатинация
            }
            System.out.println(); // переводит на следующую строчку
        }

        }
    }
/*
На вход подаётся два натуральных числа x и y. Выведите на печать прямоугольник из звёздочек размером x*y.

Sample Input:
4 2
Sample Output:
**
**
**
**
 */

//import java.util.Scanner;
class LessonFor6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {  // лесенка j<=i
                System.out.print("*");//  операция называется контатинация
            }
            System.out.println();

        }
    }
}
/*
На вход подаётся несколько целых чисел. Выведите эти числа, возведённые в степени от двух до пяти.

Формат вывода: для каждого введённого числа степени выводятся в отдельной строке через пробел.

Примечание. Каждая строка вывода оканчивается числом, а не пробелом.

Sample Input:

1 2 3
Sample Output:

1 1 1 1
4 8 16 32
9 27 81 243
 */

//import java.util.Scanner;
class LessonFor7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int t, g, f;
//        int m = sc.nextInt();
//        int k = sc.nextInt();

//        for (int i = 1; i <=3; i++){
//            for (int j = i; j<=i*i; j++) {  // можно поиграться j<=i*2-1 либо  j<=i+i-1
//                System.out.print((j*j) + " ");//  операция называется контатинация
//            }
        for (int i=1; i <=n; i=i+n){
            int t = n;
            System.out.print(t + " "+ Math.pow(t, 2) + " "+ Math.pow(t, 3)+ " "+ Math.pow(t, 4));
            }
//        System.out.print("\n");
//        for (int i=1; i <=m; i=i+n){
//            int g = m;
//            System.out.print(g + " "+ g*g + " "+ g*g*g + " "+ g*g*g*g);
//        }
//        System.out.print("\n");
//        for (int i=1; i <=k; i=i+n){
//            int f = k;
//            System.out.print(f + " "+ f*f + " "+ f*f*f + " "+ f*f*f*f + " ");
//        }


        }
    }

    /*
    Напечатайте "лесенку" из чисел от единицы до n, n > 0.
    Примечание. Каждая строка в "лесенке" заканчивается цифрой (не пробелом).
    Sample Input:

    3
    Sample Output:

    1
    1 2
    1 2 3
     */
//import java.util.Scanner;
    class LessonFor8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <=i; j++) {  // можно поиграться j<=i*2-1 либо  j<=i+i-1
          //      System.out.print(j == i ? j : j + " "); // альтернативная запись
                System.out.print(j+(j==i?"\n":" "));
//                System.out.print(j+ " ");//  операция называется контатинация
            }
            System.out.println();
        }
    }
    }

/*
Предположим, что мы работаем с последовательностью такого вида:
1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, ... .
Выведите на печать n (n > 0) членов данной последовательности в одну строку через пробел.
Sample Input:
5
Sample Output:
1 2 2 3 3
*/

//import java.util.Scanner;
class LessonFor9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int longs = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                longs++;
                if(longs>n){break;}  // количество символов в строке ( 5 = 1 2 3 4 5)
                System.out.print(i + " ");
            }
        }
    }
}
/*  Альтернатива

public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        for (int i=1; num > 0; i++)
            for (int j=1; j <= i && num > 0; j++, --num)
                System.out.print(i + " ")
                /*
                чтобы не было пробела в конце
                if (num != 1) {System.out.print(i + " ");}
                else {System.out.print(i);}
 */


/*
Объединим две предыдущие задачи. Выведите "лесенку" из членов последовательности из предыдущего шага от единицы до n, n > 0.
Sample Input 1:
5
Sample Output 1:
1
1 2
1 2 2
1 2 2 3
1 2 2 3 3


        создаём сканнер.
        считываем число введённое пользователем в переменную num
        цикл фор (i = 1; i <= num; i++) { (Этот цикл отвечает за перенос новой строки и инициализацию счётчика)
        создаём счётчик count = 1; (обязательно инициализировать единицей)
        второй цикл фор (j = 1; j <= i; j++) {  (Этот цикл отвечает за то какая цифра будет напечатана)
        третий цикл фор (k = 1; k <= j; k++) {(Отвечает за длину строки, пробелы и счётки++;)
        Если count меньше-ровно i  {
        принт(j);
          }
        Если count меньше i {
           принт(" ");
             }
            count++;
             }
            }
            Если (i меньше num) { (Логическая проверка что бы не сделать лишнюю строку)
             println("");
            }
        }
 */

//import java.util.Scanner;
class LessonFor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int count=1;
        for(int i=1;i <= n;i++){
            int count=1;
            for(int j=1;j<=i;j++){
                for(int k=1;k<=j;k++){
                    if(count<=i){
//                        {break;}
                        System.out.print(j);
                    }
                    if(count < i){ //
                        System.out.print(" ");
                    }
                    count++;
                }
            }
            if (i < n) {
                System.out.println("");
            }
        }
    }
}

/*
sum = sum + 1
 */

/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = input.nextInt(); sc.close();
        for (int k = 1; k <= n; k++) {
            int cnt = 1;
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= i && cnt++ <= k; j++)
                    System.out.print(i + (cnt > k ? "\n" : " "));
}}}}
 */

class LessonFor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i <= n;i++){

            for(int j=1;j<=i;j++){
                for(int k=1;k<=j;k++){
                    System.out.print(j);

                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}

class LessonFor12 {
    public static void main(String[] args) {
        int a = 2;
        System.out.print(a);
    }
}

