package predicate.java.Demo;
import java.util.function.Supplier;
import java.util.Random;
class main{
public static int generateRandomNumber (int min, int max) {
	Supplier<Integer>randomNum= ()->{
		Random randomNumber = new Random();
		return randomNumber.nextInt(min, max);
	};
	return randomNum.get();
}
public static void main(String [] args) {
	int n1= 10, n2=20;
	System.out.println(main.generateRandomNumber(n1, n2));
}
}


