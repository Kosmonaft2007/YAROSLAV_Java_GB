package final_task.filters;

import final_task.pojo.Laptop;

import java.util.*;

/*
служебный класс, который содержит два метода для обработки ввода пользователя filteringByUserRequest()
и фильтрация ноутбуков по параметрам, которые запросил пользователь showLaptopByFilteringOptions()
 */
public class LaptopFilter {

    /*
    метод, обрабатывает данные, которые ввел пользователь
     */
    public static Map<String, String> filteringByUserRequest() {
        Map<String, String> filteringOptions = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        label:
        while (true) {
            // заполнение параметров, по которым будет происходить фильтрация ноутбуков
            filteringOptions.putIfAbsent("brand", null);
            filteringOptions.putIfAbsent("processorModel", null);
            filteringOptions.putIfAbsent("coreAmount", null);
            filteringOptions.putIfAbsent("ramSize", null);
            filteringOptions.putIfAbsent("storageCapacity", null);
            filteringOptions.putIfAbsent("storageType", null);
            filteringOptions.putIfAbsent("screenDiagonal", null);

            System.out.println(
                    "\nВведите цифру, требуемой категории фильтра, либо 0 для завершения: \n" +
                            "1 - Брэнд\n" +
                            "2 - Модель процессора\n" +
                            "3 - Количество ядер процессора\n" +
                            "4 - Размер оперативной памяти\n" +
                            "5 - Объем накопителя\n" +
                            "6 - Тип накопителя\n" +
                            "7 - Минимальный размер дисплея\n" +
                            "9 - Завершить выбор значений фильтра\n" +
                            "0 - Сброс всех фильтров\n" +
                            ">>> ");

            String input = scanner.next();
            /*
             в зависимости от значения, которое введет пользователь, выполняется определенное условие
            также будет выполнен повторный запрос, для ввода данных для фильтра
             */
            switch (input) {
                case "1":
                    System.out.print("Введите брэнд ноутбука: ");
                    String brand = new Scanner(System.in).next();
                    filteringOptions.put("brand", brand);
                    break;
                case "2":
                    System.out.print("Введите модель процессора: ");
                    String processorModel = new Scanner(System.in).next();
                    filteringOptions.put("processorModel", processorModel);
                    break;
                case "3":
                    System.out.print("Введите количество ядер процессора: ");
                    String coreAmount = new Scanner(System.in).next();
                    filteringOptions.put("coreAmount", coreAmount);
                    break;
                case "4":
                    System.out.print("Введите размер оперативной памяти: ");
                    String ramSize = new Scanner(System.in).next();
                    filteringOptions.put("ramSize", ramSize);
                    break;
                case "5":
                    System.out.print("Введите объем накопителя: ");
                    String storageCapacity = new Scanner(System.in).next();
                    filteringOptions.put("storageCapacity", storageCapacity);
                    break;
                case "6":
                    System.out.print("Введите тип накопителя: ");
                    String storageType = new Scanner(System.in).next();
                    filteringOptions.put("storageType", storageType);
                    break;
                case "7":
                    System.out.print("Введите размер дисплея: ");
                    String screenDiagonal = new Scanner(System.in).next();
                    filteringOptions.put("screenDiagonal", screenDiagonal);
                    break;
                case "9":
                    System.out.print("Завершение выбора фильтрации.\n");
                    break label;
                case "0":
                    filteringOptions.clear();
                    System.out.print("Успешный сброс всех фильтров.\n");

                    break;
                default:
                    System.out.print("Некорректное значение или фильтр уже установлен, повторите ввод.\n");
                    break;
            }
        }
        scanner.close();
        return filteringOptions;
    }

    /*
    метод, выводит информацию по заданным параметрам фильтра
    в цикле foreach проходим по всем элементам множества Laptop
    и проверяем, подходят ли они по заданным параметрам, если, какой-то из условий if отрабатывает,
    то мы пропускаем интерацию, если не одно из условий не подходит, то добавляем данное значение Laptop в ArrayList
    выводим результат в консоль
     */
    public static void showLaptopByFilteringOptions(Map<String, String> filteringOptions, Set<Laptop> laptopsSet) {
        List<Laptop> laptopsList = new ArrayList<>();

        for (Laptop laptop : laptopsSet) {

            /*
            все проверки однотипные
            первым проверяем, что значение в по указанному ключу не null
            если первое условие верно, проверяем значение,
            если оно не соответствует значению в данном экземпляре класса, то пропускаем текущую итерацию
             */
            String brand = filteringOptions.get("brand");
            if (brand != null && !brand.equals(laptop.getBrand())) {
                continue;
            }
            String processorModel = filteringOptions.get("processorModel");
            if (processorModel != null && !processorModel.equals(laptop.getDesc().getProcessor().getModel())) {
                continue;
            }
            String coreAmount = filteringOptions.get("coreAmount");
            if (coreAmount != null && Integer.parseInt(coreAmount) > Integer.parseInt(laptop.getDesc().getProcessor().getCoresAmount())) {
                continue;
            }
            String ramSize = filteringOptions.get("ramSize");
            if (ramSize != null && Integer.parseInt(ramSize) > Integer.parseInt(laptop.getDesc().getRam().getSizeMemory())) {
                continue;
            }
            String storageCapacity = filteringOptions.get("storageCapacity");
            if (storageCapacity != null && Integer.parseInt(storageCapacity) > Integer.parseInt(laptop.getDesc().getStorage().getCapacityStorage())) {
                continue;
            }
            String storageType = filteringOptions.get("storageType");
            if (storageType != null && !storageType.equals(laptop.getDesc().getStorage().getTypeStorage())) {
                continue;
            }
            String screenDiagonal = filteringOptions.get("screenDiagonal");
            if (screenDiagonal != null && Integer.parseInt(screenDiagonal) <= Integer.parseInt(laptop.getDesc().getDisplay().getScreenDiagonal())) {
                continue;
            }
            laptopsList.add(laptop);
        }
        System.out.println(laptopsList);
    }
}



