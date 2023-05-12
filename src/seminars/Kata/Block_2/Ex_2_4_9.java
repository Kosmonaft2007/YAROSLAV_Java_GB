package src.seminars.Kata.Block_2;

public class Ex_2_4_9 {

    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }


    public static class JavaStudent extends Student {
//        public JavaStudent(String work) {
//            super(work);
//        }

        public JavaStudent() {
            super("Прохожу курс по Java.");
        }

//        public void study() {
//
////            System.out.println("Я очень занят. Прохожу курс по Java.");
//
//        }
    }
}

