package Kata.Block_1;

import java.math.BigInteger;

public class Ex_1_2_7 {
    public static void main(String[] args) {
        double price = 8.50;
        int count = 2;
        Ex_1_2_7 ex_1_2_7 = new Ex_1_2_7();
//      ex_1_2_7.priceCalculation(price,count);
        System.out.println(ex_1_2_7.priceCalculation(price, count));
        byte varbyte = 0;
        short varshort = 0;
        char varchar = ' ';
        int varint = 0;
        long varlong = 0;
        float varfloat = 0;
        double vardouble = 0;
        boolean varboolean = true;

    }

    public double priceCalculation(double price, int count) {
        double rezult = price * count;
        return rezult;
    }

    public int drawisMonitorsCounter(int monitors, int programmers) {
        int result = monitors % programmers;
        return result;
    }




}
