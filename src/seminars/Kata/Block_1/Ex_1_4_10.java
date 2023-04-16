package Kata.Block_1;

public class Ex_1_4_10 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Sunday"));
    }

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Saturday":
                return true;
            case "Sunday":
                return true;
            default:
                return false;
        }
    }
}
