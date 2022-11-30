package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */
public class Task2 {

        /*
        Метод генерирует список случайных чисел
        @capacity - задаем размер списка
        @maxRandomValue - максимальное значение генерируемое классом Random
         */
        private static List<Integer> randomNumber(int capacity, int maxRandomValue) {
            List<Integer> list = new ArrayList<>(capacity);

            for (int i = 0; i < capacity; i++) {
                list.add(new Random().nextInt(maxRandomValue) + 1);
            }
            return list;
        }

    /*
    Метод удаляет все четные значения из указанного списка
     */
    private static void removeEvenNumbers(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--; //используем декримент i, так как при удалении элемента из списка, массив элементов смещается влево
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> list = randomNumber(20, 100);
        System.out.printf("Исходный список: %s\n", list);

        removeEvenNumbers(list);
        System.out.printf("Список после удаления четных чисел: %s", list);
    }
}
