package src.seminars.Kata.Block_2;

import sem6.Cat;

public class Ex_2_1_6 {
    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }

        public void catchCat(Cat catchCat) {
            System.out.println("Кошка поймана");
            sayHello();
            catchCat.sayHello();
        }
    }

}