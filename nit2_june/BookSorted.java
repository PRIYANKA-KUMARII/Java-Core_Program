package com.nit2_june;

import java.util.TreeSet;

public class BookSorted {

	public static void main(String[] args) {
		
		TreeSet<Book> books= new TreeSet<>();
		books.add(new Book("Core Java", "Ravishankar Sir"));
		books.add(new Book("Advance Java", "Janath Bhandari"));
		books.add(new Book("C Language", "Kishore Sir"));
		books.add(new Book("Html", "Sudhakar Sharma"));
		books.add(new Book("Oracle", "Sudhakar Ladda"));
		books.forEach(System.out::println);

	}

}
