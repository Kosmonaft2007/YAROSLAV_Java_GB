package src.seminars.Kata.Block_2;

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

//        switch (this) {
//            case SATURDAY:
//            case SUNDAY:
//                return true;
//            default:
//                return false;
//        }
        return (SATURDAY == this) || (SUNDAY == this);

    }
}
// Второй вариант
 enum Day1 {
    MONDAY("Понедельник", false),
    TUESDAY("Вторник", false),
    WEDNESDAY("Среда", false),
    THURSDAY("Четверг", false),
    FRIDAY("Пятница", false),
    SATURDAY("Суббота", true),
    SUNDAY("Воскресенье", true);

    final String rusName;
    final boolean isWeekend;

    Day1(String rusName, boolean isWeekend) {
        this.rusName = rusName;
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public String getRusName() {
        return rusName;
    }

}
