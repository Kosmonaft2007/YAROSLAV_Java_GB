package Kata.Block_1;

public class Ex_1_3_8 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2));
    }

    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        return Integer.bitCount(value) == 1;

//        boolean boo = false;
//        boo = value != 0 && (value < 0 ? (-value & (-value - 1)) == 0 : (value & (value - 1)) == 0);
//        return boo;
    }
}
