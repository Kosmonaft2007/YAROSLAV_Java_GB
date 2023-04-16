package Kata.Block_1;
/*
Так как рекурсия, в одну строчку не решить, так как есть базовый сценарий и рекурсивный.
Начинаем с базового:
if (value равно ноль или равно 1)
return 1 (предварительно закастив его к Биг интеджеру);
else
return Biginteger(кастим наш инт к биг интеджеру).multiply(копируем функцию/метод из задания, с префиксным декрементом --).
* */

import java.math.BigInteger;

public class Ex_1_4_8 {
    public static void main(String[] args) {
        int value = 3;
        System.out.println(factorial(value));
        System.out.println(getFactorial(value));
    }

    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }
}
