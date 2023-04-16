package Kata.Block_1;

public class Ex_1_3_2 {
    public static void main(String[] args) {
//        char r = 92;
//        int d = r + 5;
//        System.out.println(d);
        System.out.println(charExpression(51));
    }

    public static char charExpression(int a) {

        char r = '\'';
        int rr = (int) r;
        int d = rr + a;
        char chh = (char) d;
        return chh;
    }

}