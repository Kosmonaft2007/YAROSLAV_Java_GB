package Kata.Block_1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Ex_1_2_9 {
    public static void main(String[] args) {
        System.out.println(doubleExpression(2.00001, 3.00001, 5.00004));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        BigDecimal aA = BigDecimal.valueOf(a).setScale(4, RoundingMode.HALF_UP);
        BigDecimal bB = BigDecimal.valueOf(b).setScale(4, RoundingMode.HALF_UP);
        BigDecimal cC = BigDecimal.valueOf(c).setScale(4, RoundingMode.HALF_UP);
        aA = aA.add((bB));
//        double aAA = aA.doubleValue();
//        double aCC = cC.doubleValue();
        boolean boo = (cC.equals(aA)) ? false :true ;
        return boo;
    }
}
