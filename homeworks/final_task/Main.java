package final_task;

import final_task.filters.LaptopFilter;
import final_task.pojo.*;
import final_task.pojo.Specification.*;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        Laptop laptop1 = new Laptop("ASUS", "Vivo", "Windows 11",
                new Description(new Processor("Intel", "i9", "x64", "8", "3200"),
                        new Ram("Crucial", "DDR3L", "32", "2400"),
                        new Storage("Samsung", "SSD", "512"),
                        new Display("15", "4K", "IPS"),
                        new VideoAdapter("AMD", "Radion", "SMA", "2", "DDR3")),
                "Taiwan");

        Laptop laptop2 = new Laptop("ASUS", "Vivo", "Windows 11",
                new Description(new Processor("AMD", "Ryzen 7", "x64", "8", "2800"),
                        new Ram("Samsung", "DDR4L", "16", "3200"),
                        new Storage("Samsung", "HDD", "1024"),
                        new Display("13", "FHD", "OLED"),
                        new VideoAdapter("AMD", "Radion", "SMA", "2", "DDR3")),
                "USA");

        Laptop laptop3 = new Laptop("Apple", "Macbook Pro", "Mac OS",
                new Description(new Processor("Apple", "M1", "x64", "8", "3200"),
                        new Ram("Samsung", "DDR4L", "16", "3200"),
                        new Storage("Samsung", "SSD", "256"),
                        new Display("15", "4K", "Retina"),
                        new VideoAdapter("Apple", "Graphic", "SMA", "4", "")),
                "USA");

        Laptop laptop4 = new Laptop("HP", "Victus", "Windows 10",
                new Description(new Processor("AMD", "Ryzen 5", "x64", "8", "2600"),
                        new Ram("Crucial", "DDR3L", "8", "3200"),
                        new Storage("Samsung", "SSD", "512"),
                        new Display("14", "4K", "OLED"),
                        new VideoAdapter("NVIDIA", "GeForce RTX 3050", "External", "4", "DDR4")),
                "USA");

        Laptop laptop5 = new Laptop("Lenovo", "IdeaPad", "Windows 10",
                new Description(new Processor("Intel", "i7", "x64", "8", "3000"),
                        new Ram("Crucial", "DDR3L", "4", "3200"),
                        new Storage("Samsung", "SSD", "512"),
                        new Display("14", "4K", "OLED"),
                        new VideoAdapter("NVIDIA", "GeForce RTX 3050", "External", "4", "DDR4")),
                "China");

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);

        Map<String, String> filtred = LaptopFilter.filteringByUserRequest();    // вызываем метод фильтрации по параметрам ввода от пользователя
        LaptopFilter.showLaptopByFilteringOptions(filtred, laptops);    // вызываем метод информации о ноутбуках после фильтрации, в параметры передаем Map фильтров и Set ноутбуков

    }
}
