package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class Negative_Number {
	public static void main(String[] args) {
		Integer[] Number= {-10, -5, 0, 5, 10, 15,-20};
		Arrays.stream(Number).filter(n-> n>0).forEach(System.out::println);
		
		
	}

}
