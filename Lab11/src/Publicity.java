
public class Publicity extends Mail {

	public Publicity(double weight, boolean express, String destination) {
		super(weight, express, destination);
	}

	public double normalPostageRate() {
		this.setPrice(5.0 * this.getWeight());
		return this.getPrice();
	}
}
