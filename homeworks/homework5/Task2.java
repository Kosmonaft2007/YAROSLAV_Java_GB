package homework5;

import java.util.*;

/*
Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности.
*/
public class Task2 {

    private static Map<String, Integer> employeesDuplicates(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String name : list) {
            if (!map.containsKey(name)) {
                map.put(name, 1);
            } else {
                int i = map.get(name);
                map.put(name, i + 1);
            }
        }
        return map;
    }

    private static Map<String, Integer> sortedEmployeesByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(((o1, o2) -> o2 - o1)));

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }


    public static void main(String[] args) {

        List<String> employees = new ArrayList<>();
        employees.add("Ivan");
        employees.add("Ivan");
        employees.add("Denis");
        employees.add("Masha");
        employees.add("Alex");
        employees.add("Denis");
        employees.add("Denis");
        employees.add("Ivan");
        employees.add("Misha");
        employees.add("Misha");
        employees.add("Alex");
        employees.add("Ivan");

        Map<String, Integer> countingEmployees = sortedEmployeesByValue(employeesDuplicates(employees));
        System.out.println(countingEmployees);
    }
}



