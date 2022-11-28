/*
В файле содержится строка с исходными данными в такой форме: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */

package homework2.task1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task1 {

    /*
    метод, конвертирует текст из файла в массив строк.
     */
    private static String[] convertFileToStringArray(String path) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            int ch;
            while ((ch = br.read()) != -1) {
                sb.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] array = sb.toString().split("[\\s\\p{Punct}]+");
        // получается такой вывод [, name, Ivanov, country, Russia, city, Moscow, age, null]
        // долго искал, так и не понял, как избавиться от первой пустой строки сразу, пришлось "костыль" придумать))
        String[] temp = new String[array.length - 1];
        System.arraycopy(array, 1, temp, 0, 8);
        return temp;
    }


    /*
    метод создает SQL запрос из массива строк
     */
    private static String createSQLQuery(String[] array) {
        StringBuilder sb = new StringBuilder("SELECT * FROM students WHERE "); // сразу задаем начало строки запроса
        for (int i = 0; i < array.length; i += 2) {
            // если "ключ" совпадает с одним из значений в условии, то выполняем действия
            if (array[i].equals("name") || array[i].equals("country") || array[i].equals("city")) {

                // если "значение" неравно "null", выполняем условие
                if (!array[i + 1].equals("null")) {
                    sb.append(String.format("\"%s\" = ", array[i])); // добавляем "ключ" по индексу к переменной sb
                    sb.append(String.format("\"%s\"", array[i + 1])); // добавляем "значение" по индексу к переменной sb
                } else {
                    continue; // Инчае пропускаем итерацию
                }
                // если следующие "ключ" неравны "age", выполняем действие
                if (!array[i + 2].equals("age")){
                    sb.append(" AND "); // добавляем разделитель AND
                }
            }

            // условие для добавления последней пары "ключ":"значения", если "значение" неравно "null"
            if (array[i].equals("age") && !array[i + 1].equals("null")) {
                sb.append(" AND ");
                sb.append(array[i++]);
                sb.append(" = ");
                sb.append(array[i]);
            }

        }
        sb.append(";");
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = convertFileToStringArray("homeworks/homework2/task1/source.txt");
        System.out.println(Arrays.toString(arr));

        String query = createSQLQuery(arr);
        System.out.println(query);

    }
}
