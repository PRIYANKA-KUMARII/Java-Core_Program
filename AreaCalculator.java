package HandlingArithmeticException;

import java.util.Scanner;

public class AreaCalculator {
	public static double AreaCalculator1(double length, double width) {
		if (length < 0 || width < 0) {
			throw new IllegalArgumentException("Dimensions must be positive: length" + length + "width" + width);
		}
		return (width * length);
	}

public static void main(String [] args) {
Scanner sc= new Scanner(System.in);
	System.out.println("Enter length of rectangle:");
	double length=sc.nextDouble();
	System.out.println("Enter width of rectangle");
	double width= sc.nextDouble(); 
	try {
		double result=AreaCalculator1(length,width);
		System.out.println("ResultAreaCalculator:"+result);
	}
	catch(IllegalArgumentException e)
	{
		e.printStackTrace();
	}
	
}
}