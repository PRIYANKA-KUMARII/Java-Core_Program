package StreamAPI;

import java.util.Arrays;

public class Prime_Number {
	public static void main(String[] args) {
		Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		Object[] primeNumbers= Arrays.stream(numbers).filter((num)->Prime_Number.isPrime(num)).toArray();
		System.out.println("Prime Number :"+Arrays.toString(primeNumbers));
	}
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(num);i++)
		{
			if(num %i==0) {
				return false;
			}
			return true;
		}
		return false;
	
	}

}
