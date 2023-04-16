package Kata.Block_1;

import java.util.Arrays;

public class Ex_1_6_12 {
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole1(roles, textLines));
    }

    public static String printTextPerRole1(String[] roles, String[] textLines) {
//        StringBuilder sb = new StringBuilder();
//        StringBuilder[] parts1 = new StringBuilder[textLines.length];
        String[] parts = new String[textLines.length];
        for (int strR = 0; strR < roles.length; strR++) {
            System.out.println(roles[strR] + ":");
            for (int text = 0; text <= textLines.length - 1; text++) {
//                System.out.println(textLines[text]);
                parts = textLines[text].split("[:]");
                int a = 0;
                if (roles[strR].equals(parts[0])) {
                    textLines[text] = parts[a];
                    a++;
                    System.out.println((text + 1) + ")" + parts[a]);
                }
            }
            System.out.print("\n");
        }
        String pp = null;
        for (String p : parts) {
            pp = p;
        }
        return pp;
    }

//    public static String printTextPerRole2(String[] roles, String[] textLines) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < roles.length; i++) {
//            result.append(roles[i] + ":" + '\n');
//
//            for (int j = 0; j < textLines.length; j++) {
//                if (textLines[j].startsWith(roles[i] + ":")) {
//
//
//                    result.append((textLines[j].replaceFirst(roles[i] + ":", j + 1 + ")")) + "\n");
////                    result.append('\n');
//                }
//
//            }
//        }
//        return result.toString();

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder answer = new StringBuilder();
        for (String role : roles) {
            answer.append(role + ":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    answer.append(i + 1).append(")").append(textLines[i].substring(role.length() + 1)).append("\n");
                }
            }
            answer.append("\n");
        }
        return answer.toString();
    }

}
//    }

