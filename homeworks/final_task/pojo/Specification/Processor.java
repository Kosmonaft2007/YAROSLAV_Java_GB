package final_task.pojo.Specification;

import java.util.Objects;

/*
класс, описание параметров/характеристик процессора
*/
public class Processor{
	private String brand;
	private String model;
	private String typeArchitecture;
	private String coresAmount;
	private String frequency;

	public Processor(String brand, String model, String typeArchitecture, String coresAmount, String frequency) {
		this.brand = brand;
		this.model = model;
		this.typeArchitecture = typeArchitecture;
		this.coresAmount = coresAmount;
		this.frequency = frequency;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getTypeArchitecture() {
		return typeArchitecture;
	}

	public String getCoresAmount() {
		return coresAmount;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Processor processor = (Processor) o;

		if (!Objects.equals(brand, processor.brand)) return false;
		if (!Objects.equals(model, processor.model)) return false;
		if (!Objects.equals(typeArchitecture, processor.typeArchitecture))
			return false;
		if (!Objects.equals(coresAmount, processor.coresAmount))
			return false;
		return Objects.equals(frequency, processor.frequency);
	}

	@Override
	public int hashCode() {
		int result = brand != null ? brand.hashCode() : 0;
		result = 31 * result + (model != null ? model.hashCode() : 0);
		result = 31 * result + (typeArchitecture != null ? typeArchitecture.hashCode() : 0);
		result = 31 * result + (coresAmount != null ? coresAmount.hashCode() : 0);
		result = 31 * result + (frequency != null ? frequency.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format("\n[Брэнд: %s, Модель: %s, Тип архитектуры: %s, Количество ядер: %s, Частота процессора: %s]", brand, model, typeArchitecture, coresAmount, frequency);
	}

}



