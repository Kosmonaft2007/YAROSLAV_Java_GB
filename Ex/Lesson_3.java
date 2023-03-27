package Ex;

import java.util.Scanner;

//  угадай число

public class Lesson_3 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Ваше задача угадать число");

        int range = 30;
        int number = (int) (Math.random() * range);
        /*
        ВНИМАНИЕ
        Math.random() генирирует дробные числа
        + (int) отсекаем дробные части
         */
        playLevel(range, number);
        sc.close(); // очищаем память? желательно
    }
        private  static void  playLevel(int range, int number)
        {
            while (true) {    // бесконечный цикл while (true)
                System.out.println("угадайте число от 0 до " + range);
                int input_number = sc.nextInt(); // читаем из консоли

                if (input_number == number) {
                    System.out.println("Вы угадали");
                    break;
                } else if (input_number > number) {
                    System.out.println("Загаданное число меньше ");
                } else {
                    System.out.println("Загаданное число больше");
                }
            }
        }

}
