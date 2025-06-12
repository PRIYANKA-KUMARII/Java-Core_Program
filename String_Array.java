package StreamAPI;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class String_Array {
	public static void main(String[] args) {
		String[] names= {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		Set<String> collect = Arrays.stream(names).filter(str->str.startsWith("A")).collect(Collectors.toSet());
		System.out.println(collect);
		
	}
}
