package src.seminars.Kata.Block_3;

import java.math.*;
import java.util.Arrays;

public class Ex_3_1_6 {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();

        if (stackTraceElements.length > 2) {
            StackTraceElement callerElement = stackTraceElements[2];
            return callerElement.getClassName() + "#" + callerElement.getMethodName();
        }
        return null;
    }

}
