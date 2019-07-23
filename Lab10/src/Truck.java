
public class Truck extends Vehicle {
	private double loadCapacity;
	private double towingCapacity;

	public void setLoad(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public void setTow(double towingCapacity) {
		this.towingCapacity = towingCapacity;
	}

	public void set(Person p, String m, int c, double l, double t) {
		super.set(p, m, c);
		setLoad(l);
		setTow(t);
	}

	public Truck() {
		super();
		loadCapacity = 0;
		towingCapacity = 0;
	}

	public Truck(Person p) {
		this();
	}

	public Truck(String m) {
		this();
	}

	public Truck(int c) {
		this();
	}

	public Truck(Person p, String m) {
		this();
	}

	public Truck(Person p, int c) {
		this();
	}

	public Truck(String m, int c) {
		this();
	}

	public Truck(Person p, String m, int c) {
		this();
	}

	public Truck(Person p, String m, int c, double l, double t) {
		loadCapacity = l;
		towingCapacity = t;
	}

	public void writeLoad() {
		System.out.println("Load Capacity: " + loadCapacity);
	}

	public void writeTow() {
		System.out.println("Towing Capacity: " + towingCapacity);
	}
}
