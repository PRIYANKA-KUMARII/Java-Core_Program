package com.nit.stack;

import java.util.Stack;

public class Stack2 {
	public static void main(String [] args) {
		 Stack<Integer>s= new Stack<>();
		 s.add(10);
		 s.add(20);
		 s.forEach(x->System.out.println(x));
		 Stack<String>s1=new Stack<>();
		 s1.add("Java");
		 s1.add("is");
		 s1.add("programming");
		 s1.add("language");
		 s1.forEach(x->System.out.println(x));
		 Stack<Character>s2=new Stack<>();
		 s2.add('A');
		 s2.add('B');
		 s2.forEach(x->System.out.println(x));
		Stack<Double>s3= new Stack<>();
		s3.add(10.5);
		s3.add(30.5);
		s3.forEach(x->System.out.println(x));
		 
	}

}
