package sem1;

public class Foo {
   public Integer a;

    public Foo(Integer a) {
        this.a = a;
    }

    public Foo() {

    }

    @Override
    public String toString() {
        return a.toString();
    }
    /*   @Override
    public String toString() {
        return "TASK33{" +
                "a=" + a +
//                ", b=" + b +
                '}';
    }*/
}
