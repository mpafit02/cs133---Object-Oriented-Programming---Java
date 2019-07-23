
public class TestRationalNumbers {

	public static void main(String[] args) {
		RationalNumbers rm1 = new RationalNumbers(6,9);
		System.out.println(rm1);
		RationalNumbers rm2 = new RationalNumbers(40,12);
		System.out.println(rm2);
		System.out.println(rm2.getValue());
		System.out.println(rm2.add(rm1));
		System.out.println(rm2.subtract(rm1));
		System.out.println(rm2.multiply(rm1));
		System.out.println(rm2.divide(rm1));
	}

}
