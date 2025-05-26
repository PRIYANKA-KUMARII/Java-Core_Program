package HandlingArithmeticException;

import java.util.Scanner;

public class DivisionExamples {
	public static int performDivision(int dividend, int divisor) {
		if (divisor == 0)
		{
			throw new ArithmeticException("Divison is zero:");
		}
		return dividend / divisor;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  dividend:");
		int divided = sc.nextInt();
		System.out.println("Enter divisor:");
		int division = sc.nextInt();
		
		try {
			int result = performDivision(divided, division);
			System.out.println("Result Division:" + result);
		} 
		catch (ArithmeticException e) {
			System.out.println(" ArithmeticException caught :"+e.getMessage()+" dividend="+divided+"divisor"+division );
			e.printStackTrace();
		}

	}
}
