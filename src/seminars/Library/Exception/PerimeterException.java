package Library.Exception;
// При создании собственной ошибки называть файл nameException и наследоваться от extends Exception
public class PerimeterException extends Exception{

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
