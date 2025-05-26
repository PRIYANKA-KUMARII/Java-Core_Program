package Collection_java;
import java.util.Scanner;
	public class FirstLastSum {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.print("Enter elements: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        if (n >= 2) {
	            int sum = arr[0] + arr[n - 1];
	            System.out.println("Output as: " + sum);
	        } else {
	            System.out.println("Array must contain at least two elements.");
	        }
	        sc.close();
	    }
	}

