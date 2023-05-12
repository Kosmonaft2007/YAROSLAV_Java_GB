package Kata.Block_1;

public class Ex_1_2_13 {
    public static void main(String[] args) {
        double area = 123;
        calcCircleRadius(area);
    }

    public static void calcCircleRadius(double area) {
//        double radius = Math.sqrt(area / (Math.PI));
        double r = area / (Math.PI);
        double radius = Math.sqrt(r);
        System.out.printf("%.3f", radius);

//        System.out.printf("%.3f", Math.sqrt(area / ( Math.PI)));
    }
}
