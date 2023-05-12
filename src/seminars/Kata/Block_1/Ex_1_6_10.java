package Kata.Block_1;

public class Ex_1_6_10 {
    public static void main(String[] args) {
        Ex_1_6_10 ex_1_6_10 = new Ex_1_6_10();

System.out.println(ex_1_6_10.parseAndSqrt("64"));

    }

    public long parseAndSqrt1(String number) {
        double num = Long.parseLong(number);
        double num1 = Math.sqrt(num);
        long num2 = Math.round(num1);
        return num2;
    }

    public long parseAndSqrt(String number) {
//        double num = Long.parseLong(number);
//        double num1 = Math.sqrt(num);
//        long num2 = Math.round(num1);
        return Math.round((double)(Math.sqrt(Long.parseLong(number))));
    }
}
