package StreamAPI;

import java.util.Arrays;

public class LengthOfString {
	public static void main(String[] args) {
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		Arrays.stream(words).filter(str-> str.length()>3).forEach(System.out::println);
		
	}

}
