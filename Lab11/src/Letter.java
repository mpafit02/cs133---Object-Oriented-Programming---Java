
public class Letter extends Mail {

	private String format;

	public Letter() {
		format = "";
	}

	public Letter(double weight, boolean express, String destination, String format) {
		super(weight, express, destination);
		this.format = format;
	}

	public String getFormat() {
		return format;
	}

	public boolean valid() {
		return (format.equals("A4") || format.equals("A3")) && super.valid();
	}

	public double normalPostageRate() {
		double basePrice = 0;
		if (format.equals("A4")) {
			basePrice = 2.5;
		} else if (format.equals("A3")) {
			basePrice = 3.5;
		}
		this.setPrice(basePrice + 1.0 + 0.01*super.getWeight());
		return this.getPrice();
	}

	public String toString() {
		return super.toString() + "Letter [format=" + format + "]";
	}
}
