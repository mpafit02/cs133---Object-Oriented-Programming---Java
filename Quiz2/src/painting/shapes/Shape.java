package painting.shapes;

public abstract class Shape {
	String shapeName;
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}

	protected abstract double area();
	
	public String toString() {
		return shapeName;
	}

}
