package test;
import java.util.Scanner;
import java.util.function.Function;
public class FunctionApplier {
	public static int applyFunction(int value, Function<Integer, Integer>p) {
		return p.apply(value);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int inputValue=10;
		int increment=5;
		int decrement=15;
		int factor=5;
		Function<Integer, Integer>add=x->x+increment;
		Function<Integer, Integer>multi=x->x*factor;
		Function<Integer, Integer>sub=x->x-decrement;
		
		int addResult=applyFunction(inputValue,add);
		System.out.println("After adding " +increment+":+addResult");
		int multiResult=applyFunction(addResult,multi);
		System.out.println("After multi by "+factor+":"+multiResult);
		int subResult=applyFunction(multiResult,sub);
		System.out.println("After sub by"+decrement+":"+subResult);
		
	}

}
