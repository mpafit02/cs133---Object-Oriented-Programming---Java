package Thermokipio;

public class RegexTest {

	public static void main(String[] args) {
		String text = "Hello! how.ant'a . - are you . &* 54?kalimera!.Help!!!";
		String[] words = text.split("(\\W)+");//Doulevei gia split ta special characters alla prepei prota na kano split tin .!?
		//String[] words = text.split("\\b");//Doulevei gia split ta special characters alla prepei prota na kano split tin .!?
		//String[] words = text.split("(?<=[\\?\\!\\.]+)");//Doulevei gia split ta special characters alla prepei prota na kano split tin .!?
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

}
