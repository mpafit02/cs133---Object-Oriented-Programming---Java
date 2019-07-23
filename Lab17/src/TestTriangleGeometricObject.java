
public class TestTriangleGeometricObject {

	public static void main(String[] args) {
		TriangleGeometricObject TGO1 = new TriangleGeometricObject("Red", true, 5);
		TriangleGeometricObject TGO2 = new TriangleGeometricObject("Blue", true, 6);
		System.out.println(TGO1.compareTo(TGO2));
	}

}
