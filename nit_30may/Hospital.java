package com.nit_30may;

import java.util.List;

public class Hospital  {
private String hospitalName;
private  int hospitalCode;
List<String>ListOFTreatment;
private String contactPerson;
private int contactNumber;
private String location;
public Hospital(String hospitalName, List<String> listOFTreatment, String contactPerson, int contactNumber,
		String location) {
	super();
	this.hospitalName = hospitalName;
	ListOFTreatment = listOFTreatment;
	this.contactPerson = contactPerson;
	this.contactNumber = contactNumber;
	this.location = location;
}
public String getHospitalName() {
	return hospitalName;
}
public void setHospitalName(String hospitalName) {
	this.hospitalName = hospitalName;
}
public  int getHospitalCode() {
	return hospitalCode;
}
public  void setHospitalCode(int hospitalCode) {
	this.hospitalCode = hospitalCode;
}
public List<String> getListOFTreatment() {
	return ListOFTreatment;
}
public void setListOFTreatment(List<String> listOFTreatment) {
	ListOFTreatment = listOFTreatment;
}
public String getContactPerson() {
	return contactPerson;
}
public void setContactPerson(String contactPerson) {
	this.contactPerson = contactPerson;
}
public int getContactNumber() {
	return contactNumber;
}
public void setContactNumber(int contactNumber) {
	this.contactNumber = contactNumber;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Hospital [hospitalName=" + hospitalName + ", ListOFTreatment=" + ListOFTreatment + ", contactPerson="
			+ contactPerson + ", contactNumber=" + contactNumber + ", location=" + location + "]";
}



	
	

}
