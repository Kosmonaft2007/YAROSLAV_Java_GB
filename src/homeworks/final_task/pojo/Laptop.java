package pojo;

import java.util.Objects;

/*
класс описание ноутбука
*/
public class Laptop {
	private String brand;
	private String model;
	private String os;
	private Description desc;
	private String madeIn;

	public Laptop(String brand, String model, String os, Description desc, String madeIn) {
		this.brand = brand;
		this.model = model;
		this.os = os;
		this.desc = desc;
		this.madeIn = madeIn;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public Description getDesc() {
		return desc;
	}

	public void setDesc(Description desc) {
		this.desc = desc;
	}

	public String getMadeIn() {
		return madeIn;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Laptop laptop = (Laptop) o;
		return Objects.equals(brand, laptop.brand) && Objects.equals(model, laptop.model) && Objects.equals(os, laptop.os) && Objects.equals(desc, laptop.desc) && Objects.equals(madeIn, laptop.madeIn);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, model, os, desc, madeIn);
	}

	@Override
	public String toString() {
		return String.format("\n[Брэнд: %s, Модель: %s, ОС: %s, Страна производитель: %s]\nХарактеристики: %s\n", brand, model, os, madeIn, desc);
	}
}
