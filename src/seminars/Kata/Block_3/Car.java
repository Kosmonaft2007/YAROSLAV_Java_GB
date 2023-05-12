package src.seminars.Kata.Block_3;

public class Car implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("Машина закрывается...");
    }

    public static void drive() {
        System.out.println("Машина поехала.");
    }

    public static void main(String[] args) {
        try (Car c = new Car()) {
            c.drive();
        } catch (Exception ignore) {
            System.out.println("Машина поехала.");
        }
    }
}


