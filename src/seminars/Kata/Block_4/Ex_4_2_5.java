package src.seminars.Kata.Block_4;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex_4_2_5 {
    public static void main(String[] args) throws IOException {
        byte[] input = {1, 2, 4, 10, -1};
        InputStream inputStream = new ByteArrayInputStream(input);
        int result = sumOfStream(inputStream);
        System.out.println(result);
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;

        try {
            while (inputStream.available() > 0) //пока остались непрочитанные байты
            {
                int data = inputStream.read(); //прочитать очередной байт
                sum += (byte) data; //добавить его к общей сумме
            }
            inputStream.close(); // закрываем поток
            return sum;

        } catch (Exception e) {
            throw new IOException(e);
        }

//        int sum = 0;
//        while (inputStream.available() > 0) //пока остались непрочитанные байты
//        {
//            int data = inputStream.read(); //прочитать очередной байт
//            sum += data; //добавить его к общей сумме
//        }
//        inputStream.close(); // закрываем поток
//        return sum;
//        System.out.println(sum); //выводим сумму на экран.
    }

}
