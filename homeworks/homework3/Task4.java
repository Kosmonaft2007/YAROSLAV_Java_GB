package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:

Разность:
A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
B - A = все числа из второй коллекции, которые не содержатся в первой

Симметрическая разность:
A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
 */
public class Task4 {

    private static List<Integer> randomNumber(int capacity, int maxRandomValue) {
        List<Integer> list = new ArrayList<>(capacity);

        for (int i = 0; i < capacity; i++) {
            list.add(new Random().nextInt(maxRandomValue) + 1);
        }
        return list;
    }

    private static List<Integer> divisonLists(List<Integer> firstList, List<Integer> secondList) {
        for (int i = 0; i < firstList.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (firstList.get(i) == secondList.get(j)){
                    firstList.remove(i);
                    i--;
                    break;
                }
            }
        }
        return firstList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = randomNumber(10, 20);
        List<Integer> list2 = randomNumber(10, 20);

        System.out.println("Первый список: " + list1);
        System.out.println("Второй список: " + list2);

        System.out.println("Числа из первой коллекции, которые не содержатся во второй: " + divisonLists(list1, list2));
        System.out.println("Числа из второй коллекции, которые не содержатся во первой: " + divisonLists(list2, list1));


    }
}
