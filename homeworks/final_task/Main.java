package final_task;

import final_task.Specification.*;
import org.w3c.dom.ls.LSOutput;

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
        Laptop laptopASUS1 = new Laptop("ASUS", "Vivo", "Windows 11",
                new Description(new Processor("Intel", "i9", "x64", 8, 3200),
                        new Ram("Crucial", "DDR3L", 16, 2400),
                        new Storage("Samsung", "SSD", 512),
                        new Display(15, "4K", "IPS"),
                        new VideoAdapter("AMD", "Radion", "SMA", 16, "DDR3"),
                        new Communication(true, true, false, false, true)),
                "Taiwan");

        Laptop laptopASUS2 = new Laptop("ASUS", "Vivo", "Windows 11",
                new Description(new Processor("AMD", "Ryzen 7", "x64", 8, 2800),
                        new Ram("Samsung", "DDR4L", 16, 3200),
                        new Storage("Samsung", "SSD", 1024),
                        new Display(13, "FHD", "OLED"),
                        new VideoAdapter("AMD", "Radion", "SMA", 16, "DDR3"),
                        new Communication(true, true, false, true, true)),
                "USA");

        System.out.println(laptopASUS1);
        System.out.println(laptopASUS2);
    }
}
