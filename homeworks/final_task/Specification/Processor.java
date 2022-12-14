package final_task.Specification;
import java.util.Objects;

/*
класс, описание параметров процессора
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

	public void setFrequency(short frequency) {
		this.frequency = frequency;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Processor processor = (Processor) o;
		return coresAmount == processor.coresAmount && frequency == processor.frequency && Objects.equals(brand, processor.brand) && Objects.equals(model, processor.model) && Objects.equals(typeArchitecture, processor.typeArchitecture);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, model, typeArchitecture, coresAmount, frequency);
	}

	@Override
	public String toString() {
		return String.format("\n[Брэнд: %s, Модель: %s, Тип архитектуры: %s, Количество ядер: %s, Частота процессора: %s]", brand, model, typeArchitecture, coresAmount, frequency);
	}

}



