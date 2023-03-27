package homework1;

/*
	2. Вывести все простые числа от 1 до 1000
*/
public class Task2{

	static void ordinarNums(int num){
		// делал несколькими способами эту задачу и по времени выполнения этот самый оптимальный
		long  start = System.currentTimeMillis(); // замер времени начала работы метода
		for (int i = 1; i <= num; i++) {	// проходим в цикле от 1 до num
			int count = 0	;	// счетчик делителей
			for (int j = 1; j <= i; j++) {	// проходим в цикле до значения равного делимому
				if (i % j == 0) {
					count++;	// добавляем 1 к счетчику, если i делится на j без остатка
				}
				if (count > 2){	// если счетчик(count) > 2, прерываем текущую итерацию
					break;
				}
			}
			if (count <= 2) {	
				System.out.println("найдено простое число: " + i); // выводим число в консоль, если count <= 2
			}
		}
		long  finish = System.currentTimeMillis(); // замер времени окончания работы метода
		System.out.println("Время выполнения метода: " + (finish - start));
	}
	
    public static void main(String args[]){

        ordinarNums(1000);
		
    }
}



