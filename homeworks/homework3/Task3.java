package homework3;

import java.util.*;

/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
 */
public class Task3 {

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

    public static void main(String[] args) {
        List<Integer> list = randomNumber(20, 1000);
        System.out.printf("Исходный список: %s\n", list);

        // находим значения минимум, максимум и среднее арифметическое с помощью Stream API
        // чтобы определить значения минимум, максимум нужно передать в параметры потока переопредленный метод compare, класса-обертки Integer
        Optional<Integer> max = list.stream().max(Integer::compare);
        Optional<Integer> min = list.stream().min(Integer::compare);
		
        // преобразуем поток в IntStream с помощью mapToInt, вызываем метод average, 
	 // который возвращает объект типа OptionalDouble, проебразуем его в Double методом getAsDouble.
        Double avg = list.stream().mapToInt(i -> i).average().getAsDouble();
		
        System.out.printf("Минимальное значение: %s\n", min.get());
        System.out.printf("Максимальное значение: %s\n", max.get());
        System.out.printf("Среднее арифметическое: %s\n", avg);
    }
}
