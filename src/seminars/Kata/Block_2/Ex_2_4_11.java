package src.seminars.Kata.Block_2;

public class Ex_2_4_11 {

    public static void main(String[] args) {
        Student student = new Student();
        student.study();// Вывод: Животное издает звук
        LazyStudent jS = new LazyStudent();
        jS.study();
//            Cat myCat = new Cat();
//            myCat.voice(); // Вывод: Кошка мяукает: Мяу-мяу!
    }
}

class Student {
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


class LazyStudent extends Ex_2_4_9.Student {
    public LazyStudent() {
    }

    @Override
    public void study() {

        System.out.println("Сегодня не учусь, мне лень.");

    }
}



