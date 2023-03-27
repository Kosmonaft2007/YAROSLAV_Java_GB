/*
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

package homework2.task2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task2 {

    private static void bubbleSort(int[] array) throws IOException {
        Logger log = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("homeworks/homework2/task2/log.txt");
        log.addHandler(fh);

        SimpleFormatter sm = new SimpleFormatter();
        fh.setFormatter(sm);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                log.log(Level.INFO, String.format("Текущее состояние массива чисел: %s", Arrays.toString(array)));
                log.log(Level.INFO, String.format("сравниваем переменные под индексами: %d и %d, значения элементов: %d и %d", j, i, array[j], array[i]));
                if (array[j] < array[i]) {
                    log.log(Level.INFO, String.format("условие верно: %d < %d", array[j], array[i]));
                    int temp = array[j];
                    log.log(Level.INFO, String.format("присвоили переменной temp значение: %d", array[j]));
                    array[j] = array[i];
                    log.log(Level.INFO, String.format("присвоили переменной array[i] значение: %d", array[i]));
                    array[i] = temp;
                    log.log(Level.INFO, String.format("присвоили переменной array[j] значение: %d\n", temp));
                } else {
                    log.log(Level.INFO, String.format("условие неверно: %d > %d", array[j], array[i]));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        int[] arr = new int[]{12, 5, -9, 0, -55, 3, 2, 4, 5, 6, 9, 2};
        System.out.printf("До сортировки %s\n", Arrays.toString(arr));
        bubbleSort(arr);
        System.out.printf("После сортировки %s", Arrays.toString(arr));
    }
}
