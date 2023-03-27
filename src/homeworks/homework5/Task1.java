package homework5;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что один человек может иметь несколько телефонов
*/
public class Task1 {

    /*
    метод, использует регулярное выражение для проверки
    правильности ввода номера телефона
    */
    private static boolean isPhoneNumber(String phone) {
        Pattern pat = Pattern.compile("^([8]){1}[9]{1}[0-9]{9}");
        Matcher mat = pat.matcher(phone);
        return mat.find();
    }


    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter name or \"quit\" for exit: ");
            String name = scan.nextLine();  // запрос ввода имени (ключ)
            if (name.equals("quit")) break; // проверка команды для "выход"

            String phone = "";
            do {
                System.out.print("Enter phone (format numbers example: 89876543210\n>>>");
                phone = scan.nextLine();    // запрос ввода номера телефона (значение)
            } while (!isPhoneNumber(phone));  // проверка корректности номера телефона

            if (!phoneBook.containsKey(name)) {     // проверка присутствия ключа в словаре
                phoneBook.put(name, new ArrayList<>()); // добавляем новое ключ/значение в словарь
                phoneBook.get(name).add(phone); // добавляем номер телефона в значение, которое содержит список
            } else {
                phoneBook.get(name).add(phone); // если ключ уже есть в словаре, добавляем значение в список, который находится по указанному ключу
            }
        }

        System.out.println(phoneBook);
    }
}



