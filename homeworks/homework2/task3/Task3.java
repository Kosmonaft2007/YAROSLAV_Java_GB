/*
В файле содержится строка с данными:

[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:

Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */

package homework2.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    /*
    метод конвертирует текст из файла в массив строк
     */
    private static String[][] fileToStringArray(String path) {
        // чтение данных из файла
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int ch;
            while ((ch = br.read()) != -1) {
                sb.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // разделяем строку по пробелам
        String[] array = sb.toString().split("\\s");

        String[][] temp = new String[array.length][6];

        // используем шаблон регулярного выражения для разделения строки только по символьным значениям
        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher;

        for (int i = 0; i < array.length; i++) {
            matcher = pattern.matcher(array[i]); // проверяем элемент массива по заданному шаблону
            int j = 0;
            while (matcher.find()) { // цикл выполняется пока есть соответствия по шаблону
                temp[i][j] = matcher.group(); // добавляем значение в массив
                j++;
            }
        }
        return temp;
    }

    /*
    метод выводит обрабатывает информацию о студентах,
    форматирует строку с помощью StringBuilder и возвращает в виде строки.
     */
    private static String studentsInfo(String[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(String.format("студент %s получил %s по предмету %s\n", array[i][1], array[i][3], array[i][5]));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String[][] arr = fileToStringArray("homeworks/homework2/task3/source.txt");

        System.out.println(studentsInfo(arr));
    }
}
