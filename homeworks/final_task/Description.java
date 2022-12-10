package final_task;

import final_task.Specification.*;

import java.util.Objects;

/*
Описание всех параметров ноутбука
*/
public class Description{
	private Processor processor;
	private Ram ram;
	private Storage storage;
	private Display display;
	private VideoAdapter va;
	private Communication comm;

	public Description(Processor processor, Ram ram, Storage storage, Display display, VideoAdapter va, Communication comm) {
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.display = display;
		this.va = va;
		this.comm = comm;
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

	public Communication getComm() {
		return comm;
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
		return Objects.equals(processor, that.processor) && Objects.equals(ram, that.ram) && Objects.equals(storage, that.storage) && Objects.equals(display, that.display) && Objects.equals(va, that.va) && Objects.equals(comm, that.comm);
	}

	@Override
	public int hashCode() {
		return Objects.hash(processor, ram, storage, display, va, comm);
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s, %s", processor, ram, storage, display, va, comm);
	}
}



