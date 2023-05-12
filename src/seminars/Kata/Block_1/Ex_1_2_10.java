package Kata.Block_1;

public class Ex_1_2_10 {
    public static void main(String[] args) {
        System.out.println(doubleExpression(2, 3, 4));
    }

    public static boolean doubleExpression(double a, double b, double c) {
//        boolean boo = true;
//        boo = (Math.abs((a + b) - c) <= 1E-4) ? true : false;
        return (Math.abs((a + b) - c) <= 1E-4);
    }
}
