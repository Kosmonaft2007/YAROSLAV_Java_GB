

// import java.util.Scanner;


class Lessons2_1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] mas = new int [n];
        double[] mas = {0.22, 0.4, 0.92, 1.5, 1.99, 4.5};
        int Max = 0;
        int Min = 0;
        System.out.println ("\n" + "Pезультат:");
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > mas[Max]) {
                Max = i;
            } else if (mas[i] < mas[Min]) {
                Min = i;
            }
        }
        System.out.println("Максимальное значение  " +  mas[Max] + "\n" + "Минимальное значение  " + mas[Min]);
    }
}
/*
Задание на «разворот» массива. Нужно перевернуть массив и записать его в обратном порядке.
 */
class Lessons2_2 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] mas = new int [n];
        int [] mas = {2,4,5,7,8};
        System.out.println ("Заданая последовательность:");
//        for (int i = 0; i < mas.length; i++){
//            System.out.print ( mas[i] + " ");
//        }
        System.out.println ("\n" + "Pезультат:");
        for (int i = mas.length - 1; i >= 0 ; i--)

            System.out.print ( mas[i]+ "\s");
    }
}

/*
Найти сумму элементов массива, лежащих между максимальным и минимальным по значению элементами
 */
class Lessons2_3 {
    public static void main(String[] args) {
        int [] mas = {2, 4, 9, 1, 3, 7};
        int Max = 0;
        int Min = 0;
        int sum = 0;
        System.out.println ("\n" + "Pезультат:");
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > mas[Max]) {
                Max = i;
            } else if (mas[i] < mas[Min]) {
                Min = i;
            }
        }
        System.out.println("Максимальное значение  " +  mas[Max] + "\n" + "Минимальное значение  " + mas[Min]);

        for (int i = 0; i < mas.length; i++) {
             sum += mas[i];
        }
        System.out.println("Pезультат Sum:  " + (sum - mas[Max] - mas[Min]));
    }
}

/*
 *Найти среднее арифметическое среди всех элементов массива.
 */
class Lessons2_4 {
    public static void main(String[] args) {
        int [] mas = {5, 5, 2};
        double sum = 0;
        double res = 0;

        for (int i = 1; i < mas.length; i++){

        }

        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
            res = sum /  mas.length;
        }
        System.out.println("Pезультат:  " + res);
    }
}