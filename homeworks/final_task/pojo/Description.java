package final_task.pojo;

import final_task.pojo.Specification.*;

import java.util.Objects;

/*
Описание всех параметров/характеристик, которые есть в нашем ноутбуке
*/
public class Description{
	private Processor processor;
	private Ram ram;
	private Storage storage;
	private Display display;
	private VideoAdapter va;

	public Description(Processor processor, Ram ram, Storage storage, Display display, VideoAdapter va) {
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.display = display;
		this.va = va;
			}

	public Processor getProcessor() {
		return processor;
	}

	public Ram getRam() {
		return ram;
	}

	public Storage getStorage() {
		return storage;
	}

	public Display getDisplay() {
		return display;
	}

	public VideoAdapter getVa() {
		return va;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Description that = (Description) o;

		if (!Objects.equals(processor, that.processor)) return false;
		if (!Objects.equals(ram, that.ram)) return false;
		if (!Objects.equals(storage, that.storage)) return false;
		if (!Objects.equals(display, that.display)) return false;
		return Objects.equals(va, that.va);
	}

	@Override
	public int hashCode() {
		int result = processor != null ? processor.hashCode() : 0;
		result = 31 * result + (ram != null ? ram.hashCode() : 0);
		result = 31 * result + (storage != null ? storage.hashCode() : 0);
		result = 31 * result + (display != null ? display.hashCode() : 0);
		result = 31 * result + (va != null ? va.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s", processor, ram, storage, display, va);
	}
}



