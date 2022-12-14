package final_task.Specification;

/*
класс, описание параметров видеокарты
*/
import java.util.Objects;

public class VideoAdapter{
	private String brand;
	private String model;
	private String adapterType;
	private String ramSize;
	private String ramType;

	public VideoAdapter(String brand, String model, String adapterType, String ramSize, String ramType) {
		this.brand = brand;
		this.model = model;
		this.adapterType = adapterType;
		this.ramSize = ramSize;
		this.ramType = ramType;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getAdapterType() {
		return adapterType;
	}

	public String getRamSize() {
		return ramSize;
	}

	public String getRamType() {
		return ramType;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		VideoAdapter that = (VideoAdapter) o;
		return ramSize == that.ramSize && Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && Objects.equals(adapterType, that.adapterType) && Objects.equals(ramType, that.ramType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, model, adapterType, ramSize, ramType);
	}

	@Override
	public String toString() {
		return String.format("\n[Брэнд: %s, Модель: %s, Тип адаптера: %s, Объем памяти: %s, Тип памяти: %s", brand, model, adapterType, ramSize, ramType);
	}
}



