package final_task.Specification;

import java.util.Objects;

/*
класс, описание параметров оперативной памяти
*/
public class Ram{
	private String brand;
	private String typeMemory;
	private int sizeMemory;
	private int frequencyMemory;

	public Ram(String brand, String typeMemory, int sizeMemory, int frequencyMemory) {
		this.brand = brand;
		this.typeMemory = typeMemory;
		this.sizeMemory = sizeMemory;
		this.frequencyMemory = frequencyMemory;
	}

	public String getBrand() {
		return brand;
	}

	public String getTypeMemory() {
		return typeMemory;
	}

	public int getSizeMemory() {
		return sizeMemory;
	}

	public int getFrequencyMemory() {
		return frequencyMemory;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Ram ram = (Ram) o;
		return sizeMemory == ram.sizeMemory && frequencyMemory == ram.frequencyMemory && Objects.equals(brand, ram.brand) && Objects.equals(typeMemory, ram.typeMemory);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, typeMemory, sizeMemory, frequencyMemory);
	}

	@Override
	public String toString() {
		return String.format("\n[Брэнд: %s, Тип памяти: %s, Объем памяти: %s, Частота памяти: %s]", brand, typeMemory, sizeMemory, frequencyMemory);
	}
}



