
package COVID_19_Vaccine;
public class isDoseBooking {
	private boolean isBooked;
	public void bookDose() {
	if(! isDoseBooked()) {
		isBooked= true;
	}else {
		throw new RuntimeException("Dose is already booked");
	
	}
	
	}
	public boolean isDoseBooked() {
		return isBooked;
		
	}
// DoseBooking(boolean booked) {
//		this.booked=false;
//	}
//	public synchronized void bookDose() {
//		if(booked) {
//			throw new RuntimeException("Dose already booked.");
//		}
//		booked= true;
//		System.out.println("Dose successfully booked by "+Thread.currentThread().getName());
//		
//		}
//	public boolean isDoseBooked() {
//		return booked;
//		
//	}
//	

}
