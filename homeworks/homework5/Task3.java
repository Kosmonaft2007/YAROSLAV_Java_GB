package homework5;

/*
Реализовать алгоритм пирамидальной сортировки (HeapSort).
*/
public class Task3 {

    /*
    метод сортирует массив по возрастанию
     */
    private static void sort(int[] array) {
        int size = array.length;

        for (int i = size / 2 - 1; i >= 0; i--) {   // Построение кучи
            heap(array, size, i);
        }

        for (int i = size - 1; i >= 0; i--) {   // извлекаем элементы из кучи
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, i, 0);  // Вызываем метод heap на уменьшенной куче
        }
    }

    /*
     метод преобразования в двоичную кучу поддерева с корневым узлом i
     */
    private static void heap(int[] array, int size, int root) {
        int biggest = root; // Инициализируем наибольший элемент как корень
        int leftValue = 2 * root + 1;
        int rightValue = 2 * root + 2;

        if (leftValue < size && array[leftValue] > array[biggest])  // Если левый элемент больше корня
            biggest = leftValue;

        if (rightValue < size && array[rightValue] > array[biggest])     // Если правый элемент больше, чем самый большой элемент на данный момент
            biggest = rightValue;

        if (biggest != root) {    // Если самый большой элемент не корень
            int temp = array[root];
            array[root] = array[biggest];
            array[biggest] = temp;

            heap(array, size, biggest);   // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 0, 2, 15, 12, 10, -5, 8, -2};
        long start = System.nanoTime();
        sort(array);
        long finish = System.nanoTime();

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.printf("\nСкорость алгоритма в наносекундах: %d", finish - start);
    }
}