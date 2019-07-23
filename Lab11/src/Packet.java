
public class Packet extends Mail {

	private double volume;

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public Packet(double weight, boolean express, String destination, double volume) {
		super(weight, express, destination);
		this.volume = volume;
	}

	public boolean valid() {
		return volume <= 50 && super.valid();
	}

	public double normalPostageRate() {
		this.setPrice(volume * 0.25 + this.getWeight());
		return this.getPrice();
	}

	public String toString() {
		return super.toString() + "Packet [volume=" + volume + "]";
	}
}
