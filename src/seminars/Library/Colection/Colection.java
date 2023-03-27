package Library.Colection;

import java.util.*;

public class Colection {
    public static void main(String[] args) {
        int[] array = new int[15];
//        Colection colection= new ArrayList<>();
        // наследуются ArrayLis,  отColection, основанана на индесах
        ArrayList<String> colection = new ArrayList<>();
        //  .add - добавлять
        colection.add("1"); // добавляет значение по индексу, смещая другие значения вправо (увеличивает размер списка)
        colection.add("2"); //remove
        colection.add("3");
        colection.add("4");
        // .set(2,"5") - перезаписывает индекса 2 элемента на 5
        colection.set(2,"5");
        // .add(1,"9") - добавляет перед за существующим индекса 1 элемента на 9
        colection.add(1,"9");
        // .remove - удалять
        colection.remove("2");

        System.out.println(colection.get(1)+" -  метод get");
        System.out.println(colection);
        
        /*
        пробигаемся по ЛИСТУ
        iterator есть несколько методов
        ---  .hasNext()  проверяет если следующий элемент в колекции
        ---   .next()    возвращает
         */
        Iterator iterator = colection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("");


        // новый for основан на тех же итераторах
        for (Object o: colection) {
            System.out.println(o +" - Foreach");
        }
        //
        for (int i = 0; i < colection.size(); i++) {
            System.out.println(colection.get(i) +" - For");
        }
    }
}
 class ColectionQueue {
     public static void main (String[]args){
        Queue colection  = new PriorityQueue(); //очередь
         colection.offer("1");
         colection.offer("2");
         colection.offer("3");
         colection.offer("4");
         for (int i = 0; i < colection.size(); i++) {
             System.out.println(colection.peek() +" - For"); // .peek - не удаляет элемент
         }
         System.out.println("num of element -" + colection.size() );

         Iterator iterator = colection.iterator();

        while (iterator.hasNext()){
            System.out.println(colection.poll()); // .pool -  удаляет элемент
        }
//         for (int i = 0; i <= colection.size(); i++) {
//             System.out.println(colection.poll() +" - For"); // .pool -  удаляет элемент
//         }
         System.out.println("num of element -" + colection.size() );
     }
 }

class ColectionSte {
    public static void main(String[] args) {
        Set colection = new HashSet(); //  колекция уникальных объетов. В  Set добавляются один раз, повторные добавляться не будут 1 2 3 4
        colection.add("1");
        colection.add("2");
        colection.add("2");
        colection.add("2");
        colection.add("2");
        colection.add("3");
        colection.add("3");
        colection.add("3");
        colection.add("3");
        colection.add("4");
        for (Object o : colection) {
            System.out.println(o);
        }
    }
}
//------------
//class ColectionBook {
//
//    String nameAvtor;
//
//    public Book (String nameAvtor){
//        this.nameAvtor = nameAvtor;
//    }
//
//    @Override
//    public String toString() {
//        return "ColectionBook{" +
//                "nameAvtor='" + nameAvtor + '\'' +
//                '}';
//    }
//}

  class ColectionMAP{


    public static void main(String[] args) {
        Map colection = new HashMap<>(); // ни отчего не наследуется, но относится к колеции. Добавляем по ключу как в библиотеке
        colection.put("1", "Book-1");
//        colection.put("2", new Book ("Book-2"));
        colection.put("3", "Book-3");
        colection.put("4", "Book-4");
        colection.put(new Object(), "Book-5");
        System.out.println(colection.get("3"));

        Set set = colection.entrySet();
        for (Object o: set) {
        System.out.println(o);
        }

    }
}