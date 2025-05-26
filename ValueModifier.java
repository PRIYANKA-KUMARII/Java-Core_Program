package test;
import java.util.Scanner;
import java.util.function.Consumer;
public class ValueModifier {
	public static void modifyValue(int value, Consumer<Integer>m ) {
		m.accept(value);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		Consumer<Integer>doublevalue=n->System.out.println("After doubling the value:"+(n*2));
		Consumer<Integer>add=n->System.out.println("After incrementing the value by 3:"+(n*n));
		Consumer<Integer>squaring=n->System.out.println("After squaring the valur by 64:"+(n*n));
		modifyValue(num, doublevalue);
		modifyValue(num, add);
		modifyValue(num, squaring);
		
	}

}
