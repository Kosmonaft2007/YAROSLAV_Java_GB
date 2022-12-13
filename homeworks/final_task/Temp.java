import java.util.*;
import java.util.function.Predicate;

public class Temp{
	
	/*
	метод на вход принимает множество (Set) и функциональный интерфейс (Predicate), типизированный Laptop
	*/
	private static void laptopFilter(Set<Laptop> set, Predicate<Laptop> prd) {
		
		Iterator<Laptop> value = set.iterator();
		
        	while (value.hasNext()) {
           		if (prd.test(value.next())) {	// сортируем по условию заданному при вызове метода
				set.remove(value.next());	// удаляем элемент из множества
			}
		}
	}
	
	/*
	метод взаимодействия с пользователем
	в зависимости от параметров ввода происходит необходимая фильтрация 
	*/
	private static void userInput(Set<Laptop> set) {
		//LaptopFilter lf = new LaptopFilter();
		Scanner scan = new Scanner(System.in);
        	/*System.out.println("Введите цифру, соответствующую нужной категории и введите нужный параметр: \n" +
                "1 - Брэнд\n" +
                "2 - Количество ядер процессора\n" +
                "3 - Размер оперативной памяти\n" +
                "4 - Объем накопителя\n" +
                "5 - Размер дисплея\n" +
                "0 - Завершить выбор значений фильтра\n" +
                ">>> ");*/
        	int input = 1;

       //while (input != 0) {
	   	System.out.println("Введите цифру, соответствующую нужной категории и введите нужный параметр, либо 0 для заверщения: \n" +
                    "1 - Брэнд\n" +
                    "2 - Количество ядер процессора\n" +
                    "3 - Размер оперативной памяти\n" +
                    "4 - Объем накопителя\n" +
                    "5 - Размер дисплея\n" +
                    "0 - Завершить выбор значений фильтра\n");
	   	//input = scan.nextInt();
            if (input == 1) {
                System.out.println("Введите брэнд ноутбука: ");
                int storageCapacity = scan.nextInt();
			laptopFilter(set, laptop -> laptop.getStorageCapacity() >= storageCapacity);
            } /*else if (input == 2) {
                System.out.println("Введите количество ядер процессора: ");
                int coreAmount = new Scanner(System.in).nextInt();
                lf.laptopFilter(set);
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
            } */else {
                System.out.println("Некорректное значение, повторите ввод.");
            }
            /*System.out.println("Введите цифру, соответствующую нужной категории и введите нужный параметр, либо 0 для заверщения: \n" +
                    "1 - Брэнд\n" +
                    "2 - Количество ядер процессора\n" +
                    "3 - Размер оперативной памяти\n" +
                    "4 - Объем накопителя\n" +
                    "5 - Размер дисплея\n" +
                    "0 - Завершить выбор значений фильтра\n");*/
            	//input = scan.nextInt();
		
        scan.close();
	System.out.println(set);
	}

    public static void main(String args[]){
	
	Set<Laptop> laptopSet = new LinkedHashSet();
	Laptop laptop1 = new Laptop("ASUS", "AMD", 6, 8, 256, 4, 13);
	Laptop laptop2 = new Laptop("HP", "Intel", 8, 16, 512, 8, 15);
	Laptop laptop3 = new Laptop("Apple", "Apple M1", 8, 16, 512, 8, 14);
	Laptop laptop4 = new Laptop("Lenovo", "Intel i5", 8, 8, 256, 4, 13);
	
	laptopSet.add(laptop1);
       laptopSet.add(laptop2);
	laptopSet.add(laptop3);
	laptopSet.add(laptop4);
	
	userInput(laptopSet);
	
    }
}
/* 
класс, описание ноутбука
@laptopBrand - Брэнд
@processorModel - модель процессора
@processorCoreAmount - количество ядер процессора
@RAMSize - размер оперативной памяти
@storageCapacity - объем накопителя
@videoAdapterRAM - размер памяти видеокарты
@screenDiagonal - диагональ экрана
*/
class Laptop {
	private String laptopBrand;
	private String processorModel;
	private int processorCoreAmount;
	private int RAMSize;
	private int storageCapacity;
	private int videoAdapterRAM;
	private int screenDiagonal;
	
	public Laptop(String laptopBrand, String processorModel, int processorCoreAmount, int RAMSize, int storageCapacity, int videoAdapterRAM, int screenDiagonal) {
		this.laptopBrand = laptopBrand;
		this.processorModel = processorModel;
		this.processorCoreAmount = processorCoreAmount;
		this.RAMSize = RAMSize;
		this.storageCapacity = storageCapacity;
		this.videoAdapterRAM = videoAdapterRAM;
		this.screenDiagonal = screenDiagonal;
	}
	
	public String getlaptopBrand() {
		return laptopBrand;
	}
	
	public int getStorageCapacity(){
		return storageCapacity;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Laptop laptop = (Laptop) o;
		return Objects.equals(laptop, laptop.laptopBrand) && Objects.equals(processorModel, laptop.processorModel) && 			Objects.equals(processorCoreAmount, laptop.processorCoreAmount) && Objects.equals(RAMSize, laptop.RAMSize) && 			Objects.equals(storageCapacity, laptop.storageCapacity) && Objects.equals(videoAdapterRAM, laptop.videoAdapterRAM) && 			Objects.equals(screenDiagonal, laptop.screenDiagonal);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(laptopBrand, processorModel, processorCoreAmount, RAMSize, storageCapacity, videoAdapterRAM, screenDiagonal);
	}
	
	@Override
	public String toString() {
		return String.format("\nБрэнд: %s\nМодель процессора: %s Количество ядер: %d\nОперативная память: %d\nОбъем накопителя: %d\nПамять видеокарты: %d\nДиагональ экрана: %d\n", laptopBrand, processorModel, processorCoreAmount, RAMSize, storageCapacity, videoAdapterRAM, screenDiagonal);
	}
	
}

/*
класс, реализует единственный метод, который выполняет фильтрацию значений
*/
class LaptopFilter{
	
	/*
	метод на вход принимает множество (Set) и функциональный интерфейс (Predicate), типизированный Laptop
	*/
	void laptopFilter(Set<Laptop> set, Predicate<Laptop> prd) {
		
		for (Laptop laptop : set){	// проходим по всем элементам множества
			if (prd.test(laptop)) {	// сортируем по условию заданному при вызове метода
				set.remove(laptop);	// удаляем элемент из множества
			}
		}
	}
}