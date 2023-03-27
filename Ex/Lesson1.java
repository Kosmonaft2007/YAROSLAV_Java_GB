package Ex;

import java.util.Scanner;

//   Калькулятор, програмируем в процедурном стиле,


public class Lesson1 {
    public static void main(String[] args){
        double result_operation = 0;//в новых версиях локальные переменные обязательно должны быть инициализированны
        //тип double потому что при делении может получиться 3,333333, а не целое цисло
        System.out.println("Введите операцию");//выводим приглашения в консоль на выбор операции
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деленеи");

        Scanner scan = new Scanner(System.in);//создаем объект scan типа Scanner для ввода данных с консоли
        int operation = scan.nextInt();//считываем номер операции

        System.out.println("Введите первое число");//выводим приглашения в консоль на ввод первого числа
        int num1 = scan.nextInt();//считываем первое число в переменную num1
        System.out.println("Введите второе число");//выводим приглашения в консоль на ввод второго числа
        int num2 = scan.nextInt();//считываем второе число в переменную num2

        if (operation==1){//если выбрали операцию 1
            result_operation = num1 + num2;//складываем два числа и записываем в result_operation
        }else if (operation==2){//если выбрали операцию 2
            result_operation = num1 - num2;//вычитаем два числа и записываем в result_operation
        }else if (operation==3){//если выбрали операцию 3
            result_operation = num1 * num2;//умножаем два числа и записываем в result_operation
        }if (operation==4){//если выбрали операцию 4
            if (num2!=0){//проверяем если второе число НЕ равно нулю, тогда производим деление, иначе ==>смотри там
                result_operation = num1 / num2;//делим два числа и записываем в result_operation
                //(double) явное преобразование - это рано еще:-)
            }else{//==>иначе тут выводим в консоль "На ноль делить нельзя!!!" деление не производим
                System.out.println("На ноль делить нельзя!!!");
            }
        }else{//если ввели при выборе операции другую цифру отличную от 1,2,3,4
            System.out.println("Неизвестная операция");//выводим сообщение
        }
        System.out.println("результат равен: " + result_operation);//выводим результат выбранной операции между двумя числами

    }
}
