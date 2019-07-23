
public class Employee {
	private String name = "NoName";

	public String getName() {
		return name;
	}
}

class HourlyEmployee extends Employee {
	private String name = "Kostas";

	public void foo() {
		System.out.println(getName());
	}

}
