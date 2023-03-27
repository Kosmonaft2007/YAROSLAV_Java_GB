package pojo.Specification;
/*
класс, описание параметров/характеристик видеокарты
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

		if (!Objects.equals(brand, that.brand)) return false;
		if (!Objects.equals(model, that.model)) return false;
		if (!Objects.equals(adapterType, that.adapterType)) return false;
		if (!Objects.equals(ramSize, that.ramSize)) return false;
		return Objects.equals(ramType, that.ramType);
	}

	@Override
	public int hashCode() {
		int result = brand != null ? brand.hashCode() : 0;
		result = 31 * result + (model != null ? model.hashCode() : 0);
		result = 31 * result + (adapterType != null ? adapterType.hashCode() : 0);
		result = 31 * result + (ramSize != null ? ramSize.hashCode() : 0);
		result = 31 * result + (ramType != null ? ramType.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format("\n[Брэнд: %s, Модель: %s, Тип адаптера: %s, Объем памяти: %s, Тип памяти: %s", brand, model, adapterType, ramSize, ramType);
	}
}



