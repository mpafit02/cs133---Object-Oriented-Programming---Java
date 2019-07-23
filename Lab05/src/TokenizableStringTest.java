
public class TokenizableStringTest {

	public static void main(String[] args) {
		TokenizableString str = new TokenizableString("   Hello world how are         you my friend");
		str.Split();
		System.out.println(str);

	}

}
