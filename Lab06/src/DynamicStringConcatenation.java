public class DynamicStringConcatenation {
	public static void main(String[] args) {
		String result = "";
		for (int i = 0; i < 1e3; i++) {
			StringBuilder tmp = new StringBuilder();
			tmp.append(result);
			tmp.append("some more data");
			result += "some more data";
		}
		System.out.println(result);
		System.out.println(1e6);
	}
}