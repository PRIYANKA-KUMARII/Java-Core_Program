package Collection_java;

import java.util.Scanner;

public class Reverse_Array {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+i+" index Element");
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}	
		System.out.println("\nReverse array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
			
		}	
		
	}
}
