package pojo.Specification;

import java.util.Objects;

/*
класс, описание параметров/характеристик накопителя данных
*/
public class Storage{
	private String brand;
	private String typeStorage;
	private String capacityStorage;

	public Storage(String brand, String typeStorage, String capacityStorage) {
		this.brand = brand;
		this.typeStorage = typeStorage;
		this.capacityStorage = capacityStorage;
	}

	public String getBrand() {
		return brand;
	}

	public String getTypeStorage() {
		return typeStorage;
	}

	public String getCapacityStorage() {
		return capacityStorage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Storage storage = (Storage) o;

		if (!Objects.equals(brand, storage.brand)) return false;
		if (!Objects.equals(typeStorage, storage.typeStorage)) return false;
		return Objects.equals(capacityStorage, storage.capacityStorage);
	}

	@Override
	public int hashCode() {
		int result = brand != null ? brand.hashCode() : 0;
		result = 31 * result + (typeStorage != null ? typeStorage.hashCode() : 0);
		result = 31 * result + (capacityStorage != null ? capacityStorage.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format("\n[Брэнд: %s, Тип накопителя: %s, Объем накопителя: %s]", brand, typeStorage, capacityStorage);
	}
}



