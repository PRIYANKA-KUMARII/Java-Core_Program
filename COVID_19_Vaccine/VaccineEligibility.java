package COVID_19_Vaccine;

public class VaccineEligibility {
	private int age;
	private boolean hasHealthCondition;
	public VaccineEligibility(int age, boolean hasHealth) {
		this.age= age;
		this.hasHealthCondition=hasHealth;
	}
	public boolean isEligible() {
		
		return age>=18 && (age<60 || hasHealthCondition);
	}

}
