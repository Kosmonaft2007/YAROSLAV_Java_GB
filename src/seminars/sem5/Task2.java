package sem5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

public class Task2 {
    public static void main(String[] args) {
        printResult("a+(d*3)");
        printResult("[a+(1*3)");
        printResult("[6+(3*3)]");
        printResult("{a}[+]{(d*3)}");
        printResult("<{a}+{(d*3)}>");
        printResult("{a+]}{(d*3)}");
    }

    static boolean areBracketsPaired(String expression) {
        HashMap<Character, Character> openingToClosingBrackets = new HashMap<>();
        openingToClosingBrackets.put('(', ')');
        openingToClosingBrackets.put('[', ']');
        openingToClosingBrackets.put('{', '}');
        openingToClosingBrackets.put('<', '>');

        Deque<Character> bracketsInExpression = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            if (openingToClosingBrackets.containsKey(expression.charAt(i))) { // текущий символ является открывающей скобкой
                bracketsInExpression.addLast(expression.charAt(i));
            } else if (openingToClosingBrackets.containsValue(expression.charAt(i))) { // текущий символ является закрывающей скобкой
                if (bracketsInExpression.isEmpty()) return false;
                else if (expression.charAt(i) != openingToClosingBrackets.get(bracketsInExpression.getLast())) return false;

                bracketsInExpression.removeLast();
            }
        }

        return bracketsInExpression.isEmpty();
    }

    static void printResult(String expression) {
        System.out.println(String.format("%s; %s", expression, areBracketsPaired(expression) ? "true" : "false"));
    }
}
