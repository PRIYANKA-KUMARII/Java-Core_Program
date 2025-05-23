package Collection_java_Customer;

public class CabCustomerServiceTester {
	public static void main(String [] args) {
		CabCustomer cab= new CabCustomer(101, "John", "Ameerpet", "Kokapet", 3,123465447);
		CabCustomerService service= new CabCustomerService();
		 
		service.addCabCustomer(cab);
		 service.printBill(cab);
		 
		 cab.setCustomerName("Smith");
		 
		 service.addCabCustomer(cab);
		 service.printBill(cab);
		}

}
