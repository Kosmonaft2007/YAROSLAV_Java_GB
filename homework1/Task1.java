/*
	1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/
public class Task1{
	
	// треугольное число
	static int triangle_sum(int num){
		if (num == 1){
			return 1;
		}
		return triangle_sum(num - 1) + num;
	}
	// произведение чисел
	static int factorial(int num){
		if (num == 1){
			return 1;
		}
		return factorial(num - 1) * num;
	}
	
    public static void main(String args[]){
	
       int result = triangle_sum(4);
	System.out.println("треугольного число = " + result);
	result = factorial(4);
	System.out.println("произведение чисел (факториал) = " + result);
	
    }
}



