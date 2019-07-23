
public class Mail {

	private double price;
	private double weight;
	private boolean express;
	private String destination;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isExpress() {
		return express;
	}

	public void setExpress(boolean express) {
		this.express = express;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Mail() {
		weight = 0;
		express = false;
		destination = "";
		price = 0;
	}

	public Mail(double weight) {
		this();
		this.weight = weight;
	}

	public Mail(double weight, boolean express) {
		this(weight);
		this.express = express;
	}

	public Mail(double weight, boolean express, String destination) {
		this(weight, express);
		this.destination = destination;
	}

	public double normalPostageRate() {
		return 0;
	}

	public String toString() {
		return "Mail [price=" + price + ", weight=" + weight + ", express=" + express + ", destination=" + destination
				+ "]";
	}

	public double postageRate() {
		if (!valid()) {
			return 0;
		} else {
			double total = normalPostageRate();
			if (express) {
				total *= 2;
			}
			return total;
		}
	}

	public boolean valid() {
		return destination.length() > 0;
	}

}
