import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Object;


/*
Добавление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список,
в котором будут хранится строковые представления чисел от 0 до n-1.
Затем программа считывает число m (m <= n) и строку s. Вставьте строку s на позицию m.
Выведите список на экран через пробел.

Sample Input:

5
2
Строка
Sample Output:

0 1 Строка 2 3 4
 */

 class ArratList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list= new ArrayList<>(n);
        for (int i = 0; i<n; i++){
//            list.add(i, ""+i);
            list.add(i, Integer.toString(i)); // Integer.toString(i) ????????
        }
//        System.out.println(list);

        int m = sc.nextInt();
        String text = sc.next();


        list.add(m,text);

//        String listString = String.join(" ", list);
//
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
/*
Удаление элемента
Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут
хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m < n).
Удалите  элемент на позиции m. Выведите список на экран через пробел.

Sample Input:

5
2
Sample Output:

0 1 3 4
 */

 class ArratList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> list= new ArrayList<>(n);
        for (int i = 0; i<n; i++){
//            list.add(i, ""+i);
            list.add(i, Integer.toString(i)); // Integer.toString(i) ????????
        }
//        System.out.println(list);

        int m = sc.nextInt();


        list.remove(m);

//        String listString = String.join(" ", list);
//
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}

/*
Очередь
Напишите программу, которая реализует структуру данных очередь, используя список.

Условие задачи таково: пользователь листает список музыки и добавляет в плейлист понравившиеся ему композиции. Когда песня доигрывает, включается следующая. Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.

Сначала вводится число n - количество запросов к вашей программе. Каждый из запросов будет иметь один следующих видов:

push <Название трека> - добавляет трек в плейлист
pop - удаляет из плейлиста первый трек. При этом на экран выводится запись вида "воспроизводится <название трека>"
После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека состоит из одного слова.

Sample Input:

4
push Трек1
push Трек3
pop
push ТрекТрек
Sample Output:

воспроизводится Трек1
Трек3 ТрекТрек
 */
