package Kata.Block_1;

public class Ex_1_4_10 {
    public static void main(String[] args) {
        System.out.println(isWeekend1("Sunday"));
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
    public static boolean isWeekend1(String weekday) {
 return (weekday.equals("Saturday")|| weekday.equals("Sunday"));
    }
}
