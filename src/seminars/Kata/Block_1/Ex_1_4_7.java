package Kata.Block_1;

import java.math.BigInteger;

public class Ex_1_4_7 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
//        System.out.println(fac(3));
    }


    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            BigInteger ii = BigInteger.valueOf(i);
            result = result.multiply(ii);
        }
        return result;
    }

    public static int fac(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return result;
    }
}
