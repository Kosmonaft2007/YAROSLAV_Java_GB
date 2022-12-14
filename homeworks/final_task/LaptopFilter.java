
public class LaptopFilter{
	
	public static Map<String, String> filteringByUserRequest() {
        Map<String, String> filteringOptions= new HashMap<>();
        Scanner scanner = new Scanner(System.in);
	
        while (true) {
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
		int input = scanner.nextInt();
		
            if (input == 1 && !filteringOptions.containsKey("brand")) 
		{
                System.out.print("Введите брэнд ноутбука: ");
                String brand = new Scanner(System.in).next();
                filteringOptions.put("brand", brand);
            } 
		else if (input == 2 && !filteringOptions.containsKey("processorModel")) 
		{
                System.out.print("Введите модель процессора: ");
                String processorModel = new Scanner(System.in).next();
                filteringOptions.put("processorModel", processorModel);
            } 
		else if (input == 3 && !filteringOptions.containsKey("coreAmount"))
		{
		System.out.print("Введите минимальное количество ядер процессора: ");
                String coreAmount = new Scanner(System.in).next();
                filteringOptions.put( "coreAmount", coreAmount);
            } 
		else if (input == 4 && !filteringOptions.containsKey("ramSize"))
		{
                System.out.print("Введите минимальный размер оперативной памяти: ");
                String  ramSize = new Scanner(System.in).next();
                filteringOptions.put("ramSize", ramSize);
            } 
		else if (input == 5 && !filteringOptions.containsKey("storageCapacity"))
		{
                System.out.print("Введите минимальный объем накопителя: ");
                String storageCapacity = new Scanner(System.in).next();
                filteringOptions.put("storageCapacity", storageCapacity);
            } 
		else if (input == 6 && !filteringOptions.containsKey("storageType"))
		{
                System.out.print("Введите тип накопителя: ");
                String storageType = new Scanner(System.in).next();
                filteringOptions.put("storageType", storageType);
            } 
		else if (input == 7 && !filteringOptions.containsKey("screenDiagonal"))
		{
                System.out.print("Введите минимальный размер дисплея: ");
                String screenDiagonal = new Scanner(System.in).next();
                filteringOptions.put("screenDiagonal", screenDiagonal);
            } 
		else if (input == 9)
		{
                System.out.print("Завершение выбора фильтрации.\n");
               break;
            } 
		else if (input == 0) 
		{
		filteringOptions.clear();
                System.out.print("Успешный сброс всех фильтров.\n");
              
            } 
		else
		{
                System.out.print("Некорректное значение или фильтр уже установлен, повторите ввод.");
            }
        }
        scanner.close();
        return filteringOptions;
    }
	
	public static void showLaptopByFilteringOptions(Map<String, String> filteringOptions, Set<Laptop> laptopsSet) {
		List<Laptop> laptopsList = new ArrayList<>();
		
		for (Laptop laptop : laptopsSet) {
			
			String brand = filteringOptions.get("brand");
			if (brand != null && !brand.equals(laptop.getBrand()) {
				continue;
			}
			String processorModel = filteringOptions.get("processorModel");
			if (processorModel != null && !processorModel.equals(laptop.getDesc().getProcessor().getModel()){
				continue;
			}
			String coreAmount = filteringOptions.get("coreAmount");
			if (coreAmount != null && !coreAmount.equals(laptop.getDesc().getProcessor().getCoreAmount()) {
				continue;
			}
			String ramSize = filteringOptions.get("ramSize");
			if (ramSize != null && !ramSize.equals(laptop.getDesc().getRam().getSizeMemory()) {
				continue;
			}
			String storageCapacity = filteringOptions.get("brand");
			if (storageCapacity != null && !storageCapacity.equals(laptop.getDesc().getStorage().getCapacityStorage()) {
				continue;
			}
			String storageType = filteringOptions.get("brand");
			if (storageType != null && !storageType.equals(laptop.getDesc().getStorage().getTypeStorage()) {
				continue;
			}
			String screenDiagonal = filteringOptions.get("brand");
			if (screenDiagonal != null && !screenDiagonal.equals(laptop.getDesc().getDisplay().getScreenDiagonal()) {
				continue;
			}
			laptopsList.add(laptop);
		}
		System.out.println(laptopsList);
	}
}



