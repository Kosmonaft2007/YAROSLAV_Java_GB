/*
Реализовать алгоритм сортировки слиянием.
 */
 import java.util.Arrays;

//package homework3;

public class Task1 {
	
	/*
	Метод сортирует массив чисел по возрастанию (сортировка слиянием)
	*/
	private static int[] doSort(int[] items) {
    		int size = items.length;
    		if (size == 1)		//условие завершения рекурсивного вызова метода 
    			return items; 

    		int half = size/2; // получаем значение середны массива
    		int[] leftSide= Arrays.copyOf(items, half);	// копируем левую часть массива в новый массив
    		int[] rightSide = Arrays.copyOfRange(items, half, size); // копируем правую часть массива в новый массив

    		doSort(leftSide);	// вызываем рекурсивно метод для левой части массива 
    		doSort(rightSide);		// вызываем рекурсивно метод для правой части массива 

    		merge(leftSide, rightSide, items);	// взываем метод слияния двух массивов
		return items;
	}
	
	/*
	метод выполняет слияния двух частей исходного массива
	*/
	private static void merge(int[] leftSide, int[] rightSide, int[] source) {
    		int leftIndex = 0;
    		int rightIndex = 0;
    		int index = 0;

		
    		while (leftIndex < leftSide.length && rightIndex < rightSide.length) {
			/*
			сравниваем числа из двух частей массива,
			берем по одному числу из каждого массива и сравниваем их,
			меньшее число кладем в исходный массив, 
			затем инкрементируем индекс того массива, из которго мы взяли значение.
			(для обратного порядка сортировки поменять знак сравнения на ">")
			*/
        		if (leftSide[leftIndex] < rightSide[rightIndex]) {  
            			source[index] = leftSide[leftIndex];
            			leftIndex++;
        		} else {
            			source[index] = rightSide[rightIndex];
            			rightIndex++;
        		}
        		index++;
    		}
		// собираем исходный массив из 
    		System.arraycopy(leftSide, leftIndex, source, index, leftSide.length - leftIndex);
    		System.arraycopy(rightSide, rightIndex, source, index, rightSide.length - rightIndex);
	}
	
	
    public static void main(String[] args) {
		int[] arr = new int[]{56,89,0,7,57,3, -8,5,23,45};
		System.out.printf("Source array = %s\n", Arrays.toString(arr));
		System.out.printf("After sorted array = %s", Arrays.toString(doSort(arr)));
		
    }
}
