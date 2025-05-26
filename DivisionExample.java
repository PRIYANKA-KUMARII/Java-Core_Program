package HandlingArithmeticException;
import java.util.Scanner;

public class DivisionExample 
{
	public static int performDivision( int dividend, int divisior)
	{
	
		if(divisior==0) 
				throw new ArithmeticException("Divisor is zero:") ;
		return dividend/divisior;
	}
		public static void main(String []args) {
			Scanner sc= new Scanner(System.in);
				System.out.println("Enter dividend:");
				int dividend=sc.nextInt();
				System.out.println("Enter divisor:");
				int divisior=sc.nextInt();
				{
					try {
					int result=performDivision( dividend,  divisior);
							System.out.println("Result Division:"+result);
					}
							catch(ArithmeticException e) {
								System.out.println("ArithmeticException caught:"+e.getMessage());
								sc.close();
							}
								
							}
		}
}
							
				
				
			
				
			