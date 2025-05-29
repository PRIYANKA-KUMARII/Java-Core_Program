package Comparable_29May;

import java.util.Comparator;

public class Customer{
	private Integer Number;
	private String Name;
	private  Double  Bill;
	public Customer(Integer Number, String Name, Double Bill) {
		this.Number=Number;
		this.Name=Name;
		this.Bill=Bill;
	}
	public Integer getNumber() {
		return Number;
	}
	public void setNumber(Integer number) {
		Number = number;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getBill() {
		return Bill;
	}
	public void setBill(Double bill) {
		Bill = bill;
	}
	@Override
	public String toString() {
		return "Customer [Number=" + Number + ", Name=" + Name + ", Bill=" + Bill + "]";
	}
	
}
