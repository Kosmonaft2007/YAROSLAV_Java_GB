package Library.Exception.Ex_1;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
(кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.


* */
public class Ex3_TwoArr {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 0, 1},
                {1, 0, 1, 1},
                {1, 0, 1, 1},
                {1, 0, 1, 1}};
        System.out.println(sumBinArr(arr));
    }

    public static int sumBinArr(int[][] arr) {
        if (arr.length != arr[0].length) // проверка если массив не квадратный
            throw new RuntimeException("Массв не квадратный");
        int sum = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                sum = ints[j];
                if (ints[j] != 0 && ints[j] != 1)
                    throw new RuntimeException("только значение 0 или 1");
            }

        }
        return sum;
    }
}
