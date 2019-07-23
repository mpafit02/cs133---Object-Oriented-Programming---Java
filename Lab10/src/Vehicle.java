
public class Vehicle {
	private String manufacturer;
	private int cylindres;
	private Person owner;

	public String getManufacturer() {
		return manufacturer;
	}

	public int getCylinders() {
		return cylindres;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(String s) {
		owner.setName(s);
	}

	public void setOwner(Person p) {
		owner = p;
	}

	public void setManufacturer(String m) {
		manufacturer = m;
	}

	public void setCylinders(int c) {
		cylindres = c;
	}

	public void set(Person p, String m, int c) {
		setOwner(p);
		setManufacturer(m);
		setCylinders(c);
	}

	public Vehicle() {
		cylindres = 0;
		manufacturer = null;
		owner = new Person();
	}

	public Vehicle(Person p) {
		this();
		owner = p;
	}

	public Vehicle(String m) {
		this();
		manufacturer = m;
	}

	public Vehicle(String m, Person p) {
		this(m);
		owner = p;
	}

	public Vehicle(String m, int c) {
		this(m);
		cylindres = c;
	}

	public Vehicle(Person p, int c) {
		this(p);
		cylindres = c;
	}

	public Vehicle(Person p, String m) {
		this(p);
		manufacturer = m;
	}

	public Vehicle(Person p, String m, int c) {
		this(p, c);
		manufacturer = m;
	}

	public void writeManufacturer() {
		System.out.println("Manufacturer : " + manufacturer);
	}

	public void writeCylinders() {
		System.out.println("Cylinders : " + cylindres);
	}

	public void writeOwnerName() {
		System.out.println("Owner : " + owner.getName());
	}

	public void writeOutput() {
		writeOwnerName();
		writeManufacturer();
		writeManufacturer();
	}
}
