package Library.RegEx;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 1. ?? ВЫВЕСТИ ??


public class RegexDemo {
    public static void main(String[] args) {
        String stringPattern = "[a-z]+"; // шаблон, условия поиска
        String text = "code 2 learn java tutorial"; // сам рекст в котором будем искать

        /* объект класса Pattern, у него нет конструктора, но есть статический метод "compile"
         в который передается ШАБЛОН "stringPattern" */
        Pattern pattern = Pattern.compile(stringPattern);
        /* объект класса Matcher, в которыйы передается текст "text" */
        Matcher matcher = pattern.matcher(text);

        // метод "find" ищет совпадения в слове по шоблону, возвращает true
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}


// Сравнение регулярного выражения с текстом
class RegexDemo2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaab"); // aaab - true / aaabb - false
        boolean b = matcher.matches();
        System.out.println(b);
    }
}

//-----------------------
// Простой валидатор ссылки
class RegexDemo3 {
    public static void main(String[] args) {
        System.out.println(test("google.com"));
        System.out.println(test("reference1.ua"));
        System.out.println(test("reference1.org"));
    }

    public static boolean test(String testString) {
        Pattern pattern = Pattern.compile(".+\\.(com|ua|ru)"); // (.) любой сиввол (+) от одного и более // (\.) (com|ua|ru) - или
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
// -----------------


// Регулярное выражение для проверки email

class RegexDemo4 {
    public static void main(String[] args) {
        // (\w{6,} - w от 6 и более) @ (\w+\.  - w от одного и более, до (.))  ([a-z]{2,4}) - латиница от 2 до 4 символов
        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
        String s = "адреса эл.почты:ivanov@gmail.com, sidorov@bsu.by!";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println("e-mail: " + matcher.group());
        }
    }
}


//----------------
class RegexDemo5 {
    public static void main(String[] args) {
        String str = "Version: Java 7, Java 8, Java 9, ;Java 10,";
        String patternStr = "Java\\s+\\d{1,2}";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}


