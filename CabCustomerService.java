package Collection_java_Customer;

import java.util.ArrayList;
import java.util.List;

public class CabCustomerService {

	List<CabCustomer> list=new ArrayList<>();
	public void addCabCustomer(CabCustomer customer)
	{
		list.add(customer);
	}
	public  boolean isFirstCustomer(CabCustomer customer) {
		
		int count=0;
		for(CabCustomer c : list) {
			if(customer.getPhone()==c.getPhone())
				count++;
		}
		
		if(count==1)
			return true;
		else 
			return false;
	}
	
	
	public double calculateBill(CabCustomer customer) {
		
		if(isFirstCustomer(customer)) {
			return 0;
		}
		else if(customer.getDistance()<=4) {
			return 80;
		}
		else {
			return 80+6*(customer.getDistance()-4);
		}
	}
	
	public void printBill(CabCustomer customer) {
		System.out.println(customer.getCustomerName()+" Please pay your bill of Rs."+calculateBill(customer));
	}
}


