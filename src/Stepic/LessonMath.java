/*
static double pow(double a, double b)
Метод принимет два аргумента (причём оба типа double) и возвращает значение \large a^{b}a b, также типа double.
Если передать в качестве аргумента целые числа, то они автоматически будут приведены к типу double.

--------------

Имеется также частный случай - экспонента числа x, т.е. \large\mathit{e}^{x}e x
  (\large\mathit{e}e - число Эйлера):

static double exp(double x)

_----------

Math.sin(x) - возвращает синус угла, равного х радиан.

Math.cos(x) - возвращает косинус угла, равного х радиан.

Math.tan(x) - возвращает тангенс угла, равного х радиан.

Math.toDegrees(x) - переводит угол из радиан в градусы.

Math.toRadians(x) - переводит угол из градусов в радианы.

-------

Округление

Класс Math содержит несколько удобных методов для округления чисел.

Math.round(x) - принимает число x типа double и округляет его до ближайшего целого по правилам математического округления. Возвращает целое число типа int.

double x = 25.364789;
System.out.println(Math.round(x));    // 25

Math.ceil(x) - принимает число x типа double и округляет его до ближайшего большего целого, т.е., в сторону плюс-бесконечности. Возвращает число типа double.

double x1 = 25.364789;
System.out.println(Math.ceil(x1));    // 26.0

double x2 = -25.364789;
System.out.println(Math.ceil(x2));    // -25.0

Math.floor(x) - принимает число x типа double и округляет его до ближайшего меньшего целого, т.е., в сторону минус-бесконечности. Возвращает число типа double.

double x1 = 25.364789;
System.out.println(Math.floor(x1));    // 25.0

double x2 = -25.364789;
System.out.println(Math.floor(x2));    // -26.0
Обратите внимание на различие результатов при работе с положительными и отрицательными числами.

К сожалению, эти функции не дают прямой возможности округлять числа до нужного числа десятичных знаков. Поэтому приходится использовать дополнительные вычисления. Округлим число x до трёх знаков после запятой:

double x = 25.364789;
int n = 3;     // количество знаков после запятой
double scale = Math.pow(10, n);
System.out.println(Math.round(x * scale) / scale);    // 25.365
Следует иметь в виду, что такой способ имеет низкую точность из-за погрешностей хранения в памяти компьютера чисел типа double. Однако, для работы с несколькими знаками после запятой этого вполне достаточно.

Если нужно просто вывести число с определённым количеством знаков после запятой, можно использовать для этого форматирование строк:

double x = 25.364789;
String formatted = String.format("%.3f", x);
System.out.println(formatted);    // 25.365

В этом примере мы пользуемся методом format() класса String. В качестве аргументов этот метод получает формат числа -
количество знаков после запятой (.3 - три знака), тип числа (f - число с плавающей точкой) и само число, которое нужно округлить

 */


import java.util.Scanner;

public class LessonMath {
    public static void main(String[] args) {
        int x = - 325;
        int y = Math.abs(x);

        System.out.println(y); // 325
    }
}



//import java.util.Scanner;
 class LessonMath0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt(), y = sc.nextInt();
        int x = 5, y = 2;
        double z;
//        z = Math.pow(5, 2);
        z = Math.pow(x, y);

        System.out.println(z);    // 25.0
    }
}

/*
Дан угол \large\alphaα градусов. Выведите значение угла в радианах.

Sample Input 1:

90
Sample Output 1:

1.5707963267948966
 */

//import java.util.Scanner;
class LessonMath1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
        double z = Math.toRadians(sc.nextDouble());
        System.out.println(z);
    }
}

/*
Дан угол \large\alphaα градусов. Выведите \large y = sin(\alpha ) + cos(\alpha )y=sin(α)+cos(α)..
Sample Input:
90
Sample Output:
1.0
 */
//import java.util.Scanner;
class LessonMath2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Math.toRadians (sc.nextDouble());
        double z = Math.sin(x)+ Math.cos(x);
        System.out.println(z);
    }
}