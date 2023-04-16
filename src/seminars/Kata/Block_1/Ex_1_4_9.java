package Kata.Block_1;

public class Ex_1_4_9 {
    public static void main(String[] args) {
        Ex_1_4_9 ex_1_4_9 = new Ex_1_4_9();
        int age = 9;
        System.out.println(ex_1_4_9.determineGroup(age));
    }

        public int determineGroup (int age ) {
            int a = 0;
            if (age >= 7 && age <= 13) {
                a = 1;
            } else if (age >= 14 && age <= 17) {
                a = 2;
            } else if (age >= 18 && age <= 65) {
                a = 3;
            } else {
                a = -1;
            }
            return a;
        }
    }

