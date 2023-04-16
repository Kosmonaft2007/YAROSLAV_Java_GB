package Kata.Block_1;

public class Ex_1_6_8 {
    public static void main(String[] args) {
        Ex_1_6_8 ex_1_6_8 = new Ex_1_6_8();
        ex_1_6_8.parseAndPrintNumber("12345");
    }

    public void parseAndPrintNumber(String str) {
        int num = Integer.parseInt(str);
        int result = num / 2;

        System.out.println(result);
    }

}
