package com.nit28May;

import java.util.HashMap;
import java.util.Scanner;

public class Student_Grade_Book {
	
	public static void main(String[] args) {
		HashMap<String ,String >gradeBook=new HashMap<>();
		  
		 Scanner sc= new Scanner(System.in);
		 boolean flag= true;
		 while(flag) {
		 System.out.println("Student grade book");
		 if(gradeBook.isEmpty()) {
			 System.out.println("No students and grades to display.");
		 }else {
			 gradeBook.forEach((name, grade) ->System.out.println(name+":"+grade));
		 }
		 System.out.println("\nOptions:");
		 System.out.println("1.Add Student Grade");
		 System.out.println("2. Remove Student Grade");
		 System.out.println("3.Exit");
		 System.out.println("Enter your choice.");
		 String choice=sc.nextLine();
		 switch(choice)
		 {
		 case "1":
			 System.out.println("Enter student name:");
			 String name= sc.nextLine();
			 System.out.println("Enter student grade:");
			 String grade= sc.nextLine();
			 gradeBook.putIfAbsent(name, grade);
			 System.out.println("Grade added for student :"+name);
			 break;

		 case "2":
			 if(gradeBook.isEmpty()) {
				 System.out.println("The grade book is empty.");
			 }else {
				 System.out.println("Ente the name of the student to "
				 		+ "remove:");
				 String studentToRemove=sc.nextLine();
				 if(gradeBook.containsKey(studentToRemove)) {
					
					 gradeBook.remove(studentToRemove);
					 System.out.println("Removed grade for student:"+studentToRemove);
				 }
				 else {
					 System.out.println("Student not found in the grade book.");
				 }
			 }
			 break;
		 case "3":
			 System.out.println("Exiting the program.GoodBye!");
			 flag=false;
			 
			 break;
			 default:
				 System.out.println("Invalid choice. Please select a valid option.");
				 break;
		 }
		 
		}
		 
	}
	}
  

