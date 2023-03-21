package Library.Exception;

public class Main {
    public static void main(String[] args) {
        PerimeterSqiare ps = new PerimeterSqiare();
        try {
            ps.getPerimeter("g");
        } catch (PerimeterException e) {
            throw new RuntimeException(e);
        }
    }
}
