package final_task;

import final_task.Laptop;
import final_task.Specification.*;

import java.util.*;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class Main {

    private static Map<Integer, String> userInput() {
        Map<Integer, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую нужной категории и введите нужный параметр: \n" +
                "1 - Брэнд\n" +
                "2 - Количество ядер процессора\n" +
                "3 - Размер оперативной памяти\n" +
                "4 - Объем накопителя\n" +
                "5 - Размер дисплея\n" +
                "0 - Завершить выбор значений фильтра\n" +
                ">>> ");
        int input = scanner.nextInt();

        while (input != 0) {
            if (input == 1) {
                System.out.println("Введите брэнд ноутбука: ");
                String brand = new Scanner(System.in).nextLine();
                map.put(1, brand);
            } else if (input == 2) {
                System.out.println("Введите количество ядер процессора: ");
                String coreAmount = new Scanner(System.in).nextLine();
                map.put(2, coreAmount);
            } else if (input == 3) {
                System.out.println("Введите размер оперативной памяти: ");
                String ramSize = new Scanner(System.in).nextLine();
                map.put(3, ramSize);
            } else if (input == 4) {
                System.out.println("Введите объем накопителя: ");
                String storageCapacity = new Scanner(System.in).nextLine();
                map.put(4, storageCapacity);
            } else if (input == 5) {
                System.out.println("Введите размер дисплея: ");
                String screenDiagonal = new Scanner(System.in).nextLine();
                map.put(5, screenDiagonal);
            } else {
                System.out.println("Некорректное значение, повторите ввод.");
            }
            System.out.println("Введите цифру, соответствующую нужной категории и введите нужный параметр, либо 0 для заверщения: \n" +
                    "1 - Брэнд\n" +
                    "2 - Количество ядер процессора\n" +
                    "3 - Размер оперативной памяти\n" +
                    "4 - Объем накопителя\n" +
                    "5 - Размер дисплея\n" +
                    "0 - Завершить выбор значений фильтра\n");
            input = scanner.nextInt();
        }
        scanner.close();
        return map;
    }


    private static void filterParametr(Map<Integer, String> map, Set<Laptop> set) {

    }

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        Laptop laptopASUS1 = new Laptop("ASUS", "Vivo", "Windows 11",
                new Description(new Processor("Intel", "i9", "x64", 8, 3200),
                        new Ram("Crucial", "DDR3L", 16, 2400),
                        new Storage("Samsung", "SSD", 512),
                        new Display(15, "4K", "IPS"),
                        new VideoAdapter("AMD", "Radion", "SMA", 2, "DDR3"),
                        new Communication(true, true, false, false, true)),
                "Taiwan");

        Laptop laptopASUS2 = new Laptop("ASUS", "Vivo", "Windows 11",
                new Description(new Processor("AMD", "Ryzen 7", "x64", 8, 2800),
                        new Ram("Samsung", "DDR4L", 16, 3200),
                        new Storage("Samsung", "SSD", 1024),
                        new Display(13, "FHD", "OLED"),
                        new VideoAdapter("AMD", "Radion", "SMA", 2, "DDR3"),
                        new Communication(true, true, false, true, true)),
                "USA");

        Laptop laptopAPPLE1 = new Laptop("Apple", "Macbook Pro", "Mac OS",
                new Description(new Processor("Apple", "M1", "x64", 8, 3200),
                        new Ram("Samsung", "DDR4L", 16, 3200),
                        new Storage("Samsung", "SSD", 256),
                        new Display(15, "4K", "Retina"),
                        new VideoAdapter("Apple", "Graphic", "SMA", 4, ""),
                        new Communication(true, true, false, true, true)),
                "China");

        Laptop laptopLenovo = new Laptop("HP", "Victus", "Windows 10",
                new Description(new Processor("AMD", "Ryzen 5", "x64", 8, 2600),
                        new Ram("Crucial", "DDR3L", 16, 3200),
                        new Storage("Samsung", "SSD", 512),
                        new Display(14, "4K", "OLED"),
                        new VideoAdapter("NVIDIA", "GeForce RTX 3050", "External", 4, ""),
                        new Communication(true, true, false, false, true)),
                "China");

        laptops.add(laptopASUS1);
        laptops.add(laptopASUS2);
        laptops.add(laptopAPPLE1);
        laptops.add(laptopLenovo);

        Map<Integer, String> map = userInput();

        System.out.println(map);

//        System.out.println(laptops);
    }
}
