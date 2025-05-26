package test;
import java.util.Scanner;
public class Tryblock {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Main method Started!!");
		Scanner sc1= null;
		try {
			sc=new Scanner(System.in);
			System.out.println("Enter the value of x:");
			int x= sc.nextInt();
			System.out.println("Enter the value of y:");
			int y= sc.nextInt();
			int result= x/y;
			System.out.println("Result is :"+result);
			System.out.println("End of try block");
		}
		catch(Exception e)
		{
			System.out.println("Inside Catch block");
			System.err.println(e);
		}
		System.out.println("Manin method Completed!!!");
		sc.close();
		}
		
	

}
