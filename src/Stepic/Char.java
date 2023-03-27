//import java.util.Locale;
import java.util.Scanner;
//import java.util.SplittableRandom;

import static java.lang.System.*; /// ?????

public class Char {

     public static void main(String[] args) {
//          String str1 = new String();
          String str2 = "abc";
            char c = str2.charAt(1);
          System.out.println(c);


          }
     }
/*
-------------------------------Строки
Дана строка.
Сначала выведите третий символ этой строки.
Во второй строке выведите предпоследний символ этой строки.
В третьей строке выведите первые пять символов этой строки.
В четвертой строке выведите всю строку, кроме последних двух символов.
На пятой строке выведите всю строку, кроме первых 3 символов.
На шестой строке выведите длину данной строки.
Гарантируется, что вводится строчке, состоящая не менее, чем из 5 символов.

Sample Input:
ABCDEFGHI
Sample Output:
C
H
ABCDE
ABCDEFG
DEFGHI
9

 */

 class Char2 { //1.16-2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();
        int length = str.length();
        int length1 = str.length() - 2;
        String allButLast = str.substring(0, length1);
//  ----выведите третий символ этой строки.
        char str1 = str.charAt(2);
//      char str1 = sc.next().charAt(2);
        System.out.println(str1);


// ----Во второй строке выведите предпоследний символ этой строки.
        char str2 = str.charAt(str.length()-2);
        System.out.println(str2);
// --   АЛЬТЕРНАТИВА
        System.out.println( str.charAt(length - 2));

//-----В третьей строке выведите первые пять символов этой строки.
        int star = 0;
        int end = 5;
        char[] dts = new char[end-star];
        str.getChars(star, end, dts, 0);
        System.out.println(dts);
// --   АЛЬТЕРНАТИВА
        System.out.println(str.substring(0,5));


// -----В четвертой строке выведите всю строку, кроме последних двух символов.
        int end1 = 7;
        char[] dts1 = new char[end1-star];
        str.getChars(star, end1, dts1, 0);
        System.out.println(dts1);
// --   АЛЬТЕРНАТИВА
        System.out.println(allButLast);


//      На пятой строке выведите всю строку, кроме первых 3 символов.
        int star2 = 3;
        int end2 = 9;
        char[] dts2 = new char[end2-star2];
        str.getChars(star2, end2, dts2, 0);
        System.out.println(dts2);
// --   АЛЬТЕРНАТИВА
        System.out.println(str.substring(3 , length));

// -----На шестой строке выведите длину данной строки.
        System.out.println(str.length());//      длина массива

    }
}
/*  // --   АЛЬТЕРНАТИВА

    Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] dst = new char[5];
        s.getChars(0,5,dst,0);
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(s.length()-2));
        System.out.println(dst);
        System.out.println(s.substring(0,s.length()-2));
        System.out.println(s.substring(3));
        System.out.println(s.length());
 */

//

class Char3 { //1.16-3
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String replaceString = str3.replace(str1, str2);
        System.out.println(replaceString);

    }
}

/*
 Просто соедини их
Вводится число n, затем n строчек, которые необходимо соединить. После вводится ещё одна строка - которая должна быть в качестве разделителя. Выведите одну строку - все введённые выше слова через разделитель.

Sample Input:

5
Привет
это
курсы
по
Java
-
Sample Output:

Привет-это-курсы-по-Java
 */
class Char4 { //1.16-4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // ввод длины массива строк
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) { // цикл ввода массива строк
            arr[i] = sc.next();
        }
        String word = sc.next(); // ввод разделителя

        System.out.println(String.join(word, arr)); // цикл вывода строки с разделителями
        sc.close();
    }
}

/*
Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра. Определите индексы первого и последнего её вхождения.

Sample Input:

4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
4
Sample Output:

0
28
 */
class Char5 { //1.16-5
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String symbol = sc.next();
        sc.close();
        System.out.println(string.indexOf(symbol));
        System.out.println(string.lastIndexOf(symbol));
        }
    }
/*
  public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String [] arr = str.split("");
        String symbol = in.next();
        in.close();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(symbol))
            {
            System.out.println(i); break;
            }
            }
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i].equals(symbol))
            {
            System.out.print(i); break;
            }
            }
 */

/*
Сколько слов?
Маша и Олег играли в игру. Маша читала статьи в газете и выписывала слова, которые начинаются на её любимую букву
и заканчиваются на любимую букву её друга Олега. Олег же наоборот - слова, которые начинаются на его любимую букву
и заканчиваются на любимую букву Маши. Обратите внимание, что буквы могут быть в разных регистрах (большие/маленькие).
Определите, сколько слов выписали дети.

Формат входных данных:
На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, в которой перечислены слова, которые написаны в газете.

Формат выходных данных:
На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.

Sample Input:

а
в
Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
Sample Output:

2
3
 */

class Char6 { //1.16-6
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String symbol1 = sc.nextLine(); // Маша
        String symbol2 = sc.nextLine(); // Олег

        String[] words = sc.nextLine().toLowerCase().split(" ");
//        String str = sc.nextLine();
//        String str1= str.toLowerCase();
//        String [] words = str1.split(" ");

//        sc.close();

        int numberA = 0;
        int numberB = 0;

//        for (String word : words) {
//            if(word.startsWith(symbol1) && word.endsWith(symbol2)) numberA++;
//            if(word.startsWith(symbol2) && word.endsWith(symbol1)) numberB++;
//        }
        for (int i = 0; i < words.length; i++)
        {
            System.out.println(words[i]);

            if (words[i].startsWith(symbol1) && words[i].endsWith(symbol2)) numberA++;

            if (words[i].startsWith(symbol2) && words[i].endsWith(symbol1)) numberB++;

        }
        System.out.println(numberA);
        System.out.println(numberB);


        /*

        Scanner sca = new Scanner(System.in);
        String buk_ma = sca.nextLine(), // буква Маши
               buk_ol = sca.nextLine(), // буква Олега
               stroka = sca.nextLine(); // вводим строку слов
        int    i      = 0,
               n_ma   = 0, // количество слов Маши
               n_ol   = 0; // количество слов Олега

        stroka = stroka.toLowerCase(); // преобразовываем все буквы - слова к одному (нижнему) регистру
        buk_ma = buk_ma.toLowerCase();
        buk_ol = buk_ol.toLowerCase();

        String[] words = stroka.split(" "); // преобразовываем строку в массив слов
        for(String word : words){                                                 // цикл подсчета слов
            if (words[i].startsWith(buk_ol) && words[i].endsWith(buk_ma)) n_ol++; // для Олега
            if (words[i].startsWith(buk_ma) && words[i].endsWith(buk_ol)) n_ma++; // для Маши
            i++;
        }
        System.out.print(n_ma+"\n"+n_ol); // вывод количества слов

         */
    }
}

/*
Вводится строка, найдите, сколько раз в ней встречается буква "f". Подсчитайте количество вхождений только "маленькой буквы".

Sample Input:

Good morning my dear friend. This is fish.
Sample Output:

2
 */
class Char7 { //1.17-1
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1= str.toLowerCase();
        char[] ch=str.toCharArray();

        int sum =0;

        for (int i = 0; i < ch.length ; i++) {

            if (ch[i] == 'f')
                sum++;
        }
        System.out.println(sum);


    }
}

/*
Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. Найдите, сколько раз в тексте встречается введённый символ в любом регистре. Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.

Sample Input:

Good morning my dear friend. My fish.
m
Sample Output:

3
 */
class Char8 { //1.17-2
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        String str = sc.nextLine();
//        String str1= str.toLowerCase();
//        char[] ch=str1.toCharArray();
//
//        String symvol = sc.nextLine().toLowerCase();
//        char[] ch1 =symvol.toCharArray();
//
//        sc.close();
//
//        int sum =0;
//
//        for (int i = 0; i < ch.length ; i++) {
//            for (int j = 0; j < ch1.length; j++) {
//                if (ch[i] == ch1[j])
//                    sum++;
//            }
//        }
//        System.out.println(sum);

//==-----------

        String str = sc.nextLine().toLowerCase();
        String c = sc.next().toLowerCase();

        char[] arr = str.toCharArray();
        char lit = c.charAt(0);

        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            if ( arr[ i ] == lit)
                count++;
        }
        System.out.println(count);
    }
}

/*
Вводится строка, определите, каких символов в ней больше: цифр или букв? Напоминаю, что знаки препинания и пробелы, например.
не являются ни тем ни другим. Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter".
Если же их равное количество, то выведите слово "Equal".

Sample Input:

34Hi56
Sample Output:

Digit

 */

class Char9 { //1.17-3
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1= str.toLowerCase();
        char[] ch=str1.toCharArray();
        sc.close();
        int number = 0;
        int letter = 0;

        for (int i = 0; i < ch.length ; i++) {
           if (Character.isDigit(ch[i])) number++;
           if (Character.isLetter(ch[i])) letter++;
            }
//        for(char x:s)  {
//            if (Character.isDigit(x)) n++;  // определяем, является ли указанное значение типа char цифрой
//            else if (Character.isLetter(x)) a++;  // определяем, является ли указанное значение типа char буквой
//        }
        if (number>letter) System.out.println("Digit");
        if (number<letter) System.out.println("Letter");
        if (number==letter) System.out.println("Equal");
        System.out.println(number>letter? "Digit" : number<letter ? "Letter" : "Equal");
    }
}

/*
Уберите лишнее
Вводится строка. уберите из неё все символы, которые не являются ни цифрой, ни буквой, ни пробелом.

Sample Input:

Привет, это предложение, в котором %есть лишние ;символы. 45
Sample Output:

Привет это предложение в котором есть лишние символы 45
 */

class Char10 { //1.17-4
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char[] ch=sc.nextLine().toCharArray();
        sc.close();

        for(char x:ch)
        {
            if (Character.isDigit(x) || Character.isLetter(x) || x == ' ' ) System.out.print(x);
        }

    }
}

/*
Вводится строка. определите, является ли она палиндромом. Напоминаю,
что палиндром - это слово/строка, которая читается одинаково слева направо и справа налево. В ответ выведите YES/NO.

Sample Input 1:

Тот
Sample Output 1:

YES
Sample Input 2:

А роза упала на лапу азора
Sample Output 2:

YES

 */

class Char11 { //1.17-5
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        s = s.replaceAll(" ", "");          // удаляем пробелы путемм замены
        StringBuilder word = new StringBuilder(s).reverse();
        if(s.contentEquals(word)) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}