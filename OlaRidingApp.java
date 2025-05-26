package MultiThreading_29April;
public class OlaRidingApp{
	public static void main(String [] args) {
		
        RideRequest rideRequest = new RideRequest();
        FareCalculation fareCalculation = new FareCalculation();

        try {
        rideRequest.start();
        fareCalculation.start();

        rideRequest.join();

        DriverAssigmnet driverAssignment = new  DriverAssigmnet();
        driverAssignment.start();
        driverAssignment.join();

        LiveTracking liveTracking = new LiveTracking();
        liveTracking.start();
        liveTracking.join();

        PaymentProcessing paymentProcessing = new PaymentProcessing();
        paymentProcessing.start();
        paymentProcessing.join();

        RatingSystem ratingSystem = new RatingSystem();
        ratingSystem.start();
        ratingSystem.join();
        }
        catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	}
		
 class RideRequest extends Thread {
	@Override
	public void run() {
		System.out.println("User requesred a  ride..");
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		
		}
		System.out.println("Searching for nearby drivers...");
	}

}
class DriverAssigmnet extends Thread{
	@Override
	public void run() {
		try {
			 Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Driver found and assigned.");
		}
}

class FareCalculation extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(1500);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println("Estimated fare : 135.75RS.");
		
	}
}
class LiveTracking extends Thread{
	@Override
	public void run () {
		String[] progress= {"20%", "40%", "60%", "80%","100%"};
		for(String p :progress) {
			System.out.println("Updating ride location.......");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Ride Completed.");
		
	}
}
class PaymentProcessing extends Thread{
	@Override
	public void run() {
		try {
			 Thread.sleep(2000);
		}catch(InterruptedException e) {
			 e.printStackTrace();
		}
		System.out.println("Payment successful!");
	}
}
class RatingSystem extends Thread{
	@Override
	public void run() {
		System.out.println("Requesting user rating...");
		try {
			 Thread.sleep(1000);
		} catch(InterruptedException e) {
			 e.printStackTrace();
		}
		System.out.println("User rated the ride: 5 star");
	}
}
