package Exceptional_Handling;

import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter a string to convert to an integer:");

			int c=sc.nextInt();
			
			
		}catch (Exception e) {
		  // e.printStackTrace();
			System.out.println(e.toString());
		}finally {
			System.out.println("123");
		}
		}
}
	