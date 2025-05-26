package Collection_java;

import java.util.Scanner;

public class Searching_Element {
	public static void main(String [] args) {
		int  arr[]= {1,4,3,5,2,6,5} ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter element to search");
		int element= sc.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==element)
			{
				System.out.println("Element found at index : "+ i);
					break;
		}
		
		
	}
	}
}
