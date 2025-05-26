package test;
import java.util.Scanner;
public class DivisionExample {
	public static int  performDivision (int Divided , int Divisor) {
		if(Divisor==0)
			throw new ArithmeticException("Divisor is Zero:");
		return Divided/Divisor;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter dividend:");
		int Divided=sc.nextInt();
		System.out.println("Enter divisor:");
		int Divisor=sc.nextInt();  
		{
			try {
				int result=performDivision(Divided, Divisor);
			System.out.println("Result Division:"+result);
			}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught:"+e.getMessage());
			sc.close();
				
			}
		
			
		}
	}
		
}
