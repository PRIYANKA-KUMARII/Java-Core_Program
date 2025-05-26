package  test;
import java.util.Scanner;
import java.util.function.Predicate;
public class CalculationLogic {
	public static boolean testPrediacte(int num, Predicate<Integer> p) {
		return p.test(num);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int number= sc.nextInt();
		Predicate<Integer> isEven= num->num%2==0;
		Predicate<Integer>isGreater=num->num>10;
		Predicate<Integer>isPrime=num->{
			int c=0;
			for(int i=1; i<num; i++) {
				if(num%i==0)c++;
			}
			return c==2;
		};
		System.out.println(number +"is even:"+testPrediacte(number, isEven));
		System.out.println(number +"is greater than 10:"+testPrediacte(number, isGreater));
		System.out.println(number +"is prime :"+testPrediacte(number, isPrime));
		
		}
	
}


	