package com.nit;

import java.util.Vector;

record Employee(Integer id, String name, Double Salary) {
	
}
public class VectorDemo2 {
	public static void main(String [] args) {
		 Vector<Employee>listOfEmployee= new Vector<>();
		 listOfEmployee.add(new Employee (101,"Priyanka",500000D));
		 listOfEmployee.add(new Employee(102, "Raushan", 600000D));
		 listOfEmployee.add(new Employee(103,"Chandan",70000D));
		 listOfEmployee.add(new Employee(104,"Prity", 80000D));
		 listOfEmployee.forEach(emp->System.out.println(emp));
		 
	}
	

}
