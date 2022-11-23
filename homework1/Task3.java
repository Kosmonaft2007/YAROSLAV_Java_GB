import java.util.Scanner;

public class Task3{
	
	static void calculator(double firstValue, double secondValue, String action) throws Exception{
		double result;
		switch(action){
			case "+": 
				result = firstValue + secondValue;
				System.out.println("Результат: " + result);
				break;
			case "-": 
				result = firstValue - secondValue;
				System.out.println("Результат: " + result);
				break;
			case "*": 
				result = firstValue * secondValue;
				System.out.println("Результат: " + result);
				break;
			case "/":
				if (secondValue == 0){
					System.out.println("На ноль делить нельзя!");
					break;
				}
				result = firstValue / secondValue;
				System.out.println("Результат: " + result);
				break;
			default:
				System.out.println("\nНекорректный ввод данных");
				break;
		}
	}
    public static void main(String args[]){
		
	Scanner scan = new Scanner(System.in);
	
	double result;
	
	System.out.print("Введите первое число: ");
	double firstArg= scan.nextDouble();
	System.out.print("\nКакое действие нужно выполнить? Введите знак( + - * / ): ");
	String action = scan.next();
	System.out.print("\nВведите второе число: ");
	double secondArg= scan.nextDouble();
	System.out.println();
	
	try {
		calculator(firstArg, secondArg, action);
	} catch (Exception e) {
		System.out.println("\nНекорректный ввод данных");
	}
	
        
    }
}



