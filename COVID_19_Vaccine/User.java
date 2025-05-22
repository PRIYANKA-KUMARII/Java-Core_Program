package COVID_19_Vaccine;

public class User {
	private String name;
	private VaccineEligibility eligibility;
//	private User doseBooking;
	private  DoseBooking;
	public User(String name, int age, boolean hasHealthCondition, ) {
		this.name= name;
		this.eligibility= new VaccineEligibility(age, hasHealthCondition);
		this.doseBooking=new DoseBooking(hasHealthCondition);
	}
	public boolean isEligible() {
		return eligibility.isEligible();
		}
	public void bookDose() {
		if(!isEligible()) {
			throw new RuntimeException("You are not eligible for the vaccine.");	
		}
		return.doseBooking.bookDose();
	}

public String getName() {
	return name;
}
}