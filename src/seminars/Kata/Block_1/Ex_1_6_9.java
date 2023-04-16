package Kata.Block_1;

public class Ex_1_6_9 {
    public static void main(String[] args) {
        String str = "1Was it, a@@ cat I saw?1";
        System.out.println(isPalindrome(str));
    }

    //    public static Boolean isPalindrome(String text) {
//        if ("".equals(text) || text == null) {
//            return false;
//        }
//        String str = text.toLowerCase().replaceAll("\\p{Punct}|\\p{Space}", "");
//        StringBuilder sb = new StringBuilder(str).reverse();
//        boolean boo = (!str.equals(sb.toString())) ? false : true;
//
//        return boo;
//    }
    public static boolean isPalindrome(String text) {
        String replace = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder stringBuilder = new StringBuilder(replace);
        stringBuilder.reverse();
        String revers = stringBuilder.toString();
        return replace.equalsIgnoreCase(revers);
    }
}
