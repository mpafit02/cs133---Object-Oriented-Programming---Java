package Flora;

public class Plant {

	private int age;
	private boolean isAlive;
	
	public Plant() {
		age = 0;
		isAlive = true;
	}
	
	public boolean checkAge() {
		if (age >= 100) {
			isAlive = false;
		}
		return isAlive;
	}
}
