package Kata.Block_1;

public class Ex_1_3_3 {
    public static void main(String[] args) {
        byte age1 = 2;
        byte age2 = 3;

        System.out.println(getAgeDiff(age1, age2));
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        int a = (int) age1;
        int b = (int) age2;
        int c = age1 > age2 ? age1 - age2 : age2 - age1;
        return (byte) c;
    }
}
