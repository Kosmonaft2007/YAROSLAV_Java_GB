//package Scanner;

import java.util.Scanner;

/*
ФИБОНАЧИ 0 1 1 2 3 5 8 13

Дано натуральное число А>1
Опредилить каким по счету числом Фибоначи оно является? то есть вывести такое число Н

 */
class MyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int i = 1; // цикл начинается с  1
        int f1 = 0;
        int f2 = 1;
        int cur = 1;
        while (cur <= a) {       // 0 1 1 2 3 5 8 13
            cur = f1 + f2;        // 0 +1 = 1 / 1+1 =2 / 1 + 2 =3 .......
            f1 = f2;            // припавниваеи первый цикля для совершения второго, обнуляем и начинаем сначала
            f2 = cur;
            i++;                // шаг цикла
        }
        System.out.println(cur == a ? "По счету число - " + i : -1);  // По чемуто не работает правильно

//        if (cur == a) {
//            System.out.println("По счету число - " + i);
//        } else {
//            System.out.println(-1);     // если число не входит в Фибаначи
//        }
    }
}

/*

 */

/*
ФИБОНАЧИ 0 1 1 2 3 5 8 13

Исполнитель Раздвоитель преодразует натуральные числа
у него есть две команды: Вычесть 1  и разделить на 2.
Первая команда уменьшает на 1 а вторая делит его на 2 если оно четное

A>B

 */

class MyNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a>b) {
            if ((a % 2 == 0) && (a / 2 >= b)) {
                System.out.println(":2");
                a/=2;
            } else {
                System.out.println("-1");
                a -- ;
            }
        }

    }
}



/*
Обработка последовательности,  останавливаем 0
1 7 9 0 5
3
 */

class MyNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
//        int n = sc.nextInt();
        int n;
        int k = 0;

        while ((n = sc.nextInt()) !=0) {   // n = sc.nextInt() считываем в условии так как нужно сделать целый набор цифр, считывает пока не встретит 0
            k +=1;
        }
        System.out.println(k);

    }
}

/*

 */

/*
ССумма последовательности,  останавливаем 0
1 8 9 0 5
18
 */

class MyNumber3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
//        int n = sc.nextInt();
        int n;
        int k = 0;

        while ((n = sc.nextInt()) !=0) {   // n = sc.nextInt() считываем в условии так как нужно сделать целый набор цифр, считывает пока не встретит 0
            k += n; // складываем n числа
        }
        System.out.println(k);

    }
}

/*

 */

/*
средне арифметическое знасчение ,  останавливаем 0
1 7 9 0 5
5.666666
 */

class MyNumber4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
//        int n = sc.nextInt();
        int n;
        int len = 0; // длина
        int sum = 0;

        while ((n = sc.nextInt()) !=0) {   // n = sc.nextInt() считываем в условии так как нужно сделать целый набор цифр, считывает пока не встретит 0
            sum += n; // складываем n числа
            len ++;   //шаг это длина

        }
//        double r = (double) sum/len;
//        System.out.println((r);
        System.out.println((double) sum/len);

    }
}

/*

 */


/*
определить количество четных элементов в последовательности  ,  останавливаем 0
2 1 4 0
2
 */

class MyNumber5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
//        int n = sc.nextInt();
        int n;
        int i = 0;

        while ( (n = sc.nextInt()) !=0) {
            if (n % 2 == 0) { //  определчем четные числа
                i = i +1;
            }
        }
        System.out.println(i);
    }
}

/*

 */

/*Максимум в последовательности   ,  останавливаем 0
2 1 4 9 0
9
 */

class MyNumber6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n;
        int max = 0;

        while ( (n = sc.nextInt()) !=0) {
            max = n;            // работает почемуто !!!!!
//            if (n>max){       //  аналог и то же работает
//                max = n;
//            }
        }
        System.out.println(max);
    }
}

/*

 */

/*
 количество элементов? которые больше предыдущего,  останавливаем 0
1 7 9 0
2
 */

class MyNumber7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n;
        int max = 0;
        int i = 0;
        int index = 0;

        while ( (n = sc.nextInt()) !=0) {
            if (n>max){
                max = n;
                index = i;
                i ++;
            }
        }
        System.out.println(index);
    }
}

/*

 */

/*
 второй МАКсимум в последовательности ,  останавливаем 0
1 7 9 0
7
 */

class MyNumber8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = 0;
        int max1 = n;
        int max2 = -1;
        while ( (n = sc.nextInt()) !=0) {
            if (n > max1){
                max2 = max1;
                max1 = n;
            } else if (n>max2){
                max2 = n;
            }
        }
        System.out.println(max2);
    }
}

/*

 */


/*
 количество =  МАКсимум в последовательности ,  останавливаем 0
1 7 9 9 9 0
3
 */

class MyNumber9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = 0;
        int count = 0;
        int  max = 0;
        while ( (n = sc.nextInt()) !=0) {
            if (n > max){
                max = n;
                count = 1;
            } else if (n == max){
                count ++;
            }
        }
        System.out.println(count);
    }
}

/*

 */

/*
   МАКсимум  количеству подряд в последовательности ,  останавливаем 0
1 7 7 9  0
2
 */

class MyNumber10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = 1;
        int count = 0;
        int  count_max = 0;
        int base = 0;
        while ( (n = sc.nextInt()) !=0) {
            if (base == n){
                count ++;
            } else {
                base = n;
                count = 1;
            }
            count_max = Math.max(count_max, count);
        }

        System.out.println(count_max);
    }
}

/*

 */


class MyNumber1__0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = 0;

        for ( int m = 56; m !=0; m/=10)
        {
            int r = m % 10;
            if (r > x) x = r;
        }
    }
}

