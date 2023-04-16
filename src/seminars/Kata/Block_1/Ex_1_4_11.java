package Kata.Block_1;

public class Ex_1_4_11 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Sunday"));
    }

    public static boolean isWeekend(String weekday) {
        boolean b = false;
        if (weekday.equals("Saturday")) {
            return true;
        }
        if (weekday.equals("Sunday")) {
            return true;
        }
        return b;
    }
}
