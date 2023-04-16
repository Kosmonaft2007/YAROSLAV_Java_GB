package Library.RegEx;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Split {
    public static void main(String[] args) {
//       d - колличество цифр - 6шт
//      d+ - колличество значений (8 2 4 670) - 4шт

        Pattern p = Pattern.compile("\\d*");
        Matcher m = p.matcher("a8b2c4d670");
        int count = 0;
        while (m.find())
            count++;
        System.out.print(count);
    }
}

class RegEx_Split1 {
    public static void main(String[] args) {


//       d - колличество цифр - 6шт
//      d+ - колличество значений (8 2 4 670) - 4шт

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("a8b2c4d670");
        int count = 0;
        while (m.find())
            count++;
        System.out.print(count);
    }
}


//  ?? РАЗБИТЬ ?? строки на подстроки

// Методы Pattern.split(), String.split()
class RegexDemo51 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+\\s?"); // делим по цифре \d+ и по пробелу \s, ? - пробел может быть или не быть
        String[] words = pattern.split("java5tiger 77 java6mustang");
        System.out.print(Arrays.toString(words));
    }
}

// - Класс String определяет такой же метод split():
class RegexDemo61 {
    public static void main(String[] args) {
        String str = "java5tiger 77 java6mustang";
        String[] words = str.split("\\d+\\s?");
        System.out.print(Arrays.toString(words));
    }
}


class RegexArchie {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("ab2c4d67");
        int count = 0;
        while (m.find())
            count++;
        System.out.print(count);


    }
}