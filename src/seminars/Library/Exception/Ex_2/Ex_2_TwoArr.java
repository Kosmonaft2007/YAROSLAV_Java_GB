package Library.Exception.Ex_2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
*
следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный.
В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?,
* заменить его на соответствующее число.Если на каком-то месте встречается символ,
* отличный от числа или ?, бросить подходящее исключение.Записать в тот же файл данные с
* замененными символами ?.
* */
public class Ex_2_TwoArr {
    public static void main(String[] args) {
        String[][] arr;
        try(FileReader reader = new FileReader("notes.txt"))
        {
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}
