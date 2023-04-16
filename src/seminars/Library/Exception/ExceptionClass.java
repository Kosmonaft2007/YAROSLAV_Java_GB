package Library.Exception;

public class ExceptionClass {
    public static class Main {
        public static void main(String[] args) {
            PerimeterSqiare ps = new PerimeterSqiare();
            try {
                ps.getPerimeter("9");
            } catch (PerimeterException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // При создании собственной ошибки называть файл nameException и наследоваться от extends Exception
    public static class PerimeterException extends Exception{

        // определить все конструкторы

    //
        public PerimeterException() { // пустой
        }

        public PerimeterException(String message) { // принимать сообщение которое мы хотим передать пользователю
            super(message);
        }

        public PerimeterException(String message, Throwable cause) { // передать сообщение с причиной Throwable cause
            super(message, cause);
        }

        public PerimeterException(Throwable cause) { // причина
            super(cause);
        }

        public PerimeterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }

    public static class PerimeterSqiare {
        public  void getPerimeter(String str) throws PerimeterException {
            Square square = new Square();

            try {
                double side = Double.parseDouble(str);
                square.setSide(0);
            }catch (NumberFormatException e){
                throw new PerimeterException("String is incorrect",e);
            } catch (PerimeterException ex) {
                System.err.println(ex.getMessage());
            }


       /*
         public  void getPerimeter() throws PerimeterException {
            Square square = new Square();
         try {
                square.setSide(0); // Мы ввели значение
            } catch (PerimeterException e) {
    //            throw new RuntimeException(e);
                System.err.println(e.getMessage()); // System.ERR.println - подсветит красным
            }*/
        }
    }

    public static class Square {
        private double side;

        public double getSide(){
            return side;
        }

        public void setSide(double side) throws PerimeterException {
            if (side<=0){ // если сторона меньше или 0
                throw new PerimeterException("Side is incorrect");
            }
            this.side = side;
        }
    }
}
