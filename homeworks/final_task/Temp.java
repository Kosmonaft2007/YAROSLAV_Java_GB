import java.util.*;
import java.util.function.Predicate;

public class Temp{
	
	private static void userInput(Set<Laptop> set) {
		LaptopFilter lf = new LaptopFilter();
		
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
			lf.laptopFilter(set, laptop -> laptop.getlaptopBrand().equals(brand));
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
		System.out.println(set);
	}

    public static void main(String args[]){
	Set<Laptop> laptopSet = new HashSet();
	Laptop laptop1 = new Laptop("ASUS", "AMD Ryzen 7", 6, 8, 256, 4, 13);
	Laptop laptop2 = new Laptop("HP", "Intel i7", 8, 16, 512, 8, 15);
	Laptop laptop3 = new Laptop("Apple", "Apple M1", 8, 16, 512, 8, 14);
	Laptop laptop4 = new Laptop("Lenovo", "Intel i5", 8, 8, 256, 4, 13);
	
	laptopSet.add(laptop1);
       laptopSet.add(laptop2);
	laptopSet.add(laptop3);
	laptopSet.add(laptop4);
	
	//System.out.println(laptopSet);
	userInput(laptopSet);
	
	
    }
}

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

class LaptopFilter{
	Set<Laptop> laptopFilter(Set<Laptop> set, Predicate<Laptop> prd) {
		Set<Laptop> laptopAfterFiltering = new HashSet<>();
	
		for (Laptop laptop : set){
			if (!prd.test(laptop)) {
				laptopAfterFiltering.remove(laptop);
			}
		}
		
		return laptopAfterFiltering;
	}
}