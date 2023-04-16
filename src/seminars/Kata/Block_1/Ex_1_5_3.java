package Kata.Block_1;

public class Ex_1_5_3 {
    public static void main(String[] args) {
        int[] numbers = {96, 81, 11, 6};

        if (numbers.length == 0) {
            return;
        }
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("");
            }
        }
        System.out.print("]");
    }
}
