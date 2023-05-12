package src.seminars.Kata.Block_3;

public class Test {
    public static void main(String[] args) {
        int a =4;
        try {
            System.out.println(a/0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
