import java.util.Scanner;
/*


 */
public class LessonWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();
//        int x = 3; // Вначале необходимо объявить цикл с помощью ключевого слова while.
        while (x>0){  // Далее в круглых скобках располагается условие выполнения цикла, в нашем примере это (x > 0). Условие должно возвращать логическое значение, то есть, false или true.
            System.out.println("Цикл исполняется");
            System.out.println(x);
            x--;  // декремент переменной х: с каждой итерацией цикла значение переменной х уменьшается на единицу, и, рано или поздно, оно перестанет удовлетворять условию x > 0.
        }
        System.out.println("Цикл завершён");

//        int x = 6;
//
//        while (x < 10) {
//            System.out.println("Цикл исполняется");
//            System.out.println("x = " + x);
//            x++;
//        }
//        System.out.println("Цикл завершён");
//        System.out.println("x = " + x);

            /*
            Цикл исполняется
            x = 6
            Цикл исполняется
            x = 7
            Цикл исполняется
            x = 8
            Цикл исполняется
            x = 9
            Цикл завершён
            x = 10
            */

    }
}

/*
На вход подаётся натуральное число n.
Выведите на печать числа от единицы до введённого числа включительно, каждое на новой строке.

Sample Input:

5
Sample Output:

1
2
3
4
5
 */

 class LessonWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        while (a <=n){
            System.out.println(a);
            a++;

        }

    }
}

/*
На ввод подаётся натуральное число n.
Выведите на печать в возрастающем порядке через пробел квадраты натуральных чисел, если эти квадраты не превышают n.

Sample Input:

30
Sample Output:

1 4 9 16 25
 */

//class LessonWhile3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int n = sc.nextInt();
//        int a = 1;
//
//        while (a <=n){
//
//            if(n%n ==0){
//
//            a++;
//        } System.out.println(a);
//
//    }
//    }
//}

    /*
    Считайте со ввода последовательность целых чисел. Последовательность оканчивается числом 0.

    Выведите на печать сумму введённых чисел.

    Sample Input:

    1 2 3 4 5 0
    Sample Output:

    15
     */

class LessonWhile4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
//        int n = sc.nextInt();
        int n;
        int a = 0;
        while ( (n = sc.nextInt()) !=0) {
            a += n;
        }
        System.out.println(a);

    }
    }

    /*
    На вход подаётся последовательность слов. Посчитайте общее количество введённых слов.

Примечание. Так как маркер конца последовательности в этой задаче отсутствует, будет удобно воспользоваться методом hasNext().
Найдите самостоятельно, как он работает.

Sample Input:

Java
Python
C++
Go
PHP
Sample Output:

5
     */
    class LessonWhile5 {                                // страннов но не работает
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите слова:");
//        int n = sc.nextInt();
            int x=0;
            while(sc.hasNext() == true){
                String word = sc.next();
                x++;
            }
            System.out.println(x);
        }
    }

    /*
        String s = sc.next();
        int x = 1;
        while (sc.hasNext()) {
            x++;
            sc.next();
        }
        System.out.println(x);
     */