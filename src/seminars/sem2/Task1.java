package sem2;

// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.


public class Task1 { 
    public static void main(String[] args) {
        System.out.println(alternatingCharacters(9, 'A', '_'));
    }

    private static String alternatingCharacters (int length, char c1, char c2) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++)
            if (i % 2 == 0)
                builder.append(c1);
            else
                builder.append(c2);
        return builder.toString();
    }
}

