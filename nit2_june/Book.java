package com.nit2_june;

public record Book(String name, String author) implements Comparable<Book>{

	@Override
	public int compareTo(Book o) {
		
		return this.name.compareTo(o.name);
	}

	
}
