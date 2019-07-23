
public class MyClass {
	public static void main(String[] args) throws Exception {
		Birds[] table;
		table = new Birds[args.length];

		for (int i = 0; i < args.length; i++) {
			try {
				table[i] = (Birds) Class.forName(args[i]).newInstance();
				table[i].describe();
			} catch (Exception e) {
				System.out.println("Family of Birds: I am a different Bird");
			}
		}
	}
}
