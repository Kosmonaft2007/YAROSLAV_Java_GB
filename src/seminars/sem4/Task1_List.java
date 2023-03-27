package sem4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1_List {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.print("Введите текст");
            String text = sc.nextLine();
            String[] parts = text.split("~");
//        arrayPrintLine(parts);

            linkedList.add(Integer.parseInt(parts[1]), parts[0]); // здест parts[1] - int
            System.out.println(linkedList);
        }
        sc.close();
    }

}

