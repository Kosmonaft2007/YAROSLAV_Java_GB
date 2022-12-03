package sem4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая — последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> deque = new LinkedList<>();

        while (true) {
            System.out.println("enter any text: ");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            } else if (input.equals("print")) {
                System.out.println(deque);
            } else if (input.equals("revert")) {
                System.out.println(deque.pollFirst());
            } else {
                deque.addFirst(input);
            }
            System.out.println(deque);
        }
        scanner.close();
    }
}
