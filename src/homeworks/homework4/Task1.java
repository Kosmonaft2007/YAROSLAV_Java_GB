package homework4;

import java.util.*;


/*
Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
*/
public class Task1{
	
	// метод #1: разворачиваем список с помощью метода reverse() класса Collections
	private static void listReverse1(LinkedList<Integer> sourceList) {
		Collections.reverse(sourceList); 	// CheatsMode = "ON";
	}
	
	// метод #2 разворот списка с помощью метода pollLast()
	private static void listReverse2(LinkedList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int last = list.pollLast();	// присвоили значение последнего элемента в переменную и удалили элемент
			list.add(i, last);	// добавляем значение последнего элемента на позицию с индексом i
		}
	}
	
	// метод #3: разворачиваем список с помощью метода descendingIterator() интерфейса Iterator
	private static LinkedList<Integer> listReverse3(LinkedList<Integer> list) {
		LinkedList<Integer> temp = new LinkedList<>();  // создаем новый список
		Iterator<Integer> it = list.descendingIterator();  // указываем, что мы хотим итерироваться по исходному списку начиная с конца
		while(it.hasNext()) {		// итерация по списку
			temp.add(it.next());		// добавляем последний элемент исходного списка в новый
		}
		return temp;
	}

    public static void main(String args[]){
	
	LinkedList<Integer> list = new LinkedList<>();
	for (int i = 0; i < 10; i++) {
		list.add(new Random().nextInt(100) + 1);
	}
	
	System.out.println("======= метод #1 =======");
	System.out.printf("Исходный список: %s\n", list);
	long start = System.nanoTime();
	listReverse1(list);
	long finish= System.nanoTime();
	System.out.printf("Перевернутый список: %s\nВремя выполнения %d наносекунд\n", list, finish - start);
	
	
	System.out.println("======= метод #2 =======");
	System.out.printf("Исходный список: %s\n", list);
	start = System.nanoTime();
	listReverse2(list);
	finish= System.nanoTime();
	System.out.printf("Перевернутый список: %s\nВремя выполнения %d наносекунд\n", list, finish - start);
	
	System.out.println("======= метод #3 =======");
	System.out.printf("Исходный список: %s\n", list);
	start = System.nanoTime();
	LinkedList<Integer> list3 = listReverse3(list);
	finish= System.nanoTime();
	System.out.printf("Перевернутый список: %s\nВремя выполнения %d наносекунд\n", list3, finish - start);
	
    }
}



