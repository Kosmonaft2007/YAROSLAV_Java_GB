package sem1;

public class Task3 {
    public static void main(String[] args) {
        Person person = new Person();
        person.a = 5;
        person.b = 4;
        int c =person.a + person.b;
        System.out.printf("sum = %s \n", c);
        person.spik();

        Foo t = new Foo();
        t.a = 99;
//        t.b=1;
        System.out.print(t.a);

    }

}

class Person {
    int a;
    int b;

    void spik() {
        System.out.printf("%d", a + b);
    }
}
