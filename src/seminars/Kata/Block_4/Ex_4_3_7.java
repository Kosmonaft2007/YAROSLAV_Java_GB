package src.seminars.Kata.Block_4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ex_4_3_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum=0;
        try (scan){
            sum+=Double.parseDouble(scan.next());
            scan.next();


/*            while(scan.hasNext()){

//                if(scan.hasNextDouble()){
//                    sum+=Double.parseDouble(scan.next());
//                } else {
//                    scan.next();
//                }
            }*/
//            System.out.printf(Locale.ENGLISH, "%.6f", sum);
//            System.out.printf("%.6f", sum);
//        } catch(Exception e){
        } catch (java.lang.NumberFormatException e) {
            System.out.printf("%.6f", 0.0);
        }
        System.out.printf( "%.6f", sum);
    }


/*//        double d = sc.nextDouble();
        double sum = 0;
        try {
            sum += sc.nextDouble();
        } catch (InputMismatchException e) {
            sc.next();  //вот этот момент, что если не считали число, то дальше проскочили
        }
//        try {
//            d += Double.parseDouble(sc.next());
//        } catch (java.lang.NumberFormatException e) {
//        }
//        System.out.format("%.6f", sum);
      }
        */

}
