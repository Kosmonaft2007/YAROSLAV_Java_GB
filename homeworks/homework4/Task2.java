import java.util.*;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.
*/
public class Task2{
	
	private static void enqueue(List<String> list, String element) {
		list.add(element);
	}
	
	private static String dequeue(LinkedList<String> list) {
		return list.pollFirst();
	}
	
	private static String first(LinkedList<String> list) {
		return list.getFirst();
	}

    public static void main(String args[]){
	
	LinkedList<String> list = new LinkedList<>();
	enqueue(list, "zxcv");
	enqueue(list, "abcd");
	enqueue(list, "qwer");
	enqueue(list, "poiu");
	
	
	
	System.out.printf("Исходный список: %s\n", list);
	System.out.printf("Первый элемент из списка: %s\n", dequeue(list));
	System.out.printf("Список после удаления первого значения: %s\n", list);
	System.out.printf("Первый элемент из списка: %s\n", first(list));
    }
}



