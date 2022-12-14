package final_task.Specification;

import java.util.Objects;

/*
описание наличие модулей отечающих за коммуникации
*/
public class Communication{
	private boolean bluetooth;
	private boolean wifi;
	private boolean internalModem;
	private boolean ethernetPort;
	private boolean usbPort;

	public Communication(boolean bluetooth, boolean wifi, boolean internalModem, boolean ethernetPort, boolean usbPort) {
		this.bluetooth = bluetooth;
		this.wifi = wifi;
		this.internalModem = internalModem;
		this.ethernetPort = ethernetPort;
		this.usbPort = usbPort;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isInternalModem() {
		return internalModem;
	}

	public void setInternalModem(boolean internalModem) {
		this.internalModem = internalModem;
	}

	public boolean isEthernetPort() {
		return ethernetPort;
	}

	public void setEthernetPort(boolean ethernetPort) {
		this.ethernetPort = ethernetPort;
	}

	public boolean isUsbPort() {
		return usbPort;
	}

	public void setUsbPort(boolean usbPort) {
		this.usbPort = usbPort;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Communication that = (Communication) o;
		return bluetooth == that.bluetooth && wifi == that.wifi && internalModem == that.internalModem && ethernetPort == that.ethernetPort && usbPort == that.usbPort;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bluetooth, wifi, internalModem, ethernetPort, usbPort);
	}

	@Override
	public String toString() {
		return String.format("\n[Bluetooth: %s, WiFi: %s, Модем: %s, Сетевой порт: %s, USB-порт: %s]", bluetooth, wifi, internalModem, ethernetPort, usbPort);
	}
}



