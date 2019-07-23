
public class TokenizableString {
	private String str;
	private String[] strArr;
	private int count = 0;
	private int wall = 0;

	public TokenizableString() {
		str = "";
		strArr = new String[str.length()];
	}

	public TokenizableString(String s) {
		str = s;
		strArr = new String[str.length()];
	}

	public void Split() {
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == ' ' && str.charAt(i) == ' ') {
				wall = i + 1;
				str.substring(wall, str.length());
			} else if (str.charAt(i) == ' ') {
				strArr[count] = str.substring(wall, i);
				wall = i + 1;
				count++;
			}
		}
		strArr[count] = str.substring(wall, str.length());
		count++;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < count; i++) {
			str += strArr[i] + "\n";
		}
		return str;
	}

}
