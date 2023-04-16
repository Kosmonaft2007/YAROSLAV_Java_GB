package Library.Array;
/*
*Метод Arrays.deepToString() языка Java возвращает строковое представление многомерного массива, выделяя строки квадратными скобками:
* */

import java.util.Arrays;

public class ArraysDeepToString {
    public static void main(String[] args) {
        String[][] array = {{"один-один", "один-два", "один-три"},
                {"два-один", "два-два", "два-три"}};
        System.out.println(Arrays.deepToString(array));
    }
}
