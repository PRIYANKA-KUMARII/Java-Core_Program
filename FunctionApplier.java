package predicate.java.Demo;
import java.util.Scanner;
import java .util.function. Function;
public class FunctionApplier {
	public static int applyFunction(int value, Function<Integer, Integer> F) {
		return F.apply(value);
	}
	public static void main(String[] args) {
		int inputValue=10;
		int increment= 5;
		int factor= 3;
		int decrement= 2;
		Function<Integer, Integer> add= x -> x+increment;
		Function<Integer, Integer>multiply= x-> x*factor;
		Function<Integer, Integer>substact= x-> x-decrement;
	
		int addResult=applyFunction(inputValue, add);
		System.out.println("After adding"+increment +":"+addResult);
		int  multipliedResult= applyFunction(addResult, multiply);
		System.out.println("After multiply by "+factor+":"+multipliedResult);
		int subResult=applyFunction(multipliedResult, substact);
		System.out.println("After subtract by"+ decrement+":"+subResult);
	}

}
