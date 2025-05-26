package Collection_java;

import java.util.Scanner;

public class Odd_Number {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= {1, 2, 3, 4, 5,6,7 ,8 ,9,10};
		System.out.println("Even elements:");
		for(int i=0; i<arr.length; i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]+" ");
		}
		}
		System.out.println();
		System.out.println("Odd elements:");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 !=0) {
				System.out.println(arr[i] +" ");
			}
		}
		
	}

}
