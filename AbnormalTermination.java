package test;
import java.util.Scanner;
public class AbnormalTermination {
	public static void main(String [] args) {
		System.out.println("Main Method started..");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x=sc.nextInt();
		System.out.println("Enter the value of y:");
		int y= sc.nextInt();
		int result=x/y;
		System.out.println("Main method ended..");
		sc.close();
		}
}
