package Kata.Block_1;

public class Ex_1_4_12 {
    public static void main(String[] args) {
        System.out.println(checkWeekend("Sunday"));
    }

    public static String checkWeekend(String weekday) {

        String b = (weekday.equals("Saturday") || weekday.equals("Sunday")) ? "Ура, выходной!" : "Надо еще поработать";
//        String b = (weekday.equals("Sunday")) ? "Ура, выходной!" : "Надо еще поработать";

        return b;
    }
}
