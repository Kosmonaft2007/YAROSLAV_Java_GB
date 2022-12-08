package homework5;

import java.util.*;

/*
Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности.
*/
public class Task2 {

	/*
	метод, проверяет список на одинаковые значения,
	подсчитывает количество повторов этих значений
	и записывает данные в отображение (мар)
	*/
    private static Map<String, Integer> employeesDuplicates(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String name : list) {	// итерируемся по списку
            if (!map.containsKey(name)) {	// проверяем, если такого ключа нет в отображении
                map.put(name, 1);	// добавляем ключ со значением 1
            } else {
                int count = map.get(name);	// узнаем значение по данному ключу
                map.put(name, count + 1);	// переписываем данный ключ с новым, инкрементированным значением
            }
        }
    return map;
    }

	/*
	метод, сортирует сотрудников по значению отображения (мар) (кол-во совпадений имени)
	*/
    private static Map<String, Integer> sortedEmployeesByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());	// записываем в новый список входящее отображение
        list.sort(Map.Entry.comparingByValue(((o1, o2) -> o2 - o1)));	// сортируем список по значению отображения, передав в параметры метод comparingByValue() и компаратор в виде лямбда-выражения (о2 - о1 для сортировки по убыванию)

        Map<String, Integer> result = new LinkedHashMap<>();	// создаем коллекцию на основе LinkedHashMap(), т.к. эта коллекция запоминает порядок добавления
	 for (Map.Entry<String, Integer> entry : list) {	// итерируемся по списку
            result.put(entry.getKey(), entry.getValue());	// добавляем ключ/значение в новое отображение
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



