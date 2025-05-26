package test;
public class ThrowableMethod {
	public static void main(String[] args) {
		try
		{
			throw new ArithmeticException("Divide by zero:");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("--------------------");
			e.printStackTrace();
			System.out.println("-------------");
			System.out.println(e.toString());
			
		}
	}

}
