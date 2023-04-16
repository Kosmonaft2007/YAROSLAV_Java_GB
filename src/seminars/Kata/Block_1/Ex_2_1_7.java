package Kata.Block_1;

public class Ex_2_1_7 {

}

enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");
    private String nameDay;

    Day(String nameDay) {
        this.nameDay = nameDay;
    }

    public String getNameDay() {
        return nameDay;
    }

    public String getRusName() {
        return nameDay;
    }

    public boolean isWeekend() {
//        Day day = Day.SATURDAY;
//        switch (day) {
//            case SATURDAY:
//            case SUNDAY:
//                return true;
//            default:
//                return false;
//        }
        boolean boo = (Day.SUNDAY.isWeekend() && Day.SATURDAY.isWeekend()) ? true : false;
        return boo;
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day.isWeekend());
        System.out.println(day.getRusName());
    }
}
