package Collection_java_Customer;

public class CabCustomer {
private int custId;
private String customerName;
private String pickupLocation;
private String dropLocation;
private int distance;
private int phone;
public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance, int phone ) {
	this.custId=custId;
	this.customerName=customerName;
	this.pickupLocation=pickupLocation;
	this.dropLocation=dropLocation;
	this.distance=distance;
	this.phone=phone;
	
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getPickupLocation() {
	return pickupLocation;
}
public void setPickupLocation(String pickupLocation) {
	this.pickupLocation = pickupLocation;
}
public String getDropLocation() {
	return dropLocation;
}
public void setDropLocation(String dropLocation) {
	this.dropLocation = dropLocation;
}
public int getDistance() {
	return distance;
}
public void setDistance(int distance) {
	this.distance = distance;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}


}
