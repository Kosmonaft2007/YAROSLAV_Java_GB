package pojo.Specification;

import java.util.Objects;

/*
класс, описание параметров/характеристик оперативной памяти
*/
public class Ram{
	private String brand;
	private String typeMemory;
	private String sizeMemory;
	private String frequencyMemory;

	public Ram(String brand, String typeMemory, String sizeMemory, String frequencyMemory) {
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

	public String getSizeMemory() {
		return sizeMemory;
	}

	public String getFrequencyMemory() {
		return frequencyMemory;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Ram ram = (Ram) o;

		if (!Objects.equals(brand, ram.brand)) return false;
		if (!Objects.equals(typeMemory, ram.typeMemory)) return false;
		if (!Objects.equals(sizeMemory, ram.sizeMemory)) return false;
		return Objects.equals(frequencyMemory, ram.frequencyMemory);
	}

	@Override
	public int hashCode() {
		int result = brand != null ? brand.hashCode() : 0;
		result = 31 * result + (typeMemory != null ? typeMemory.hashCode() : 0);
		result = 31 * result + (sizeMemory != null ? sizeMemory.hashCode() : 0);
		result = 31 * result + (frequencyMemory != null ? frequencyMemory.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format("\n[Брэнд: %s, Тип памяти: %s, Объем памяти: %s, Частота памяти: %s]", brand, typeMemory, sizeMemory, frequencyMemory);
	}
}



