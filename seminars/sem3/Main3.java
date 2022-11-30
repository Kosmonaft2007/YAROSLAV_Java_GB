/*
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
Напишите метод для заполнения данной структуры.
 */
package sem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        List<ArrayList<String>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).add(scanner.nextLine());
            for (int j = 0; j < 3; i++) {

            }
        }
    }
}
