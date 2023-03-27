package Library.Exception;

public class PerimeterSqiare {
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
