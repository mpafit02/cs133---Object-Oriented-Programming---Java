interface XX {
	char c = 'A';

	char methodX();
}

class YY implements XX {
	{
		System.out.println(c);
	}

	public char methodX() {
		char c = this.c;
		return ++c;
	}
}

public class MainClass {
	public static void main(String[] args) {
		YY y = new YY();
		System.out.println(y.methodX());
		System.out.println(y.c);
		System.out.println(XX.c);
	}
}