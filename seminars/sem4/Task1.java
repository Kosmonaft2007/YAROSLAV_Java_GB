package sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* ARRAY LIST

Реализовать консольное приложение, которое в цикле:
Принимает от пользователя строку вида
text~num
Нужно разделить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {
            System.out.println("enter text: ");
            String input = scanner.nextLine(); //ввод данных пользователя

            String[] textAndNum = input.split("~"); // разделяем строку по указанному разделителю в методе split
            if (textAndNum[0].equals("quit")) { // завершение программы
                break;
            }

            if (textAndNum.length < 2) {    // проверка на некорректное значение
                System.out.println("incorrect input");
                continue;
//                throw new IllegalStateException("incorrect input");
            }
            int i = Integer.parseInt(textAndNum[1]);

            if (textAndNum[0].equals("print")) {
                System.out.println(list.get(i));
                // УДАЛЕНИЕ ИЗ СПИСКА
                list.remove(i); // по индексу
//                cats.remove(philipp); // по ссылке
                continue;
            }

            list.add(i, textAndNum[0]);
            System.out.println(list);

        }
        scanner.close();
    }
}
