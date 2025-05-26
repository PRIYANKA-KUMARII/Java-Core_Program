package predicate.java.Demo;
import java.util.Scanner;
import java.util.function.Consumer;
public class ValueModifier {
	
	public static void modifyValue(int value, Consumer<Integer> m) {
	m.accept(value);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
	       
				  Consumer<Integer> dv=n->System.out.println("After doubling the value: "+(n*2));
				  Consumer<Integer> add=n->System.out.println("After incrementing the value by 3: "+(n+3));
				  Consumer<Integer> squaring =n->System.out.println("After aquaring the value by 64:"+(n*n));		  
				  modifyValue(num,dv);
				  modifyValue(num,add);
				  modifyValue(num,squaring);
	}
	
}
