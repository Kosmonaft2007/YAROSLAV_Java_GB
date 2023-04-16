package Kata.Block_1;

import java.math.BigInteger;

public class Ex_1_2_14 {
    public static void main(String[] args) {
        maxLongSqr();

    }

    public static void maxLongSqr() {
        long l1 = Long.MAX_VALUE;
        BigInteger lL = BigInteger.valueOf(l1);
        lL = lL.multiply(lL);
//        long mul = lL.longValue();

        System.out.print(lL);
    }
}
