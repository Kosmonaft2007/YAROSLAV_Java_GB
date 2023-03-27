/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */


package sem3;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Марс");
        list.add("Земля");
        list.add("Венера");
        list.add("Земля");
        list.add("Плутон");
        list.add("Земля");
        list.add("Юпитер");
        list.add("Юпитер");
        list.add("Юпитер");
        list.add("Уран");
        list.add("Марс");
        list.add("Марс");
        list.add("Марс");
        list.add("Земля");
        list.add("Сатурн");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });


        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            String str = list.get(i);
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                System.out.println(str + " " + count);
                count = 1;
            }
        }
        System.out.println(list.get(list.size() - 1) + " " + count);



        /*
            Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
        */

//        Set<String> set = new HashSet<>(list);
//        System.out.print(set);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}



