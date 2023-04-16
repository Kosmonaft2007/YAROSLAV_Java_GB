package Kata.Block_1;

public class Ex_1_5_4 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 9, 11, 24};
        int start = 4;
        int end = 10;
        for (int i : getSubArrayBetween(numbers, 4, 10)) {
            System.out.println(i);
        }
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            int k = 0;
//            if (numbers[i] > start && numbers[i] < end) {
//                numbers[k] = numbers[i];
//                System.out.println(numbers[k]);
//            }
//        }


    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {


        int a = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                a++;
            }
        }
        int[] k = new int[a];
        int index = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                k[index] = numbers[i];
                index++;
            }
        }
        return k;
    }

}
