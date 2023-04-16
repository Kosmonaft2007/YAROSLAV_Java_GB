package Library.Exception.Ex_1;
/*
* Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
* */
public class Ex_1 {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 6, 7, 8};
        int[] myArray1 = new int[] {1, 3, 4, 6, 7, 8};
        int num = 7;
        System.out.println(muArr(myArray, num));
        System.out.println(muArr(new int[]{1, 3, 4, 6, 7, 8}, num));

    }

    public static int muArr(int[] array, int num) {
        if (array.length < num) {
            return -1;
        } else return array.length;

    }
}
