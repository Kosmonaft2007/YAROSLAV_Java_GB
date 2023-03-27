package Library.String_Char;

public class String_Char {

    public static void main(String_Char[] args) {

        // String не изменяемый объект

        String str1 = null; // объект не пустой, он как бы повис в воздухе и не существует

        String str2 = "";   // пустой объект и не указывает на объект
        if (str2.length() == 0) System.out.println("пустая");
        if (str2.isEmpty()) System.out.println("пустая"); // метод isEmpty проверяет пустая стока или нет
        if (!str2.isEmpty()) System.out.println("не пустая пустая");

        String str3 = "Hello World"; // строка это массив символов с 0123;
        System.out.println(str3.length()); // длину массива? количество всх элементов  с 1234

        String str4 = new String(); // вызволи контруктор и не чего не передали, поэтому она пустая


        String str6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'}, 2, 3); // char[] используем одинарные ковычки - '' 2 - считываем со второго индекса;  считываем 3 индекса
        System.out.println(str6);
        char[] array = str6.toCharArray(); // переводим в строку (в массив символов)
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
// ---------- Объединение строк

        String str5 = "Hello" ;
        String str7 = "world" ;

        String str8 = str5 + "," + str7 + 2022 ;
        System.out.println(str8);

        str5=str5.concat(str7) ; // объединяет подстрочки без раздилителя
        System.out.println(str5);

        String str9 = String.join("- ",str5, str7); // объединяет подстрочки с раздилитем, метод является статическим

// --------- вывод символов
        char ch = str5.charAt(1); // принимает индекс по которомы нужно возвратить символ
        System.out.println(ch); // e

        String str10 = "First home work";
        int start = 5;
        int end = 9;
        char[] dst = new char[end - start]; // создали массив длиной "end - start"
        str10.getChars(start,end,dst, 0); //так как массссив пустой начанием с 0
        System.out.println(dst);


        String str11 = "Lesson.txt";
        boolean starts = str11.startsWith("Le"); //  проверяет начинается строка
        boolean ends = str11.endsWith("txt"); //  проверяет заканчивается  строка
        System.out.println(starts +""+ ends);

        //  ------- Замена

        String replaceString = str11.replace('L', 'H');
        String replaceString1 = str11.replace("Hello", "Bye");
        System.out.println(replaceString);
        System.out.println(replaceString1);

        //  -------  Зегистр

        System.out.println(str11.toLowerCase());    // переводит все в малый регистр
        System.out.println(str11.toUpperCase());    // переводит все в большой  регистр

        //  -------  Разделить строку на массив строк

        String str12 = "Первое второе третье четвертое ";
        String [] words = str12.split(" "); // разделителем тут пустая строка " "
        for (String word: words)
        {
            System.out.println(word);
        }




    }
}
