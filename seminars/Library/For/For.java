package Library.For;

import Library.String_Char.String_Char;

public class For {
    public static  void  main(String_Char[] args) {

        for (int i = 0; i < 10; i++)
        {
//            System.out.print(i);
        }
        /*
        int i = 0; производится только один раз
            (0)                                     (1)             (2)             (10)
            i < 10;                                 i < 10          i < 10          i < 10
            System.out.println(i);                  S.o.p(i);       S.o.p(i);       S.o.p(i);
            i++                                     i++             i++             остановится
         */

        for (int i = 0; i < 10; i++)
        {
            for (int k = 0; k < 10; k++) {
//                System.out.print(i + " ");
//                System.out.println(k);
            }
        }

        int k=2;

        for (int i = k; i < 10; i*=2)
        {
            System.out.print(i);
        }

    }
}

/*

--------break и continue
---Команда break мгновенно завершает любой из циклов:

for (int i = 0; i < 15; i++){
    if (i == 9){
        System.out.println("9 найдено");
        break;
    }
    System.out.println("это число " + i);
}
System.out.println("конец программы");

---команда continue мгновенно завершает текущую итерацию:
for (int i = 0; i < 15; i++){
    if (i == 9){
        System.out.println("9 найдено");
        continue;
    }
    System.out.println("это число " + i);
}
System.out.println("конец программы");

 */
