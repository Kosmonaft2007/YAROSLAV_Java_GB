package sem2;

public class Task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compress(str));
    }

    private static String compress(String str){
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {

                builder.append((str.charAt(i - 1)));
                builder.append(count);
                count = 1;
            }
        }
        builder.append((str.charAt(str.length() - 1)));
        return builder.toString();
    }
}

