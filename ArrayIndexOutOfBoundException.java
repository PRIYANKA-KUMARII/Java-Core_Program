package Exceptional_Handling;

public class ArrayIndexOutOfBoundException {
	 public static void main(String[] args) {
		 int a[]= new int[2];
		 try {
			   
	            System.out.println("Accessing index 3: " + a[3]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("An ArrayIndexOutOfBoundsException occurred.");
	            System.out.println("Message: " + e.getMessage());
	            System.out.println("String representation: " + e.toString());
	            e.printStackTrace();
	        }
	    }
	}
	