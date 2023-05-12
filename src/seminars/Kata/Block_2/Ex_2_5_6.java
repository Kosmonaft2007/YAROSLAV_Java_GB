//package src.seminars.Kata.Block_2;
//
//import java.util.Arrays;
//
//public class Ex_2_5_6 {
//    public static void main(String[] args) {
//        byte[] example = {72, 101, 108, 108, 111, 33};
//        AsciiCharSequence answer = new AsciiCharSequence(example);
//        System.out.println("Последовательность - " + answer.toString());//Hello!
//        System.out.println("Размер её - " + answer.length());//6
//        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
//        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
//
//        //проверка на нарушение инкапсуляции private поля
////        System.out.println(answer.toString());//Hello!
////        example[0] = 74;
////        System.out.println(answer.toString());//Hello!
//    }
//}
//
//class AsciiCharSequence extends CharSequence {
//    private byte[] bytes;
//
//    public AsciiCharSequence(byte[] bytes) {
//        this.bytes = bytes.clone();
//    }
//
//    @Override
//    public int length() {
//        return bytes.length;
//    }
//
//    @Override
//    public char charAt(int i) {
//        return (char) bytes[i];
//    }
//
//    @Override
//    public String toString() {
//        return new String(bytes);
//
//    }
//
//    public AsciiCharSequence subSequence(int i, int j) {
//        byte[] ex = new byte[j - i];
//        for (int a = 0; a < j - i; a++) {
//            ex[a] = (byte) this.charAt(i + a);
//        }
//        AsciiCharSequence x = new AsciiCharSequence(ex);
//
////        return x;
//        return new AsciiCharSequence(ex);
//    }
//}
