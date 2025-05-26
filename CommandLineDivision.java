package HandlingArrayException;

public class CommandLineDivision {
	public static void main(String [] args) {
	try
	{
		if(args.length !=2) {
			throw new  IllegalArgumentException("Exactly two arguments are required.");
		}
		int dividend;
		int divisior;
		try {
			dividend= Integer.parseInt(args[0]);
			divisior= Integer.parseInt(args[1]);
			try {
				int result=dividend/divisior;
				System.out.println("Result: "+result);
			}catch (ArithmeticException e) {
				System.out.println("Errror :Cannot divide by Zero.");
			}
//			catch(NumberFormatException f) {
//				throw new IllegalArgumentException("Both arguments must be valid integers.");
			finally {
				System.out.println("Division operation completed.");
			}
		}catch(NumberFormatException f) {
			throw new IllegalArgumentException("Both argumnets must be valid integer.");
		}
	}catch (IllegalArgumentException e) {
		System.out.println("Input Error:"+e.getMessage());
		System.out.println("Division operation completed.");
	}
	}
}

			
		
	

