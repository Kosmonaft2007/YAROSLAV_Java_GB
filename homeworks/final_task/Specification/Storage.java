package final_task.Specification;

import java.util.Objects;

/*
класс, описание параметров хранилища данных
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
		return capacityStorage == storage.capacityStorage && Objects.equals(brand, storage.brand) && Objects.equals(typeStorage, storage.typeStorage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, typeStorage, capacityStorage);
	}

	@Override
	public String toString() {
		return String.format("\n[Брэнд: %s, Тип накопителя: %s, Объем накопителя: %s]", brand, typeStorage, capacityStorage);
	}
}



